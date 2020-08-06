package com.kelly.regex.example.chapter4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example4_1 {

	/**
	 * 常规爬虫抓取图片链接邮箱标题等等
	 * 我们这里演示一下抓取图片链接和邮箱
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		/** 模拟抓取下来的HTML代码 */
		String htmlContent = "<html><body> <div class='content'> <span><img src='http://javafullstack.com/header.png'/></span> <div class='footer'> email : javaFullstack@163.com  </div>   </div> <body></html>";
		Pattern imgRegex = Pattern.compile("<img\\s+src='(.*)'\\s*?/>");
		Pattern emailRegex = Pattern.compile("[-_0-9a-zA-Z]*@[0-9a-zA-Z]{2,10}\\.[a-z]{2,5}");
		Matcher imgMatcher = imgRegex.matcher(htmlContent);
		Matcher emailMatcher = emailRegex.matcher(htmlContent);
		while (imgMatcher.find()) {
			System.out.println(imgMatcher.group(1));
		}
		while (emailMatcher.find()) {
			System.out.println(emailMatcher.group());
		}
		System.out.println("test over!");
	}
}
