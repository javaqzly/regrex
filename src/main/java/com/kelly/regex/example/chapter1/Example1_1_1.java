package com.kelly.regex.example.chapter1;

import java.util.regex.Pattern;

public class Example1_1_1 {
	
	
	/**
	 * 部分网站用户名规则校验的Demo,
	 * 用户名必须要以大小写字母开头、并且只能包含大小写数字下划线和中划线
	 * ^开始符号作用于第一个捕获组
	 * @param args
	 */
	public static void main(String[] args) {
        String usernameRegex="^[a-zA-Z]([-_a-zA-Z0-9]{5,19})+$";
        String rightUsernameRegex="abc41234312";
        String wrongUsernameRegex="1234adfaf";
        System.out.println(Pattern.matches(usernameRegex, rightUsernameRegex));
        System.out.println(Pattern.matches(usernameRegex, wrongUsernameRegex));
	}
}
