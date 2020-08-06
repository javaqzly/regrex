package com.kelly.regex.example.chapter2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example2_5 {
	public static void main(String[] args) {
		
		System.out.println("演示提取自定义字符串开始：");
		String multipleLine = "#@%###helloWorld@@@@good";
		Pattern multiplePattern = Pattern.compile("[#@%]+");
		Matcher matcher = multiplePattern.matcher(multipleLine);
		while (matcher.find()) {
			System.out.println(matcher.group());
		}
		System.out.println("演示提取自定义字符串结束：");

	}
}
