package com.kellton.Plants.repository;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import com.kellton.Plants.Entity.MobileDetailsES;

public interface MobileDetailsESRepo extends ElasticsearchRepository<MobileDetailsES,String>{

}
