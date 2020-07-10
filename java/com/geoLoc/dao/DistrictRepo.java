package com.geoLoc.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.geoLoc.model.DistrictMaster;

public interface DistrictRepo extends JpaRepository<DistrictMaster, String>{

}
