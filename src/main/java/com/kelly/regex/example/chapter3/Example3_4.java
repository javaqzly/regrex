package com.kelly.regex.example.chapter3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * 反向引用功能的演示
 *
 */
public class Example3_4 {
	public static void main(String[] args) {
		String line = "<div>hello welcome to bilibili! </div> <span> javaFullStack!</span>  <table>just try!</table> ";
		Pattern pattern = Pattern.compile("<(.+)>.*</(\\1)>");
		Matcher matcher = pattern.matcher(line);
		while (matcher.find()) {
			System.out.println(matcher.group(2));
		}
	}
}
