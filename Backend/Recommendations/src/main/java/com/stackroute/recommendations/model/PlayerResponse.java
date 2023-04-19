package com.stackroute.recommendations.model;

import java.util.ArrayList;
import java.util.List;

public class PlayerResponse {

	  private String apiKey;

	    private List<PlayerDto> data=new ArrayList<>();

	    public String getApiKey() {
	        return apiKey;
	    }

	    public void setApiKey(String apiKey) {
	        this.apiKey = apiKey;
	    }

	    public List<PlayerDto> getData() {
	        return (this.data);
	    }

	    public void setData(List<PlayerDto> data) {
	        this.data = data;
	    }
}
