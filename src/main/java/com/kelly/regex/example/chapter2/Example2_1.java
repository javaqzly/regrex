package com.kelly.regex.example.chapter2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example2_1 {

	public static void main(String[] args) {
		String line = "abcdefg good good study day day up abc!";
		String regexOne = "abc";
		String regexTwo = "study";
		String regexThree = "down";
		System.out.println(isFindMatcher(regexOne, line));
		System.out.println(isFindMatcher(regexTwo, line));
		System.out.println(isFindMatcher(regexThree, line));
	}

	private static boolean isFindMatcher(String regex, String line) {
		boolean isFind = false;
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(line);
		while (matcher.find()) {
			System.out.println(matcher.group());
			isFind = true;
		}
		return isFind;
	}

}
