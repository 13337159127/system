package com.kexin.system.service;

import org.springframework.stereotype.Service;

/**
 * 从0开始，到32个1，获取二进制的值
 * 
 * @author lenovo
 *
 */
@Service("getSecondSystem")
public class GetSecondSystem {

	/**
	 * 两个二进制的数字加在一起
	 * 
	 * @param a
	 *            二进制数字
	 * @param b
	 *            二进制数字
	 * @return 加在一起的二进制数字
	 */
	public static String addBinary(String a, String b) {
		int carry = 0;
		int sum = 0;
		int opa = 0;
		int opb = 0;
		StringBuilder result = new StringBuilder();
		while (a.length() != b.length()) {
			if (a.length() > b.length()) {
				b = "0" + b;
			} else {
				a = "0" + a;
			}
		}
		for (int i = a.length() - 1; i >= 0; i--) {
			opa = a.charAt(i) - '0';
			opb = b.charAt(i) - '0';
			sum = opa + opb + carry;
			if (sum >= 2) {
				result.append((char) (sum - 2 + '0'));
				carry = 1;
			} else {
				result.append((char) (sum + '0'));
				carry = 0;
			}
		}
		if (carry == 1) {
			result.append("1");
		}
		return result.reverse().toString();
	}
}
