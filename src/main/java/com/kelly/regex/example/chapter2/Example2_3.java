package com.kelly.regex.example.chapter2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example2_3 {
	public static void main(String[] args) {
		String shuZiLine = "12Java全栈老猿88欢迎一起学习正则表达式666！";
		Pattern shuZiPattern = Pattern.compile("\\d+");
		Matcher shuZiMatcher = shuZiPattern.matcher(shuZiLine);
		System.out.println("提取字符串中所有的数字:");
		while (shuZiMatcher.find()) {
			System.out.println(shuZiMatcher.group());
		}

		String wLine = "asd12Java全栈老猿adfaf_88欢迎一起学习正则表达式adfasfa！";
		Pattern wLinePattern = Pattern.compile("\\w+");
		Matcher wLineMatcher = wLinePattern.matcher(wLine);
		System.out.println("提取字符串中的单词串");
		while (wLineMatcher.find()) {
			System.out.println(wLineMatcher.group());
		}

		String blankLine = "  Java全栈老猿       欢迎一起学习正则表达式		";
		Pattern blankPattern = Pattern.compile("\\s+");
		Matcher blankMatcher = blankPattern.matcher(blankLine);
		System.out.println("提取出来的空白字符串开始：");
		while (blankMatcher.find()) {
			System.out.println(blankMatcher.group());
		}
		System.out.println("提取出来的空白字符串结束：");

		String anyLine = "helloWorldJava全栈老猿 helloWorld";
		Pattern anyPattern = Pattern.compile("helloWorld(.*)helloWorld");
		Matcher anyMatcher = anyPattern.matcher(anyLine);
		System.out.println("使用.*的方式来提取Java全栈老猿的字样：");
		while (anyMatcher.find()) {
			System.out.println(anyMatcher.group(1));
		}

	}
}
