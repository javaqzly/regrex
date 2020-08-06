package com.kelly.regex.example.chapter1;

import java.util.regex.Pattern;

public class Example1_2_2 {
	/**
	 * 校验当前字符串是否为合法的QQ号码
	 * @param args
	 */
	public static void main(String[] args) {
		String qqRegex = "^[1-9][0-9]{4,10}$";
		String rightQQ = "13411341";
		String wrongQQ = "012341";
		System.out.println(Pattern.matches(qqRegex, rightQQ));
		System.out.println(Pattern.matches(qqRegex, wrongQQ));
	}
}
