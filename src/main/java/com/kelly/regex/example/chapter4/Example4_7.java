package com.kelly.regex.example.chapter4;

import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example4_7 {
	/**
	 * 多租户SQL拦截，并且加上多表连接时的租户ID
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * SELECT m.*
           FROM full_stack_table1 m
           LEFT OUTER
           JOIN full_stack_table2 t ON m.id= t.menu_id
           LEFT OUTER
           JOIN full_stack_table3 r ON r.id = t.role_id
           WHERE m.type!=2 AND r.id IN (1)
           ORDER BY m.sort ASC
		 */
        //未经多租户插件处理的SQL语句
		String sql = "select m.* from full_stack_table1 m LEFT OUTER JOIN full_stack_table2 t on m.id= t.menu_id LEFT OUTER JOIN full_stack_table3 r on r.id = t.role_id WHERE  m.type!=2 and r.id in ( 1 ) order by m.sort asc";
		System.out.println("未经多租户插件处理的SQL语句:");
		System.out.println(sql);
        //租户ID
		String tenantId="1";
		//租户列在数据库表中的列名
		String columnName="tenantId";
		
		// 解析出所有参与表连接操作的表别名
		Pattern fromTablePattern = Pattern.compile("FROM\\s+\\S+\\s+(\\S+)\\s+", Pattern.CASE_INSENSITIVE);
		Matcher fromTableAns = fromTablePattern.matcher(sql);
		Set<String> allTableAlias = new HashSet<String>();
		while (fromTableAns.find()) {
			allTableAlias.add(fromTableAns.group(1).toUpperCase());
		}
		// 解析出所有JOIN部分的表别名、左脸颊的情况下、只需要过滤主表就可以、从表可以为空、所有租户条件拼装、只需要拼装主表的
		Pattern joinTablePattern = Pattern.compile("LEFT\\s+OUTER+\\s+JOIN\\s+\\S+\\s+(\\S+)\\s+",
				Pattern.CASE_INSENSITIVE);
		Matcher joinTableAns = joinTablePattern.matcher(sql);
		while (joinTableAns.find()) {
			allTableAlias.add(joinTableAns.group(1).toUpperCase());
		}
		// 拼装多租户的where条件
		StringBuilder whereSql = new StringBuilder();
		for (String tableAlias : allTableAlias) {
			whereSql.append(tableAlias + "." + columnName + "="
					+ tenantId + " AND ");
		}
		String whereSqlStr = " WHERE " + whereSql.toString();
		Pattern sqlPattern = Pattern.compile("where", Pattern.CASE_INSENSITIVE);
		Matcher sqlAns = sqlPattern.matcher(sql);
        /**
         * SELECT m.*
           FROM full_stack_table1 m
           LEFT OUTER
           JOIN full_stack_table2 t ON m.id= t.menu_id
           LEFT OUTER
           JOIN full_stack_table3 r ON r.id = t.role_id
           WHERE R.tenantId=1 AND T.tenantId=1 AND M.tenantId=1 AND m.type!=2 AND r.id IN (1)
           ORDER BY m.sort ASC 		
         */
		String newSql = sqlAns.replaceAll(whereSqlStr);
		System.out.println("经过多租户插件处理的SQL语句:");
		System.out.println(newSql);
	}
}
