package com.geoLoc.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;


@ToString
@Entity

@Table(name = "pincode_master_temporary")
public class PincodeMaster {
    @Id
    @GeneratedValue
    @Column(name = "pincode")
    private int pincode;
    private String  districtCode;
    private String  stateCode;
	private String countryCode;
    
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "dist_fk", referencedColumnName = "districtCode")
    private DistrictMaster districtMasters;

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public String getDistrictCode() {
		return districtCode;
	}

	public void setDistrictCode(String districtCode) {
		this.districtCode = districtCode;
	}

	public String getStateCode() {
		return stateCode;
	}

	public void setStateCode(String stateCode) {
		this.stateCode = stateCode;
	}

	public DistrictMaster getDistricts() {
		return districtMasters;
	}

	public void setDistrictss(DistrictMaster districtMasters) {
		this.districtMasters = districtMasters;
	}
    public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

    
	public PincodeMaster(int pincode, String districtCode, String stateCode, String countryCode, DistrictMaster districtMasters) {
		super();
		this.pincode = pincode;
		this.districtCode = districtCode;
		this.stateCode = stateCode;
		this.countryCode = countryCode;
		this.districtMasters = districtMasters;
	}

	public PincodeMaster() {
		
	}
	public PincodeMaster(int pincode) {
		this.pincode = pincode;
	}

   
}
