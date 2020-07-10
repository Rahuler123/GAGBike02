package com.geoLoc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.geoLoc.dao.PincodeRepo;
import com.geoLoc.dao.StateRepo;
import com.geoLoc.dto.PincodeRequestDto;
import com.geoLoc.dto.StateRequestDto;
import com.geoLoc.model.PincodeMaster;
import com.geoLoc.model.StateMaster;

import java.util.List;


@RestController
@RequestMapping("/geoLoc")
public class GeoLocController {
    @Autowired
    private PincodeRepo pincodeRepository;
    
    @Autowired
    private StateRepo stateRepository;
    
    @PostMapping("/getPinCode")
    public List<PincodeMaster> findByPincode(@RequestBody PincodeRequestDto pincode){
    	
    	PincodeMaster pincodeObj = new PincodeMaster(pincode.getPincode());
    	//int pincodeString = pincodeMaster.getPincode();
        return pincodeRepository.findByPincode(pincodeObj.getPincode());
    }

    @PostMapping("/getAllDistrict")
    public List<StateMaster> findByState(@RequestBody StateRequestDto stateRequestDto){
    	StateMaster stateMaster = new StateMaster(stateRequestDto.getStateCode());
        return stateRepository.findByStateCode(stateMaster.getStateCode());
    }
    
 
}
