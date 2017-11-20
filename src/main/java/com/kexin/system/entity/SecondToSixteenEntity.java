package com.kexin.system.entity;

/**
 * 二进制转十六进制
 * 
 * @author lenovo
 *
 */
public class SecondToSixteenEntity {

	private String id;

	private int secondSystem;

	private String secondNumber;

	private String sixTeenSystem;

	public String getId() {
		return id;
	}

	public String getSecondNumber() {
		return secondNumber;
	}

	public int getSecondSystem() {
		return secondSystem;
	}

	public String getSixTeenSystem() {
		return sixTeenSystem;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setSecondNumber(String secondNumber) {
		this.secondNumber = secondNumber;
	}

	public void setSecondSystem(int secondSystem) {
		this.secondSystem = secondSystem;
	}

	public void setSixTeenSystem(String sixTeenSystem) {
		this.sixTeenSystem = sixTeenSystem;
	}

}
