package com.system;

/**
 * 枚举类，定义四个常量。用的时候取出来
 * 
 * @author lenovo
 *
 */
public enum MJ {

	SECOND(2), FOUR(4), EIGHT(8), SIXTEEN(16);

	private int _value;

	private MJ(int value) {
		_value = value;
	}

	public int value() {
		return _value;
	}
}