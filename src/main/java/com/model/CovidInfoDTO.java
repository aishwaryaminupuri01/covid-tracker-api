package com.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
@Data
public class CovidInfoDTO {

	public String checkTimeEt;
	public Integer commercialScore;
	public Integer dataQualityGrade;
	@JsonProperty(value = "date")
	public Integer dt;
	public Date dateChecked;
	public Date dateModified;
	public Integer death;
	public Integer deathConfirmed;
	public Integer deathIncrease;
	public Integer deathProbable;
	public String fips;
	public String grade;
	public String hash;
	public Integer hospitalized;
	public Integer hospitalizedCumulative;
	public Integer hospitalizedCurrently;
	public Integer hospitalizedDischarged;
	public Integer hospitalizedIncrease;
	public Integer inIcuCumulative;
	public Integer inIcuCurrently;
	public String lastUpdateEt;
	public Integer negative;
	public Integer negativeIncrease;
	public Integer negativeRegularScore;
	public Integer negativeScore;
	public Integer negativeTestsAntibody;
	public Integer negativeTestsPeopleAntibody;
	public Integer negativeTestsViral;
	public Integer onVentilatorCumulative;
	public Integer onVentilatorCurrently;
	public Integer pending;
	public Integer positive;
	public Integer positiveCasesViral;
	public Integer positiveIncrease;
	public Integer positiveScore;
	public Integer positiveTestsAntibody;
	public Integer positiveTestsAntigen;
	public Integer positiveTestsPeopleAntibody;
	public Integer positiveTestsPeopleAntigen;
	public Integer positiveTestsViral;
	public Integer posNeg;
	public Integer probableCases;
	public Integer recovered;
	public Integer score;
	public String state;
	public Integer total;
	public Integer totalTestEncountersViral;
	public Integer totalTestResults;
	public Integer totalTestResultsIncrease;
	public String totalTestResultsSource;
	public Integer totalTestsAntibody;
	public Integer totalTestsAntigen;
	public Integer totalTestsPeopleAntibody;
	public Integer totalTestsPeopleAntigen;
	public Integer totalTestsPeopleViral;
	public Integer totalTestsViral;
}
