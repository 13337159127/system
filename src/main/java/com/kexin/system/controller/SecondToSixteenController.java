package com.kexin.system.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kexin.system.service.SecondToSixteenService;

/**
 * 接收页面传过来的值，向页面返回值
 * 
 * @author lenovo
 *
 */
@Controller
@RequestMapping("/secondtosixteen")
public class SecondToSixteenController {

	@Autowired
	private SecondToSixteenService secondToSixteenService;

	/**
	 * 接收前台传过来的参数
	 * 
	 * @param secondNumber
	 *            二进制数字
	 * @throws Exception
	 */
	@RequestMapping("/getSixteenSystem")
	@ResponseBody
	public String getSixteenSystem(String secondNumber) throws Exception {
		String sixteenSystem = secondToSixteenService.getSixteenSystem(secondNumber);
		return sixteenSystem;
	}

}
