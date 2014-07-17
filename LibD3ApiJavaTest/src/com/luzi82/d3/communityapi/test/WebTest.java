package com.luzi82.d3.communityapi.test;

import java.io.IOException;

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

	@Test
	public void test() throws JsonParseException, JsonMappingException,
			IOException {
		t(Const.SERVER_US, "luzi82", 3202);
	}

	private void t(String server, String name, int code)
			throws JsonParseException, JsonMappingException, IOException {
		System.err.println(String.format("profile: %s %s %d", server, name,
				code));
		CareerProfile cp = IO.readCareerProfile(server, name, code);
		for (Hero hero : cp.heroes) {
			System.err.println(String.format("hero id: %s", hero.id));
			HeroProfile hp = IO.readHeroProfile(server, name, code, hero.id);

			checkItem(server,hp.items.head);
			checkItem(server,hp.items.torso);
			checkItem(server,hp.items.feet);
			checkItem(server,hp.items.hands);
			checkItem(server,hp.items.shoulders);
			checkItem(server,hp.items.legs);
			checkItem(server,hp.items.bracers);
			checkItem(server,hp.items.mainHand);
			checkItem(server,hp.items.offHand);
			checkItem(server,hp.items.waist);
			checkItem(server,hp.items.rightFinger);
			checkItem(server,hp.items.leftFinger);
			checkItem(server,hp.items.neck);
			
			checkItem(server,hp.followers.templar.items.special);
			checkItem(server,hp.followers.templar.items.mainHand);
			checkItem(server,hp.followers.templar.items.offHand);
			checkItem(server,hp.followers.templar.items.rightFinger);
			checkItem(server,hp.followers.templar.items.leftFinger);
			checkItem(server,hp.followers.templar.items.neck);
			checkItem(server,hp.followers.scoundrel.items.special);
			checkItem(server,hp.followers.scoundrel.items.mainHand);
			checkItem(server,hp.followers.scoundrel.items.offHand);
			checkItem(server,hp.followers.scoundrel.items.rightFinger);
			checkItem(server,hp.followers.scoundrel.items.leftFinger);
			checkItem(server,hp.followers.scoundrel.items.neck);
			checkItem(server,hp.followers.enchantress.items.special);
			checkItem(server,hp.followers.enchantress.items.mainHand);
			checkItem(server,hp.followers.enchantress.items.offHand);
			checkItem(server,hp.followers.enchantress.items.rightFinger);
			checkItem(server,hp.followers.enchantress.items.leftFinger);
			checkItem(server,hp.followers.enchantress.items.neck);

		}
	}

	private void checkItem(String server,ItemInformation itemInfo) throws JsonParseException, IOException {
		if(itemInfo==null)
			return;
		System.err.println(String.format("item id: %s", itemInfo.tooltipParams));
		IO.readItemInformation(server,itemInfo.tooltipParams);
	}

}
