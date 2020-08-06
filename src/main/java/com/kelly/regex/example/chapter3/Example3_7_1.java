package com.kelly.regex.example.chapter3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 演示汉字的提取
 *
 */
public class Example3_7_1 {
	public static void main(String[] args) {
		String line = "hello 你好 not good  你真的是一个好人 may be good 老好人!";
		Pattern pattern = Pattern.compile("[\\u4e00-\\u9fa5]");
		Matcher matcher = pattern.matcher(line);
		while (matcher.find()) {
			System.out.println(matcher.group());
		}
	}
}
