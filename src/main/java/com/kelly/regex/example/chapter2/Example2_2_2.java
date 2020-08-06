package com.kelly.regex.example.chapter2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example2_2_2 {
	public static void main(String[] args) {
		//匹配制表符
		String zhiBiaoLine = "good	bad!";
		Pattern zhiBiaoPattern = Pattern.compile("\\t");
		Matcher zhiBiaoMatcher = zhiBiaoPattern.matcher(zhiBiaoLine);
		while (zhiBiaoMatcher.find()) {
			System.out.println("成功匹配到了制表符号：  " + zhiBiaoMatcher.group());
		}
		//匹配反斜杠
		String  fanXieGangLine="good\\bad";
		Pattern fanXieGangPattern = Pattern.compile("\\\\");
		Matcher fanXieGanMatcher = fanXieGangPattern.matcher(fanXieGangLine);
		while( fanXieGanMatcher.find()) {
			System.out.println("成功匹配到了反斜杠： "+ fanXieGanMatcher.group());
		}

	}
}
