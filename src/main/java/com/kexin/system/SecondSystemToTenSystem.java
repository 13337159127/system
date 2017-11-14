package com.kexin.system;

/**
 * 二进制数字转换成十进制数字
 * 
 * @author lenovo
 *
 */
public class SecondSystemToTenSystem {

	/**
	 * 从二进制中取出每一位值
	 * 
	 * @param secondSystem
	 *            二进制数字
	 * @return 十进制数
	 */
	public int getSecondSystem(String secondSystem) {
		int j = 0;
		int tenSystem = 0;
		// 从字符串的最后一位向前取值
		for (int i = secondSystem.length() - 1; i > -1; i--) {
			char secondNumber = secondSystem.charAt(i);
			int intSecondNumber = Integer.parseInt(String.valueOf(secondNumber));
			int intTenSystem = getTenSystem(intSecondNumber, j);
			// 每一位二进制的值加在一起
			tenSystem = tenSystem + intTenSystem;
			j++;
		}
		return tenSystem;
	}

	/**
	 * 每一位乘以2的n次方，转换成十进制的值
	 * 
	 * @param intSecondNumber
	 *            二进制数字
	 * @param j
	 *            乘以n次方
	 * @return 返回一个十进制数字
	 */
	public int getTenSystem(int intSecondNumber, int j) {
		// 每一位二进制几次方的值
		double figure = (intSecondNumber * Math.pow(2, j));
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
		SecondSystemToTenSystem system = new SecondSystemToTenSystem();
		String secondSystem = "10";
		int tenSystem = system.getSecondSystem(secondSystem);
		system.printTenSystem(tenSystem);
	}

}
