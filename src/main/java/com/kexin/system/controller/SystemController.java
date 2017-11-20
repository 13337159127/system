package com.kexin.system.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kexin.system.service.SystemService;

@Controller
@RequestMapping("/radix")
public class SystemController {

	@Autowired
	private SystemService systemService;

	/**
	 * 二进制从0开始直到32个1转换成十进制
	 * 
	 * @param system
	 *            2进制
	 * @param number
	 *            0
	 * @return 十进制数字
	 * @throws Exception
	 */
	@RequestMapping("/secondToTenSystem")
	@ResponseBody
	public String secondToTenSystem(int system, String number) throws Exception {
		String secondSystem = systemService.secondToTenSystem(system, number);
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
	@RequestMapping("/systemToTenSystem")
	@ResponseBody
	public int systemToTenSystem(int system, String number) throws Exception {
		int tenSystem = systemService.systemToTenSystem(system, number);
		return tenSystem;
	}

}
