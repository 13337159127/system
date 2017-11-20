package com.kexin.system.service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kexin.system.dao.SecondToSixteenDao;

/**
 * 调用dao层
 * 
 * @author lenovo
 *
 */
@Service("secondToSixteenService")
public class SecondToSixteenService {

	@Autowired
	private SecondToSixteenDao secondToSixteenDao;

	/**
	 * 二进制数字转换成十六进制的数字
	 * 
	 * @param id
	 *            数据id
	 * @param secondSystem
	 *            二进制
	 * @param secondNumber
	 *            二进制数字
	 * @param sixteenNumber
	 *            十六进制数字
	 * @return
	 * @throws Exception
	 */
	public String getSixteenSystem(String secondNumber) throws Exception {
		List<String> list = new ArrayList<String>();
		String id = UUID.randomUUID().toString();
		int secondSystem = 2;
		int sixteenNumber = 0;
		String sixTeen = "";
		int j = 0;
		for (int i = secondNumber.length() - 1; i > -1; i--) {
			char charNumber = secondNumber.charAt(i);
			int figure = Integer.parseInt(String.valueOf(charNumber));
			double doubleNumber = figure * Math.pow(2, j);
			int intNumber = (int) doubleNumber;
			sixteenNumber = sixteenNumber + intNumber;
			if (sixteenNumber == 10) {
				sixTeen = "a";
			} else if (sixteenNumber == 11) {
				sixTeen = "b";
			} else if (sixteenNumber == 12) {
				sixTeen = "c";
			} else if (sixteenNumber == 13) {
				sixTeen = "d";
			} else if (sixteenNumber == 14) {
				sixTeen = "e";
			} else if (sixteenNumber == 15) {
				sixTeen = "f";
			}
			j++;
			// 如果等于3，向集合里添加四位加在一起的结果
			if (j == 4) {
				list.add(sixTeen);
				sixteenNumber = 0;
				sixTeen = "";
				j = 0;
			} else {
				sixTeen = String.valueOf(sixteenNumber);
			}
		}
		if (j != 4) {
			list.add(sixTeen);
		}
		// 从集合最后一位开始取值,取出来的值加到一起
		String sixteenSystem = "";
		for (int i = list.size() - 1; i > -1; i--) {
			String number = list.get(i);
			sixteenSystem = sixteenSystem + number;
		}
		secondToSixteenDao.getSixteenSystem(id, secondSystem, secondNumber, sixteenSystem);
		return sixteenSystem;
	}
}
