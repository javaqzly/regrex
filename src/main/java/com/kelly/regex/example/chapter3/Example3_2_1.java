package com.kelly.regex.example.chapter3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 演示子表达式的提取
 *
 */
public class Example3_2_1 {
	public static void main(String[] args) {
         String line="http://www.javaFullStack.com";
         Pattern regex=Pattern.compile("(http)://www.(.*)(\\.com)");
         Matcher matcher = regex.matcher(line);
         while(matcher.find()) {
        	 System.out.println(matcher.group(0));
        	 System.out.println(matcher.group(1));
        	 System.out.println(matcher.group(2));
        	 System.out.println(matcher.group(3));
         }
	}
}
