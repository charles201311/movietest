package com.bobo.movie.service.impl;

public class Test22 {

	/**
	 * 
	 * @Title: isEmail
	 * @Description: 是否是邮箱
	 * @param str
	 * @return
	 * @return: boolean
	 */
	public static boolean isEmail(String str) {
       //字母数字下划线
		String regex = "[A-z0-9_]+\\@[A-z0-9]+\\.[A-z]+";

			return str.matches(regex);

	}
	public static void main(String[] args) {
		boolean b = Test22.isEmail("a348828809@qq.com");
		System.out.println(b);
	}
}
