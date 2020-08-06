package com.kelly.regex.example.chapter1;

import java.util.regex.Pattern;

public class Example1_2_1 {
	
	/**
	 * 校验对应的字符串是否为纯数字组成。
	 * 大家可以想一下、如果是要校验为整形数字需要考虑哪些内容？
	 * @param args
	 */
	public static void main(String[] args) {
      String numberRegex="^\\d+$";
      String rightNumberLine="132413414141341";
      String wrongNumberLine="13413d1341341";
      System.out.println(Pattern.matches(numberRegex, rightNumberLine));
      System.out.println(Pattern.matches(numberRegex, wrongNumberLine));
	}
}
