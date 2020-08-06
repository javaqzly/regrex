package com.kelly.regex.example.chapter2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 演示对转义字符本身的一个匹配情况
 * @author jiang5495
 *
 */
public class Example2_8 {
	public static void main(String[] args) {
		String line = "test$goodtest";
		Pattern specialPattern = Pattern.compile("\\$");
		Matcher matcher = specialPattern.matcher(line);
		innerPrint(matcher);
	}

	private static void innerPrint(Matcher matcher) {
		while (matcher.find()) {
			System.out.println(matcher.group());
		}

	}
}
