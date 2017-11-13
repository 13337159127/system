package com.kexin.system;

/**
 * 二 四 八 十六进制转换成十进制
 * 
 * @author lenovo
 *
 */
public class SystemToTenSystem {

	/**
	 * 从进制中取出每一位，调用计算进制转十进制的方法，接收计算的结果，并且把十进制的值加到一起
	 * 
	 * @param system
	 *            输入的数字
	 * @param number
	 *            输入的几进制
	 * @return 返回一个十进制数字
	 */
	public int getSecondSystem(String system, MJ mj) {
		int j = 0;
		int tenSystem = 0;
		// 从字符串的最后一位向前取值，如果要取的值小于字符串的长度并且大于-1，则进入循环
		for (int i = system.length() - 1; i < system.length() && i > -1; i--) {
			char charNumber = system.charAt(i);
			int systemNumber = getIntNumber(charNumber, mj.value());
			int intTenSystem = getTenSystem(systemNumber, j, mj.value());
			// 每一位二进制的值加在一起
			tenSystem = tenSystem + intTenSystem;
			j++;
		}
		return tenSystem;
	}

	/**
	 * 为十六进制的英文转换为对应十进制的数字。或者把char类型的数字转换成int类型
	 * 
	 * @param charNumber
	 *            传进来进制的每一位数字
	 * @param system
	 *            传进来的几进制
	 * @return 整型的数字
	 */
	public int getIntNumber(char charNumber, int system) {
		int number = 0;
		if (system == 16) {
			if (charNumber == 'a') {
				number = 10;
			} else if (charNumber == 'b') {
				number = 11;
			} else if (charNumber == 'c') {
				number = 12;
			} else if (charNumber == 'd') {
				number = 13;
			} else if (charNumber == 'e') {
				number = 14;
			} else if (charNumber == 'f') {
				number = 15;
			} else {
				number = Integer.parseInt(String.valueOf(charNumber));
			}
		} else {
			number = Integer.parseInt(String.valueOf(charNumber));
		}
		return number;
	}

	/**
	 * 每一位乘以的n次方，转换成十进制的值，并且把double类型的数字转换成整型
	 * 
	 * @param intSecondNumber
	 *            二进制数字
	 * @param j
	 *            乘以n次方
	 * @return 返回一个十进制数字
	 */
	public int getTenSystem(int intSecondNumber, int j, int number) {
		double figure = (intSecondNumber * Math.pow(number, j));
		int intTenSystem = (int) figure;
		return intTenSystem;
	}

	/**
	 * 打印十进制数
	 * 
	 * @param tenSystem
	 *            十进制数
	 */
	public void printTenSystem(int tenSystem) {
		System.out.println("十进制数：" + tenSystem);
	}

	/**
	 * 调用方法，传参数
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		SystemToTenSystem te = new SystemToTenSystem();
		String number = "11111";
		MJ mj = MJ.SECOND;
		int tenSystem = te.getSecondSystem(number, mj);
		te.printTenSystem(tenSystem);
	}

}
