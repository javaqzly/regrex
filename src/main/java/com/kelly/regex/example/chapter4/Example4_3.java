package com.kelly.regex.example.chapter4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example4_3 {
	/**
	 * 经典应用千分位转换详解
	 * @param args
	 */
	public static void main(String[] args) {
		String num = "123456789123456";
		Pattern pattern = Pattern.compile("\\B(?=(\\d{3})+$)");
		Matcher ans = pattern.matcher(num);
		String qfwNum = ans.replaceAll(",");
		System.out.println(qfwNum);
	}
}
