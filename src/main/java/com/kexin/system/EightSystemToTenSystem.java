package com.kexin.system;

/**
 * 八进制数字转换成十进制数字
 * 
 * @author lenovo
 *
 */
public class EightSystemToTenSystem {

	/**
	 * 获取八进制数字
	 * 
	 * @param eightSystem
	 *            八进制数字
	 * @return 十进制数字
	 */
	public int getEightSystem(String eightSystem) {
		int j = 0;
		int tenSystem = 0;
		for (int i = eightSystem.length() - 1; i < eightSystem.length() && i > -1; i--) {
			char eightNumber = eightSystem.charAt(i);
			int inteightNumber = Integer.parseInt(String.valueOf(eightNumber));
			int intTenNumber = countTenSystem(inteightNumber, j);
			tenSystem = tenSystem + intTenNumber;
			j++;
		}
		return tenSystem;
	}

	/**
	 * 计算十进制的值
	 * 
	 * @param inteightNumber
	 *            八进制
	 * @param j
	 *            n的几次方
	 * @return 十进制
	 */
	public int countTenSystem(int inteightNumber, int j) {
		double tenNumber = inteightNumber * (Math.pow(8, j));
		int intTenNumber = (int) tenNumber;
		return intTenNumber;
	}

	/**
	 * 打印十进制数字
	 * 
	 * @param tenSystem
	 *            十进制数字
	 */
	public void printNumber(int tenSystem) {
		System.out.println("十进制：" + tenSystem);
	}

	/**
	 * 调用方法，传参数
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		EightSystemToTenSystem system = new EightSystemToTenSystem();
		String eightSystem = "10";
		int tenSystem = system.getEightSystem(eightSystem);
		system.printNumber(tenSystem);
	}

}
