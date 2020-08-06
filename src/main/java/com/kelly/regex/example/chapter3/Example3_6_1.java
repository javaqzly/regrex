package com.kelly.regex.example.chapter3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 反向预搜索匹配
 * 
 *
 */
public class Example3_6_1 {
	public static void main(String[] args) {
          String line="hello java best,java test,java good  java and python";   
          Pattern pattern =Pattern.compile("(?<=(hello\\s))java");
          Matcher matcher = pattern.matcher(line);
          while(matcher.find()) {
        	  System.out.println(matcher.group());
        	  System.out.println("  匹配串后面剩余的所有字符==》"+line.substring(matcher.end()-1));
          }
	}
}
