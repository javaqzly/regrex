package com.kelly.regex.example.chapter3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 演示不匹配子捕获组
 *
 */
public class Example3_9 {
	public static void main(String[] args) {
		String line = "talk is cheap ,show me the 1111111code343434";
		Pattern pattern = Pattern.compile("(?:\\d+)(.*?)(\\d+)");
		Matcher matcher = pattern.matcher(line);
		while (matcher.find()) {
			System.out.println(matcher.group(1));
		}
	}
}
