package com.kellton.Plants.service.serviceImpl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import com.kellton.Plants.Entity.MobileDetailsES;
import com.kellton.Plants.mv.MobileDetailsMV;
import com.kellton.Plants.repository.MobileDetailsESRepo;
import com.kellton.Plants.service.MobileService;

public class MobileServiceImpl implements MobileService {
	@Autowired
	private MobileDetailsESRepo mobileDetailsESRepo;

	@Autowired
	private ModelMapper modelMapper;

	@Override
	public String toAddToElastic(MobileDetailsMV mobileDetailsMV) {
		MobileDetailsES mobileDetailsVM = modelMapper.map(mobileDetailsMV, MobileDetailsES.class);
		mobileDetailsESRepo.save(mobileDetailsVM);
		return "done";
	}

}
