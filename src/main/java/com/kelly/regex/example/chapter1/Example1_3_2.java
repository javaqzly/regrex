package com.kelly.regex.example.chapter1;

import java.util.regex.Pattern;

public class Example1_3_2 {
	
	/**
	 * 一个简单的正则校验的例子
	 * @param args
	 */
	public static void main(String[] args) {
      String numberRegex="^\\d+$";
      String rightNumberLine="132413414141341";
      String wrongNumberLine="1341331341341";
      System.out.println(Pattern.matches(numberRegex, rightNumberLine));
      System.out.println(Pattern.matches(numberRegex, wrongNumberLine));
	}
}
