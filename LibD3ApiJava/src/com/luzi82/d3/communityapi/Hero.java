package com.luzi82.d3.communityapi;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Hero {

	public int paragonLevel;
	
	public String name;
	
	public int id;
	
	public int level;
	
	public boolean hardcore;
	
	public int gender;
	
	public boolean dead;
	
	@JsonProperty("class")
	public String clazz;
	
	@JsonProperty("last-updated")
	public long lastUpdated;
	
}
