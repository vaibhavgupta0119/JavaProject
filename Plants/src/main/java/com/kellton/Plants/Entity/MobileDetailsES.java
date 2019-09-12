package com.kellton.Plants.Entity;

import java.io.Serializable;

import javax.persistence.Id;

import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName = "mobileDetails-index")
public class MobileDetailsES implements Serializable {
	@Id
	private String mobileId;

	private Integer mobileNo;

	private String brand;

	public String getMobileId() {
		return mobileId;
	}

	public void setMobileId(String mobileId) {
		this.mobileId = mobileId;
	}

	public Integer getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(Integer mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

}
