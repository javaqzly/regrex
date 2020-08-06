package com.kelly.regex.example.chapter2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 
 *演示正則表達式中量词的使用
 *
 */
public class Example2_7 {
	public static void main(String[] args) {
		String line = "aaaaabbbbbbbbccccccccc";
		Pattern aPattern = Pattern.compile("a{3}");
		Pattern bPattern = Pattern.compile("b{4,6}");
		Pattern cPattern = Pattern.compile("c{7,}");
		Matcher aMatcher = aPattern.matcher(line);
		Matcher bMatcher = bPattern.matcher(line);
		Matcher cMatcher = cPattern.matcher(line);
		innerPrint(aMatcher);
		innerPrint(bMatcher);
		innerPrint(cMatcher);
	}

	private static void innerPrint(Matcher matcher) {
		while (matcher.find()) {
			System.out.println(matcher.group());
		}

	}
}
