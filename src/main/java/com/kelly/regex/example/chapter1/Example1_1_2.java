package com.kelly.regex.example.chapter1;

import java.util.regex.Pattern;

public class Example1_1_2 {
	/**
	 * 这里用到了零宽断言
	 * 校验密码强度、需要密码的里面包含大小写、包含数字、包含特殊字符、长度为8到16之间
	 * @param args
	 */
	public static void main(String[] args) {
            String passwordRegex="(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[!@#$]).{8,16}";
            String rightPassword="aasA@163qqdf";
            String wrongPassword="asdfa163#good";
            System.out.println(Pattern.matches(passwordRegex, rightPassword));
            System.out.println(Pattern.matches(passwordRegex, wrongPassword));
	}
}
