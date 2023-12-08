package com.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.dao.CovidTrackingDao;
import com.model.CovidInfoDTO;
import com.model.CovidRootInfoDTO;

@Service
public class CovidTrackingService {

	@Autowired
	private CovidTrackingDao covidTrackingDao;

	public List<CovidRootInfoDTO> getData() {
		List<CovidRootInfoDTO> list = covidTrackingDao.list();
		if (list != null && !list.isEmpty()) {
			return list;
		}
		return list;
	}
	
	public CovidInfoDTO getDataForState(String stateCode) {
		return covidTrackingDao.getDataForState(stateCode);
	}
}
