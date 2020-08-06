package com.kelly.regex.example.chapter3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example3_3 {
	public static void main(String[] args) {
		String line = "aaaaabbbbbbccccccccc";
		Pattern regex = Pattern.compile("c{4,}?");
		Matcher matcher = regex.matcher(line);
		innerPrint(matcher);
	}

	private static void innerPrint(Matcher matcher) {
		while (matcher.find()) {
			System.out.println(matcher.group());
		}
	}
}
