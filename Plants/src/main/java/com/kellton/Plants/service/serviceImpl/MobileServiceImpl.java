package com.kellton.Plants.service.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kellton.Plants.Entity.MobileDetailsES;
import com.kellton.Plants.mv.MobileDetailsMV;
import com.kellton.Plants.repository.MobileDetailsESRepo;
import com.kellton.Plants.service.MobileService;

@Service
public class MobileServiceImpl implements MobileService {
	
	@Autowired
	private MobileDetailsESRepo mobileDetailsESRepo;

//	@Autowired
//	private ModelMapper modelMapper;

	@Override
	public String toAddToElastic(MobileDetailsMV mobileDetailsMV) {
//		MobileDetailsES es = modelMapper.map(mobileDetailsMV, MobileDetailsES.class);
		
		MobileDetailsES es=new MobileDetailsES();
		es.setBrand("brand");
		mobileDetailsESRepo.save(es);
		return "done";
	}

}
