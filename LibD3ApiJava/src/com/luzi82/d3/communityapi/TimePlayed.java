package com.luzi82.d3.communityapi;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TimePlayed {

	public float barbarian;
	public float crusader;
	@JsonProperty("demon-hunter")
	public float demonhunter;
	public float monk;
	@JsonProperty("witch-doctor")
	public float witchdoctor;
	public float wizard;

}
