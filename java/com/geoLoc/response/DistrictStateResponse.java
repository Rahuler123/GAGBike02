package com.geoLoc.response;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.geoLoc.model.PincodeMaster;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;


@AllArgsConstructor

@ToString

public class DistrictStateResponse {
	
	@Id
	@Column(name="districtCode")
	private String districtCode;
    private String districtName;
    private String stateCode;

    
    public DistrictStateResponse() {
    	
    }

	public String getDistrictCode() {
		return districtCode;
	}

	public void setDistrictCode(String districtCode) {
		this.districtCode = districtCode;
	}

	public String getDistrictName() {
		return districtName;
	}

	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}

	public String getStateCode() {
		return stateCode;
	}

	public void setStateCode(String stateCode) {
		this.stateCode = stateCode;
	}

	

	public DistrictStateResponse(String districtCode, String districtName, String stateCode, PincodeMaster pincodeMaster) {
		super();
		this.districtCode = districtCode;
		this.districtName = districtName;
		this.stateCode = stateCode;
	
	}

    
    
}
