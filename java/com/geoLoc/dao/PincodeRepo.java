package com.geoLoc.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.geoLoc.model.PincodeMaster;
@Repository
public interface PincodeRepo extends JpaRepository<PincodeMaster,Integer> {
	
	public List<PincodeMaster> findByPincode(int pincode);

}
