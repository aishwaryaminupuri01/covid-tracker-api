package com.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSourceUtils;
import org.springframework.stereotype.Repository;

import com.model.CovidInfoDTO;
import com.model.CovidRootInfoDTO;

@Repository
public class CovidTrackingDao {

	@Autowired
	private NamedParameterJdbcTemplate jdbcTemplate;
	

	public List<CovidRootInfoDTO> list() {
		try {
			List<CovidInfoDTO> list = jdbcTemplate.query("SELECT * FROM covid_stats", new MapSqlParameterSource(), new BeanPropertyRowMapper<CovidInfoDTO>(CovidInfoDTO.class));
			List<CovidRootInfoDTO> rootList = new ArrayList<>(list.size());
			list.stream().forEach(dto -> {
				rootList.add(new CovidRootInfoDTO(dto, dto.getState()));
			});
			return rootList;
		} catch (DataAccessException dae) {
			return null;
		}
	}
	
	public CovidInfoDTO getDataForState(String stateCode) {
		try {
			return jdbcTemplate.queryForObject("SELECT * FROM covid_stats WHERE state = :stateCode", new MapSqlParameterSource("stateCode", stateCode), new BeanPropertyRowMapper<CovidInfoDTO>(CovidInfoDTO.class));
		} catch (DataAccessException dae) {
			return null;
		}
	}
}
