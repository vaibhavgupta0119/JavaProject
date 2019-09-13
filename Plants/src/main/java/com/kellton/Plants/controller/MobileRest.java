package com.kellton.Plants.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kellton.Plants.mv.MobileDetailsMV;
import com.kellton.Plants.service.MobileService;

@RestController
@RequestMapping("/plants")
public class MobileRest {
	@Autowired
	private MobileService mobileServiceImpl;

	@PostMapping("/savetoelastic")
	public void saveToElastic(MobileDetailsMV mobileDetailsMV) {
		mobileServiceImpl.toAddToElastic(mobileDetailsMV);
	}

}
