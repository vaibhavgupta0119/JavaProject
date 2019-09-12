package com.kellton.Plants.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.kellton.Plants.Entity.MobileDetails;

@Repository
public interface MobileRepository extends JpaRepository<MobileDetails,Integer>{

}
