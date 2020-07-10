package com.geoLoc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;


@ToString
@Entity
@Table(name = "district_master_temporary")
public class DistrictMaster {
	
	@Id
	@Column(name="districtCode")
	private String districtCode;
    private String districtName;
    private String stateNameCaps;
    private String state_code;
    private String countryCode;
    private String status;
    
    

	public void setState_code(String state_code) {
		this.state_code = state_code;
	}


	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}


	public void setStatus(String status) {
		this.status = status;
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



	public String getStateNameCaps() {
		return stateNameCaps;
	}



	public void setStateNameCaps(String stateNameCaps) {
		this.stateNameCaps = stateNameCaps;
	}



	public DistrictMaster(String districtCode, String districtName, String stateNameCaps, String state_code,
			String countryCode, String status) {
		super();
		this.districtCode = districtCode;
		this.districtName = districtName;
		this.stateNameCaps = stateNameCaps;
		this.state_code = state_code;
		this.countryCode = countryCode;
		this.status = status;
	}

    public DistrictMaster() {
    	
    }

}
