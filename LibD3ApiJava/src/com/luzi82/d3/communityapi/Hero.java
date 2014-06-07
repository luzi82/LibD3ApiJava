package com.luzi82.d3.communityapi;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Hero {

	public int paragonLevel;
	
	public String name;
	
	public int id;
	
	public int level;
	
	public boolean hardcore;
	
	public static final int GENDER_MALE = 0;
	public static final int GENDER_FEMALE = 1;
	
	public int gender;
	
	public boolean dead;
	
	public static final String CLASS_WIZARD = "wizard";
	public static final String CLASS_WITCHDOCTOR = "witch-doctor";
	public static final String CLASS_CRUSADER = "crusader";
	public static final String CLASS_BARBARIAN = "barbarian";
	public static final String CLASS_DEMONHUNTER = "demon-hunter";
	public static final String CLASS_MONK = "monk";

	@JsonProperty("class")
	public String clazz;
	
	@JsonProperty("last-updated")
	public long lastUpdated;
	
}
