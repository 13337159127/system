package com.system;

import java.util.ArrayList;
import java.util.List;

/**
 * 二进制转16进制
 * 
 * @author lenovo
 *
 */
public class SecondSystemToSixteenSystem {

	/**
	 * 调用方法，传参数
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		SecondSystemToSixteenSystem system = new SecondSystemToSixteenSystem();
		String secondSystem = "111100";
		List<String> list = system.getSecondNumber(secondSystem);
		system.printNumber(list);
	}

	/**
	 * 从右向左取值，每四位2进制乘完的值加到一起。存放到list集合里面
	 * 
	 * @param secondSystem
	 *            二进制数字
	 * @return 十六进制数字的集合
	 */
	public List<String> getSecondNumber(String secondSystem) {
		List<String> list = new ArrayList<String>();
		int j = 0;
		// 每一位二进制乘完的值加到一起
		int sixteenSystem = 0;
		// 每四位二进制乘完以后加到一起的string类型值
		String sixteen = "";
		for (int i = secondSystem.length() - 1; i > -1; i--) {
			char charNumber = secondSystem.charAt(i);
			int intSecondNumber = Integer.parseInt(String.valueOf(charNumber));
			if (j == 4) {
				j = 0;
				sixteenSystem = 0;
				sixteen = "";
			}
			int sixteenNumber = getSixteenNumber(intSecondNumber, j);
			sixteenSystem = sixteenSystem + sixteenNumber;
			j++;
			// 如果j等于4，把四位二进制乘完的值加到一起存放到list里面
			if (j == 4) {
				sixteen = numberToLetter(sixteenSystem);
				list.add(sixteen);
			} else {
				sixteen = String.valueOf(sixteenSystem);
			}
		}
		if (j != 4) {
			list.add(sixteen);
		}
		return list;
	}

	/**
	 * 每一位数字转换成十六进制
	 * 
	 * @param intSecondNumber
	 *            要转换的数字
	 * @param j
	 *            乘以几次方
	 * @return 十六进制数字
	 */
	public int getSixteenNumber(int intSecondNumber, int j) {
		double figure = intSecondNumber * Math.pow(2, j);
		int sixteenSystem = (int) figure;
		return sixteenSystem;
	}

	/**
	 * 把数字转换成英文字母
	 * 
	 * @param secondSystem
	 *            数字
	 */
	public String numberToLetter(int secondSystem) {
		String number = String.valueOf(secondSystem);
		if (secondSystem == 10) {
			return "a";
		} else if (secondSystem == 11) {
			return "b";
		} else if (secondSystem == 12) {
			return "c";
		} else if (secondSystem == 13) {
			return "d";
		} else if (secondSystem == 14) {
			return "e";
		} else if (secondSystem == 15) {
			return "f";
		}
		return number;
	}

	/**
	 * 从集合中从后向前取值，取出来的十六进制值打印
	 * 
	 * @param list
	 *            传进来的集合，里面存放十六进制的数字
	 */
	public void printNumber(List<String> list) {
		for (int i = list.size() - 1; i > -1; i--) {
			System.out.print(list.get(i));
		}
	}
}
