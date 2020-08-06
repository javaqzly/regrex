package com.kelly.regrex.start;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RegrexApplication {

	/**
	 * Java正则表达式案例集锦
	 * 1、千分位转换问题。
	 * 2、驼峰转下划线。
	 * 3、下划线转驼峰。
	 * 4、常规的密码强度校验。
	 * 5、常规的邮箱校验。
	 * 6、提取html富文本里面的简单文本。
	 * 7、提取Eclipse源代码中所有的多行注释
	 * 8、提取Eclipse源代码中所有的单号注释
	 */
	public static void main(String[] args) {
		SpringApplication.run(RegrexApplication.class, args);
	}

}
