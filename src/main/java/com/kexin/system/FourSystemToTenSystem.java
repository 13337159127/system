package com.kexin.system;

/**
 * 四进制转换成十进制数字
 * 
 * @author lenovo
 *
 */
public class FourSystemToTenSystem {

	/**
	 * 四进制转换成十进制
	 * 
	 * @param fourSystem
	 *            四进制数
	 * @return 十进制数
	 */
	public int getFourSystem(String fourSystem) {
		int j = 0;
		int tenSystem = 0;
		// 获取字符串的长度，把字符串的值一个一个取出来
		for (int i = fourSystem.length() - 1; i > -1; i--) {
			char fourNumber = fourSystem.charAt(i);
			int intFourNumber = Integer.parseInt(String.valueOf(fourNumber));
			int intTenNumber = getTenSystem(intFourNumber, j);
			tenSystem = tenSystem + intTenNumber;
			j++;
		}
		return tenSystem;
	}

	/**
	 * 4进制的每一位乘以n次方获得十进制的值
	 * 
	 * @param intFourNumber
	 *            四进制
	 * @param j
	 *            乘以几次方
	 * @return 十进制
	 */
	public int getTenSystem(int intFourNumber, int j) {
		double figure = (intFourNumber * Math.pow(4, j));
		int intTenNumber = (int) figure;
		return intTenNumber;
	}

	/**
	 * 打印十进制数字
	 * 
	 * @param TenSystem
	 *            十进制数字
	 */
	public void printNumber(int TenSystem) {
		System.out.println("十进制：" + TenSystem);
	}

	/**
	 * 调用方法，传参数
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		FourSystemToTenSystem system = new FourSystemToTenSystem();
		String fourSystem = "200";
		int TenSystem = system.getFourSystem(fourSystem);
		system.printNumber(TenSystem);
	}

}
