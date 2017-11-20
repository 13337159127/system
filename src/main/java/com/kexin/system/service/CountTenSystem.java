package com.kexin.system.service;

import org.springframework.stereotype.Service;

/**
 * 二进制的值转换成十进制
 * 
 * @author lenovo
 *
 */
@Service("countTenSystem")
public class CountTenSystem {

	/**
	 * 二进制转十进制
	 * 
	 * @param secondSystem
	 *            二进制数字
	 * @param system
	 *            2进制
	 * @return 十进制数字
	 * @throws Exception
	 */
	public int getTensystem(String secondSystem, int system) throws Exception {
		int j = 0;
		// 十进制数字
		int tenSystem = 0;
		// 把获取到的二进制的值转换成10进制
		for (int i = secondSystem.length() - 1; i > -1; i--) {
			char charNumber = secondSystem.charAt(i);
			int figure = Integer.parseInt(String.valueOf(charNumber));
			double tenNumber = (figure * Math.pow(system, j));
			int intTenSystem = (int) tenNumber;
			tenSystem = tenSystem + intTenSystem;
			j++;
		}
		return tenSystem;
	}

}
