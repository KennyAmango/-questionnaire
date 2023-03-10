package com.example.questionnaire.vo;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

import com.example.questionnaire.entity.PercentageStatistics;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class QusDetailsRes {

	private String title;

	private String details;

	private LocalDate startTime;

	private LocalDate endTime;

	private Map<String, Map<String, Integer>> qusAndOptions;
	
	private Map<String, Map<String, Integer>> percentageStatics;
	
	private List<PercentageStatistics> statisticsList;
	
	private String message;

	public QusDetailsRes() {

	}

	public QusDetailsRes(String message) {
		this.message = message;
	}

	public QusDetailsRes(String title, String details, LocalDate startTime, LocalDate endTime,
			String message, Map<String, Map<String, Integer>> qusAndOptions) {

		this.title = title;
		this.details = details;
		this.startTime = startTime;
		this.endTime = endTime;
		this.message = message;
		this.qusAndOptions = qusAndOptions;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public LocalDate getStartTime() {
		return startTime;
	}

	public void setStartTime(LocalDate startTime) {
		this.startTime = startTime;
	}

	public LocalDate getEndTime() {
		return endTime;
	}

	public void setEndTime(LocalDate endTime) {
		this.endTime = endTime;
	}

	public Map<String, Map<String, Integer>> getQusAndOptions() {
		return qusAndOptions;
	}

	public void setQusAndOptions(Map<String, Map<String, Integer>> qusAndOptions) {
		this.qusAndOptions = qusAndOptions;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Map<String, Map<String, Integer>> getPercentageStatics() {
		return percentageStatics;
	}

	public void setPercentageStatics(Map<String, Map<String, Integer>> percentageStatics) {
		this.percentageStatics = percentageStatics;
	}

	public List<PercentageStatistics> getStatisticsList() {
		return statisticsList;
	}

	public void setStatisticsList(List<PercentageStatistics> statisticsList) {
		this.statisticsList = statisticsList;
	}

}
