package com.kelly.regex.example.chapter4;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example4_8 {
	/**
	 * 模仿freemaker的简单模板替换功能
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		String template = "java全栈老猿将在${address}举行一场${title},欢迎有兴趣的${listener}前来凑个热闹，谢谢大家！";
		System.out.println("替换前的字符串如下：");
		System.out.println(template);
		Map<String, String> params = new HashMap<String, String>();
		params.put("address", "哔哩哔哩");
		params.put("title", "正则表达式专题分享");
		params.put("listener", "听众朋友");

		Pattern pattern = Pattern.compile("\\$\\{(.+?)\\}");
		Matcher matcher = pattern.matcher(template);
		StringBuffer sb = new StringBuffer();
		while (matcher.find()) {
			matcher.appendReplacement(sb, params.get(matcher.group(1)));
		}
		matcher.appendTail(sb);
		System.out.println("替换后的字符串如下：");
		System.out.println(sb.toString());
	}
}
