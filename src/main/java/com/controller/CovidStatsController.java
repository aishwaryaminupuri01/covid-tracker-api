package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.model.CovidInfoDTO;
import com.model.CovidRootInfoDTO;
import com.service.CovidTrackingService;

@Controller
public class CovidStatsController {

	@Autowired
	private CovidTrackingService covidTrackingService;
	
	
	@RequestMapping(value = "/getDataForState", method = { RequestMethod.GET }, produces = {
			MediaType.APPLICATION_JSON_VALUE })
	@ResponseBody
	public CovidInfoDTO getDataForState(@RequestParam(name = "stateCode", required = true) String stateCode) {		
		return covidTrackingService.getDataForState(stateCode);
	}
	
	@RequestMapping(value = "/getStats", method = { RequestMethod.GET }, produces = {
			MediaType.APPLICATION_JSON_VALUE })
	@ResponseBody
	public List<CovidRootInfoDTO> getData() {
		return covidTrackingService.getData();

	}
}
