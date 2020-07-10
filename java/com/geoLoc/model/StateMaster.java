package com.geoLoc.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;


import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;


@ToString
@Entity

@Table(name = "state_master_temporary")
public class StateMaster {
    @Id
    private String stateCode;
    private String stateNameCaps;
    private String countryCode;
    private String status;
    private String stateNameReg;
    private int min_pin_prefix;
    private int max_pin_prefix;
    
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "stateCode_FK", referencedColumnName = "stateCode")
    private List<DistrictMaster> districts;

	


	public StateMaster(String stateCode, String stateNameCaps, String countryCode,  String status,
			String stateNameReg, int min_pin_prefix, int max_pin_prefix, List<DistrictMaster> districts) {
		super();
		this.stateCode = stateCode;
		this.stateNameCaps = stateNameCaps;
		this.countryCode = countryCode;
		this.status = status;
		this.stateNameReg = stateNameReg;
		this.min_pin_prefix = min_pin_prefix;
		this.max_pin_prefix = max_pin_prefix;
		this.districts = districts;
	}


	public String getStateCode() {
		return stateCode;
	}


	public void setStateCode(String stateCode) {
		this.stateCode = stateCode;
	}



	public void setStateNameCaps(String stateNameCaps) {
		this.stateNameCaps = stateNameCaps;
	}


	public List<DistrictMaster> getDistricts() {
		return districts;
	}


	public void setDistricts(List<DistrictMaster> districts) {
		this.districts = districts;
	}


	public String getCountryCode() {
		return countryCode;
	}


	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}


	public void setStatus(String status) {
		this.status = status;
	}



	public void setStateNameReg(String stateNameReg) {
		this.stateNameReg = stateNameReg;
	}



	public void setMin_pin_prefix(int min_pin_prefix) {
		this.min_pin_prefix = min_pin_prefix;
	}





	public void setMax_pin_prefix(int max_pin_prefix) {
		this.max_pin_prefix = max_pin_prefix;
	}


	public StateMaster() {
		
	}
	public StateMaster(String  stateCode) {
		this.stateCode = stateCode;
	}


	public String getStateNameReg() {
		return stateNameReg;
	}
}


