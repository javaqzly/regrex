package com.kelly.regex.example.chapter2;

import java.io.InputStream;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example2_2_1 {
	/**
	 * 回车换行正则表达式验证
	 * @param args
	 */
	public static void main(String[] args) {

		try {
			InputStream im = ClassLoader.getSystemResourceAsStream("example2_2_1.txt");
			int num = -1;
			int index = 0;
			boolean isFindHuiChe = false;
			boolean isFindHuanHang = false;
			StringBuilder sb = new StringBuilder();
			while ((num = im.read()) != -1) {
				char ch = (char) num;
				index++;
				String line = new String(new char[] { ch });
				Pattern huiChe = Pattern.compile("\\r");
				Pattern huanHang = Pattern.compile("\\n");
				Matcher huiCheMatcher = huiChe.matcher(line);
				Matcher huanHangMatcher = huanHang.matcher(line);
				while (huiCheMatcher.find()) {
					System.out.println("回车符号匹配成功了、位置如下： ===> " + index);
					isFindHuiChe = true;
				}

				while (huanHangMatcher.find()) {
					System.out.println("换行符号匹配成功了、 位置如下： ===> " + index);
					isFindHuanHang = true;
				}
				// System.out.println(line);
				sb.append(line);
				if (isFindHuanHang && isFindHuiChe) {
					System.out.println("未去掉回车换行的原串：" + sb.toString() + "   原生串的长度为： " + sb.toString().length());
					System.out
							.println("去掉回车换行的变化串：" + sb.toString().trim() + "  去掉回车换行的串的长度为：" + sb.toString().trim().length());
					break;
				}
			}
			im.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
