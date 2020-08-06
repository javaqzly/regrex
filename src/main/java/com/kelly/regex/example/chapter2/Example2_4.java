package com.kelly.regex.example.chapter2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example2_4 {
	public static void main(String[] args) {
		System.out.println("演示提取非空字符串开始： ");
		String bigSLine = "  java全栈老猿    好好学习  天天向上！";
		Pattern bigSPattern = Pattern.compile("\\S+");
		Matcher bigSMatcher = bigSPattern.matcher(bigSLine);
		while (bigSMatcher.find()) {
			System.out.println(bigSMatcher.group());
		}
		System.out.println("演示提取非空字符串结束！");

		System.out.println("\n演示提取非数字串开始！");
		String bigDLine = "123414HelloWorld64624OnePlayer3434";
		Pattern bigDPattern = Pattern.compile("\\D+");
		Matcher bigDMatcher = bigDPattern.matcher(bigDLine);
		while (bigDMatcher.find()) {
			System.out.println(bigDMatcher.group());
		}
		System.out.println("演示提取非数字串结束！");

		System.out.println("\n演示提取非数字字母下划线串开始！");
		String bigWLine = "--@asfaf234234#---%测试一下";
		Pattern bigWLinePattern = Pattern.compile("\\W+");
		Matcher bigWMatcher = bigWLinePattern.matcher(bigWLine);
		while (bigWMatcher.find()) {
			System.out.println(bigWMatcher.group());
		}
		System.out.println("演示提取非数字字母下划线串结束！");

		System.out.println("\n演示提取非单词边界串开始！");
		String bigBLine = "hellow orld www";
		Pattern bigBPattern = Pattern.compile("w\\Bww");
		Matcher bigBMatcher = bigBPattern.matcher(bigBLine);
		while (bigBMatcher.find()) {
			System.out.println(bigBMatcher.group());
		}
		System.out.println("演示提取非单词边界串结束！");

	}
}
