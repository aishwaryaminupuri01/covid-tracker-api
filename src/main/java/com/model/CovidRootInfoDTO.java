package com.model;

import com.CustomCovidRootInfoSerializer;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@JsonSerialize(using = CustomCovidRootInfoSerializer.class)
public class CovidRootInfoDTO {

	private CovidInfoDTO covidInfoDTO;
	private String stateCode;
}
