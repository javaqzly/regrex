package com.kelly.regex.example.chapter4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example4_4 {

	/**
	 * 驼峰转下划线
	 */
	private static void humpToUnderLine() {
		String hump = "javaFullStack";
		Pattern pattern = Pattern.compile("(?=[A-Z])");
		Matcher matcher = pattern.matcher(hump);
		String underLine = matcher.replaceAll("_").toLowerCase();
		System.out.println(underLine);
	}

	/**
	 * 
	 * 下划线转驼峰
	 */
	private static void underLineToHump() {
		String underLine = "hello_world_table_java_full_stack";
		Pattern pattern = Pattern.compile("_(\\w)");
		Matcher matcher = pattern.matcher(underLine);
		StringBuffer sb = new StringBuffer();
		while (matcher.find()) {
			matcher.appendReplacement(sb, matcher.group(1).toUpperCase());
		}
		matcher.appendTail(sb);
		System.out.println(sb.toString());
	}

	public static void main(String[] args) {
		humpToUnderLine();
		underLineToHump();
		

	}
}
