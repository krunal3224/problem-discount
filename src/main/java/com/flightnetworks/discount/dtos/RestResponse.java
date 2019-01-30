package com.flightnetworks.discount.dtos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(value = "true")
public class RestResponse {

	private String customMessage = "";

	public RestResponse() {
	}

	public RestResponse(String customMessage) {
		this.customMessage = customMessage;
	}

	public String getCustomMessage() {
		return customMessage;
	}

	public void setCustomMessage(String customMessage) {
		this.customMessage = customMessage;
	}

}
