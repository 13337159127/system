package com.kexin.system.dao;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.kexin.system.entity.SecondToSixteenEntity;

/**
 * 向mapper文件里面传参数
 * 
 * @author lenovo
 *
 */
@Repository("secondToSixteenDao")
public class SecondToSixteenDao {

	@Resource
	private SqlSessionTemplate sqlSessionTemplate;

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
	public int getSixteenSystem(String id, int secondSystem, String secondNumber, String sixTeenSystem)
			throws Exception {
		SecondToSixteenEntity system = new SecondToSixteenEntity();
		system.setId(id);
		system.setSecondNumber(secondNumber);
		system.setSecondSystem(secondSystem);
		system.setSixTeenSystem(sixTeenSystem);
		return sqlSessionTemplate.insert("com.kexin.system.dao.SecondToSixteenDao.addSixTeenNumber", system);
	}

}
