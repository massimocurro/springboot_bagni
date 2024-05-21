package com.example.demo.data;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BookingTimeJsonData {
	
	@JsonProperty("date")
	private Date date;
	
	@JsonProperty("id")
	private int id;
	
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getId() {
		return this.id;
	}
	
	public Date getDate() {
		return this.date;
	}
	
	public void setDate(Date date) {
		this.date = date;
	}
	
	
}
	
	

