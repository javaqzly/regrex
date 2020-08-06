package com.kelly.regex.example.chapter3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 演示|操作符的使用
 *
 */
public class Example3_2_2 {
	public static void main(String[] args) {
		String line = "hello cat, hello pig , hello dog";
		Pattern regex = Pattern.compile("cat|dog|pig");
		Matcher matcher = regex.matcher(line);
		innerPrint(matcher);
	}

	private static void innerPrint(Matcher matcher) {
		while (matcher.find()) {
			System.out.println(matcher.group());
		}
	}
}
