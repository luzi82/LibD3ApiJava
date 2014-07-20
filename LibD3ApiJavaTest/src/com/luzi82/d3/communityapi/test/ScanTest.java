package com.luzi82.d3.communityapi.test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URISyntaxException;
import java.net.URL;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.apache.http.HttpEntity;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.junit.Assert;
import org.junit.Test;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.luzi82.d3.communityapi.CareerProfile;
import com.luzi82.d3.communityapi.Const;
import com.luzi82.d3.communityapi.Hero;
import com.luzi82.d3.communityapi.HeroProfile;
import com.luzi82.d3.communityapi.IO;
import com.luzi82.d3.communityapi.ItemInformation;

public class ScanTest {

	public static final String TMP_FOLDER = "tmp";
	public static final String SCAN_FOLDER = "sample/scan";

	@Test
	public void test() throws JsonParseException, JsonMappingException, IOException {
		boolean good = true;
		File scanFile = new File(SCAN_FOLDER);
		File[] scanFileSubList = scanFile.listFiles();
		for (File scanFileSub : scanFileSubList) {
			if (!scanFileSub.isDirectory())
				continue;
			File[] jFileList = scanFileSub.listFiles();
			for (File jFile : jFileList) {
				String jFileName = jFile.getName();
//				System.err.println(jFileName);
				try {
					if (jFileName.startsWith("career_")) {
						IO.readCareerProfile(jFile.getAbsolutePath());
					}
					if (jFileName.startsWith("hero_")) {
						IO.readHeroProfile(jFile.getAbsolutePath());
					}
					if (jFileName.startsWith("item_")) {
						IO.readItemInformation(jFile.getAbsolutePath());
					}
				} catch (Exception e) {
					System.err.println(e.getMessage());
					good = false;
				}
			}
		}
		Assert.assertTrue(good);
	}

}
