package com.geoLoc.dto;

import java.util.List;

import lombok.Data;

@Data
public class StateDto {
	private String stateCode;
	private String stateNameCaps;
	private String countryCode;
	private String status;
	private String stateNameReg;
	
	List<DstrictResponseDto> districtdto;
}