package com.kexin.system.service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kexin.system.dao.SystemDao;
import com.kexin.system.entity.SystemEntity;

/**
 * 调用dao层方法
 * 
 * @author lenovo
 *
 */
@Service("systemService")
public class SystemService {

	private static final String changliang = "1";

	@Autowired
	private SystemDao systemDao;

	@Autowired
	private GetSecondSystem getSecondSystem;

	@Autowired
	private CountTenSystem countTenSystem;

	/**
	 * 二进制循环从0开始到32个1,转换成十进制的值
	 * 
	 * @param id
	 *            数据表ID
	 * @param system
	 *            二进制
	 * @param tenSystem
	 *            二进制转换成十进制
	 * @param secondSystem
	 *            二进制数字
	 * @return
	 * @throws Exception
	 */
	public String secondToTenSystem(int system, String number) throws Exception {
		List<SystemEntity> list = new ArrayList<SystemEntity>();
		// 从0开始，每次加1获取的二进制数字
		String secondSystem = "0";
		// long maximumValue = 4294967296L;
		long maximumValue = 50000;
		long jiafa = 0;
		long twoToTen = 0;
		long addshuju = 0;
		// 获取二进制的值，从0开始，每次加1
		for (long a = 0; a < maximumValue; a++) {
			// list添加实体对象重复。在循环体内。每次创建一个新地址存放新对象
			SystemEntity entity = new SystemEntity();
			long startTime = System.currentTimeMillis();
			secondSystem = getSecondSystem.addBinary(secondSystem, changliang);
			long endTime = System.currentTimeMillis();
			jiafa = (endTime - startTime) + jiafa;
			long start = System.currentTimeMillis(); // 获取开始时间
			int tenSystem = countTenSystem.getTensystem(secondSystem, system);
			long end = System.currentTimeMillis(); // 获取结束时间
			twoToTen = (end - start) + twoToTen;
			String id = UUID.randomUUID().toString();
			entity.setId(id);
			entity.setSecondSystem(secondSystem);
			entity.setSystem(system);
			entity.setTenSystem(tenSystem);
			list.add(entity);
			// 批量向数据库添加数据
			if (list.size() == 500) {
				long s = System.currentTimeMillis(); // 获取开始时间
				systemDao.secondToTenSystem(list);
				long e = System.currentTimeMillis(); // 获取结束时间
				addshuju = (e - s) + addshuju;
				list.clear();
			}
		}
		System.out.println("list的长度：" + list.size());
		System.out.println("二进制加法运行时间： " + jiafa + "ms");
		System.out.println("二进制转十进制程序运行时间： " + twoToTen + "ms");
		System.out.println("添加数据时间： " + addshuju + "ms");
		return secondSystem;
	}

	/**
	 * 计算几进制转十进制的值
	 * 
	 * @param system
	 *            几进制
	 * @param number
	 *            要转换的值
	 * @return
	 * 
	 * @throws Exception
	 */
	public int systemToTenSystem(int system, String number) throws Exception {
		String id = UUID.randomUUID().toString();
		int j = 0;
		int figure = 0;
		// 十进制数字
		int tenSystem = 0;
		// 把获取到的二进制的值转换成10进制
		for (int i = number.length() - 1; i > -1; i--) {
			char charNumber = number.charAt(i);
			if (charNumber == 'a') {
				figure = 10;
			} else if (charNumber == 'b') {
				figure = 11;
			} else if (charNumber == 'c') {
				figure = 12;
			} else if (charNumber == 'd') {
				figure = 13;
			} else if (charNumber == 'e') {
				figure = 14;
			} else if (charNumber == 'f') {
				figure = 15;
			} else {
				figure = Integer.parseInt(String.valueOf(charNumber));
			}
			double tenNumber = (figure * Math.pow(system, j));
			int intTenSystem = (int) tenNumber;
			tenSystem = tenSystem + intTenSystem;
			j++;
		}
		systemDao.systemToTenSystem(id, system, tenSystem, number);
		return tenSystem;
	}

}
