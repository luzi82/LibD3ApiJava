package com.luzi82.d3.communityapi.test;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
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
import org.junit.Test;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.luzi82.d3.communityapi.CareerProfile;
import com.luzi82.d3.communityapi.Const;
import com.luzi82.d3.communityapi.Hero;
import com.luzi82.d3.communityapi.HeroProfile;
import com.luzi82.d3.communityapi.IO;
import com.luzi82.d3.communityapi.ItemInformation;

public class WebTest {

	public static final String TMP_FOLDER = "tmp";

	public static final String TMP_JSON = TMP_FOLDER + "/tmp.json";

	@Test
	public void test() throws JsonParseException, JsonMappingException, IOException {
		t(Const.SERVER_US, "luzi82", 3202);
	}

	private void t(String server, String name, int code) throws JsonParseException, JsonMappingException, IOException {
		System.err.println(String.format("profile: %s %s %d", server, name, code));
		URL url = IO.careerProfileUrl(server, name, code);
		download(url);
		// CareerProfile cp = IO.readCareerProfile(server, name, code);
		CareerProfile cp = IO.readCareerProfile(TMP_JSON);
		for (Hero hero : cp.heroes) {
			System.err.println(String.format("hero id: %s", hero.id));
			HeroProfile hp = IO.readHeroProfile(server, name, code, hero.id);

			checkItem(server, hp.items.head);
			checkItem(server, hp.items.torso);
			checkItem(server, hp.items.feet);
			checkItem(server, hp.items.hands);
			checkItem(server, hp.items.shoulders);
			checkItem(server, hp.items.legs);
			checkItem(server, hp.items.bracers);
			checkItem(server, hp.items.mainHand);
			checkItem(server, hp.items.offHand);
			checkItem(server, hp.items.waist);
			checkItem(server, hp.items.rightFinger);
			checkItem(server, hp.items.leftFinger);
			checkItem(server, hp.items.neck);

			if (hp.followers.templar != null) {
				checkItem(server, hp.followers.templar.items.special);
				checkItem(server, hp.followers.templar.items.mainHand);
				checkItem(server, hp.followers.templar.items.offHand);
				checkItem(server, hp.followers.templar.items.rightFinger);
				checkItem(server, hp.followers.templar.items.leftFinger);
				checkItem(server, hp.followers.templar.items.neck);
			}
			if (hp.followers.scoundrel != null) {
				checkItem(server, hp.followers.scoundrel.items.special);
				checkItem(server, hp.followers.scoundrel.items.mainHand);
				checkItem(server, hp.followers.scoundrel.items.offHand);
				checkItem(server, hp.followers.scoundrel.items.rightFinger);
				checkItem(server, hp.followers.scoundrel.items.leftFinger);
				checkItem(server, hp.followers.scoundrel.items.neck);
			}
			if (hp.followers.enchantress != null) {
				checkItem(server, hp.followers.enchantress.items.special);
				checkItem(server, hp.followers.enchantress.items.mainHand);
				checkItem(server, hp.followers.enchantress.items.offHand);
				checkItem(server, hp.followers.enchantress.items.rightFinger);
				checkItem(server, hp.followers.enchantress.items.leftFinger);
				checkItem(server, hp.followers.enchantress.items.neck);
			}

		}
	}

	private void checkItem(String server, ItemInformation itemInfo) throws JsonParseException, IOException {
		if (itemInfo == null)
			return;
		System.err.println(String.format("item id: %s", itemInfo.tooltipParams));
		// IO.readItemInformation(server, itemInfo.tooltipParams);
		URL url = IO.itemInformationUrl(server, itemInfo.tooltipParams);
		download(url);
		IO.readItemInformation(TMP_JSON);
	}

	private void download(URL url) throws IOException {
		System.err.println(url.toString());

		FileUtils.forceMkdir(new File(TMP_FOLDER));

		CloseableHttpClient chc = null;
		HttpGet hg = null;
		CloseableHttpResponse chr = null;
		HttpEntity he = null;
		InputStream is = null;
		FileOutputStream fos = null;
		try {
			chc = HttpClients.createDefault();
			hg = new HttpGet(url.toURI());
			chr = chc.execute(hg);
			he = chr.getEntity();
			is = he.getContent();
			fos = new FileOutputStream(TMP_JSON);
			IOUtils.copy(is, fos);
		} catch (URISyntaxException e) {
			throw new Error(e);
		} catch (ClientProtocolException e) {
			throw new Error(e);
		} catch (IOException e) {
			throw e;
		} finally {
			IOUtils.closeQuietly(is);
			IOUtils.closeQuietly(fos);
			IOUtils.closeQuietly(chr);
			IOUtils.closeQuietly(chc);
		}
	}

}
