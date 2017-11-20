package com.system;

/**
 * 十六进制转换成10进制
 * 
 * @author lenovo
 *
 */
public class SixteenSystemToTenSystem {

	/**
	 * 调用方法，传参数
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		SixteenSystemToTenSystem system = new SixteenSystemToTenSystem();
		String sixteenSystem = "1a";
		int tenSystem = system.getSixteenSystem(sixteenSystem);
		system.printNumber(tenSystem);
	}

	/**
	 * 从十六进制取出每一位转换成十进制
	 * 
	 * @param sixteenSystem
	 *            十六进制数
	 */
	public int getSixteenSystem(String sixteenSystem) {
		// 16的几次方
		int j = 0;
		int sum = 0;
		// 从字符串的最后一位开始取值
		for (int i = sixteenSystem.length() - 1; i > -1; i--) {
			char sixteenNumber = sixteenSystem.charAt(i);
			int number = getTenSystemNumber(sixteenNumber);
			int tenSystem = sixteenSystemToTenSystem(number, j);
			sum = sum + tenSystem;
			j++;
		}
		return sum;
	}

	/**
	 * 获取一个十进制的数字
	 * 
	 * @param sixteenNumber
	 *            十六进制
	 * @return 返回一个十进制的数字
	 */
	public int getTenSystemNumber(char sixteenNumber) {
		int number = 0;
		if (sixteenNumber == 'a') {
			number = 10;
		} else if (sixteenNumber == 'b') {
			number = 11;
		} else if (sixteenNumber == 'c') {
			number = 12;
		} else if (sixteenNumber == 'd') {
			number = 13;
		} else if (sixteenNumber == 'e') {
			number = 14;
		} else if (sixteenNumber == 'f') {
			number = 15;
		} else {
			number = Integer.parseInt(String.valueOf(sixteenNumber));
		}
		return number;
	}

	/**
	 * 打印十进制数字
	 * 
	 * @param tenSystem
	 *            十进制数字
	 */
	public void printNumber(int tenSystem) {
		System.out.println("十进制数字：" + tenSystem);
	}

	/**
	 * 十六进制转十进制
	 * 
	 * @param number
	 *            每一位十六进制的值
	 * @param j
	 *            n次方
	 * @return 返回每一位16进制的十进制值
	 */
	public int sixteenSystemToTenSystem(int number, int j) {
		double figure = (number * Math.pow(16, j));
		int intTenSystem = (int) figure;
		return intTenSystem;
	}

}
