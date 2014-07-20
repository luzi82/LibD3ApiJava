package com.luzi82.d3.communityapi;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class IO {

	public static CareerProfile readCareerProfile(String string) throws JsonParseException, JsonMappingException, IOException {
		ObjectMapper mapper = new ObjectMapper();
		CareerProfile out = mapper.readValue(new File(string), CareerProfile.class);
		return out;
	}

	public static HeroProfile readHeroProfile(String string) throws JsonParseException, JsonMappingException, IOException {
		ObjectMapper mapper = new ObjectMapper();
		HeroProfile out = mapper.readValue(new File(string), HeroProfile.class);
		return out;
	}

	public static ItemInformation readItemInformation(String string) throws JsonParseException, JsonMappingException, IOException {
		ObjectMapper mapper = new ObjectMapper();
		ItemInformation out = mapper.readValue(new File(string), ItemInformation.class);
		return out;
	}

	public static URL careerProfileUrl(String server, String name, int code) {
		try {
			final String URL_FORMAT = "%s/api/d3/profile/%s-%d/";
			String urlString = String.format(URL_FORMAT, server, name, code);
			return new URL(urlString);
		} catch (MalformedURLException e) {
			throw new Error(e);
		}
	}

	public static CareerProfile readCareerProfile(String server, String name, int code) throws JsonParseException, IOException {
		ObjectMapper mapper = new ObjectMapper();
		CareerProfile out = mapper.readValue(careerProfileUrl(server, name, code), CareerProfile.class);
		return out;
	}

	public static URL heroProfileUrl(String server, String name, int code, int id) {
		try {
			final String URL_FORMAT = "%s/api/d3/profile/%s-%d/hero/%d";
			String urlString = String.format(URL_FORMAT, server, name, code, id);
			return new URL(urlString);
		} catch (MalformedURLException e) {
			throw new Error(e);
		}
	}

	public static HeroProfile readHeroProfile(String server, String name, int code, int id) throws JsonParseException, IOException {
		ObjectMapper mapper = new ObjectMapper();
		HeroProfile out = mapper.readValue(heroProfileUrl(server, name, code, id), HeroProfile.class);
		return out;
	}

	public static URL itemInformationUrl(String server, String tooltipParams) {
		try {
			final String URL_FORMAT = "%s/api/d3/data/%s";
			String urlString = String.format(URL_FORMAT, server, tooltipParams);
			return new URL(urlString);
		} catch (MalformedURLException e) {
			throw new Error(e);
		}
	}

	public static ItemInformation readItemInformation(String server, String tooltipParams) throws JsonParseException, IOException {
		ObjectMapper mapper = new ObjectMapper();
		ItemInformation out = mapper.readValue(itemInformationUrl(server, tooltipParams), ItemInformation.class);
		return out;

	}

}
