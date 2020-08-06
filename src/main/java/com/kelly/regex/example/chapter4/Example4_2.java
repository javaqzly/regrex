package com.kelly.regex.example.chapter4;

import java.util.regex.Pattern;

public class Example4_2 {
	/**
	 * 举例各种校验场景
	 * @param args
	 */
	public static void main(String[] args) {
		// 校验Email
		String emailRegex = "^[-_0-9a-zA-Z]*@[0-9a-zA-Z]{2,10}\\.[a-z]{2,5}$";
		String rightEmail = "javaFullStack@163.com";
		String wrongEmail = "#342433434@sohu.com";
		System.out.println(Pattern.matches(emailRegex, rightEmail));
		System.out.println(Pattern.matches(emailRegex, wrongEmail));

		// 校验QQ号码
		String qqRegex = "^[1-9][0-9]{4,10}$";
		String rightQQ = "13411341";
		String wrongQQ = "012341";
		System.out.println(Pattern.matches(qqRegex, rightQQ));
		System.out.println(Pattern.matches(qqRegex, wrongQQ));

		// 校验用户名
		String usernameRegex = "^[a-zA-Z]([-_a-zA-Z0-9]{5,19})+$";
		String rightUsernameRegex = "abc41234312";
		String wrongUsernameRegex = "1234adfaf";
		System.out.println(Pattern.matches(usernameRegex, rightUsernameRegex));
		System.out.println(Pattern.matches(usernameRegex, wrongUsernameRegex));

		// 校验密码长度
		String passwordRegex = "(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[!@#$]).{8,16}";
		String rightPassword = "aasA@163qqdf";
		String wrongPassword = "asdfa163#good";
		System.out.println(Pattern.matches(passwordRegex, rightPassword));
		System.out.println(Pattern.matches(passwordRegex, wrongPassword));
	}
}
