package com.luzi82.d3.communityapi;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class IO {

	public static CareerProfile readCareerProfile(String string)
			throws JsonParseException, JsonMappingException, IOException {
		ObjectMapper mapper = new ObjectMapper();
		CareerProfile out = mapper.readValue(new File(string),
				CareerProfile.class);
		return out;
	}

	public static HeroProfile readHeroProfile(String string)
			throws JsonParseException, JsonMappingException, IOException {
		ObjectMapper mapper = new ObjectMapper();
		HeroProfile out = mapper.readValue(new File(string), HeroProfile.class);
		return out;
	}

}
