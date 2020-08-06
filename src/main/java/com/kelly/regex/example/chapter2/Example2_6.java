package com.kelly.regex.example.chapter2;

import java.util.regex.Pattern;

public class Example2_6 {
	public static void main(String[] args) {
          System.out.println("演示^ $匹配开始");
		  String beginEndRegex="^\\d.+\\d$";
          String rightBeginEnd="21341asdfasdfasf234234";
          String wrongBengEnd="2342asdfasfasdfasdfasdfa###1";
          System.out.println(Pattern.matches(beginEndRegex, rightBeginEnd));
          System.out.println(Pattern.matches(beginEndRegex, wrongBengEnd));
          System.out.println("演示^ $匹配结束");
          
          System.out.println("\n 演示一下单词分隔符的作用开始！");
          String line="hello world boy!";
          line=line.replaceAll("\\b", "#");
          System.out.println(line);
          System.out.println("演示一下单词分隔符的作用结束！");

          
	}
}
