package com.kexin.system.dao;

import java.util.List;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.kexin.system.entity.SystemEntity;

/**
 * 向数据库添加值进制的信息
 * 
 * @author lenovo
 *
 */
@Repository("systemDao")
public class SystemDao {

	@Resource
	private SqlSessionTemplate sqlSessionTemplate;

	/**
	 * 二进制循环从0开始到32个1,转换成十进制的值
	 * 
	 * @param list
	 *            list里面存放二进制转十进制的信息
	 * @return
	 * @throws Exception
	 */
	public int secondToTenSystem(List<SystemEntity> list) throws Exception {
		return sqlSessionTemplate.insert("com.kexin.system.dao.SystemDao.secondToTenSystem", list);
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
	public int systemToTenSystem(String id, int system, int tenSystem, String secondSystem) throws Exception {
		SystemEntity entity = new SystemEntity();
		entity.setId(id);
		entity.setSystem(system);
		entity.setTenSystem(tenSystem);
		entity.setSecondSystem(secondSystem);
		return sqlSessionTemplate.insert("com.kexin.system.dao.SystemDao.systemToTenSystem", entity);
	}
}
