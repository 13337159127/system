package com.kexin.system.entity;

/**
 * 进制转换的实体类
 * 
 * @author lenovo
 *
 */
public class SystemEntity {

	private String id;

	private int system;

	private int tenSystem;

	private String secondSystem;

	public String getId() {
		return id;
	}

	public String getSecondSystem() {
		return secondSystem;
	}

	public int getSystem() {
		return system;
	}

	public int getTenSystem() {
		return tenSystem;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setSecondSystem(String secondSystem) {
		this.secondSystem = secondSystem;
	}

	public void setSystem(int system) {
		this.system = system;
	}

	public void setTenSystem(int tenSystem) {
		this.tenSystem = tenSystem;
	}

}
