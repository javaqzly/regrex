package com.kelly.regex.example.chapter3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example3_10 {
	public static void main(String[] args) {
		String line = "hello world HeLLo good python\n otehrpython";
		Pattern helloPattern = Pattern.compile("hello", Pattern.CASE_INSENSITIVE);
		//Pattern helloPattern = Pattern.compile("hello");
		//Pattern pythonPattern = Pattern.compile(".*python$");
		Pattern pythonPattern = Pattern.compile(".*python$", Pattern.MULTILINE);
		Matcher helloMatcher = helloPattern.matcher(line);
		Matcher pythonMatcher = pythonPattern.matcher(line);
		innerPrint(helloMatcher);
		innerPrint(pythonMatcher);
	}

	private static void innerPrint(Matcher matcher) {
		while (matcher.find()) {
			System.out.println(matcher.group());
		}

	}
}
