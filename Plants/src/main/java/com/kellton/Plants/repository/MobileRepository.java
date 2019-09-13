package com.kellton.Plants.repository;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.kellton.Plants.Entity.MobileDetails;

@Repository
public interface MobileRepository extends MongoRepository<MobileDetails,String>{

}
