package com.geoLoc.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.geoLoc.model.StateMaster;
@Repository
public interface StateRepo extends JpaRepository<StateMaster,String> {
	
	public List<StateMaster> findByStateCode(String stateCode);

}