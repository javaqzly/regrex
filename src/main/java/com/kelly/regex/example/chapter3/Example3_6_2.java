package com.kelly.regex.example.chapter3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 反向预搜索匹配
 * 
 *
 */
public class Example3_6_2 {
	public static void main(String[] args) {
          String line="hello java best 1111,java test 2222,java good 3333 java and python 4444";   
          Pattern pattern =Pattern.compile("(?<!(hello\\s))java");
          Matcher matcher = pattern.matcher(line);
          while(matcher.find()) {
        	  System.out.println(matcher.group());
        	  System.out.println("  匹配串后面剩余的所有字符==》"+line.substring(matcher.end()));
          }
	}
}
