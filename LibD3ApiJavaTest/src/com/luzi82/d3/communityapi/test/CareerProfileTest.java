package com.luzi82.d3.communityapi.test;

import java.io.IOException;

import org.junit.Assert;
import org.junit.Test;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.luzi82.d3.communityapi.CareerProfile;
import com.luzi82.d3.communityapi.Const;
import com.luzi82.d3.communityapi.Hero;
import com.luzi82.d3.communityapi.IO;

public class CareerProfileTest {

	@Test
	public void test_000() throws JsonParseException, JsonMappingException, IOException {
		CareerProfile cp=IO.readCareerProfile("sample/careerprofile_000.json");
		
		Assert.assertEquals(12, cp.heroes.length);
		
		Hero hero=cp.heroes[0];
		Assert.assertEquals(317, hero.paragonLevel);
		Assert.assertEquals("LuziCrenata", hero.name);
		Assert.assertEquals(1784440, hero.id);
		Assert.assertEquals(70, hero.level);
		Assert.assertEquals(false, hero.hardcore);
		Assert.assertEquals(1, hero.gender);
		Assert.assertEquals("wizard", hero.clazz);
		Assert.assertEquals(1402106952L, hero.lastUpdated);
		
		Assert.assertEquals(Const.GENDER_FEMALE, cp.heroes[0].gender);
		
		Assert.assertEquals(Const.CLASS_WIZARD, cp.heroes[0].clazz);
		Assert.assertEquals(Const.CLASS_WITCHDOCTOR, cp.heroes[1].clazz);
		Assert.assertEquals(Const.CLASS_CRUSADER, cp.heroes[2].clazz);
		Assert.assertEquals(Const.CLASS_BARBARIAN, cp.heroes[3].clazz);
		Assert.assertEquals(Const.CLASS_DEMONHUNTER, cp.heroes[4].clazz);
		Assert.assertEquals(Const.CLASS_MONK, cp.heroes[5].clazz);
		
		Assert.assertEquals(true, cp.heroes[6].hardcore);
		
		Assert.assertEquals(1784440,cp.lastHeroPlayed);
		Assert.assertEquals(1402106952L,cp.lastUpdated);
		Assert.assertEquals(463614,cp.kills.monsters);
		Assert.assertEquals(40798,cp.kills.elites);
		Assert.assertEquals(832,cp.kills.hardcoreMonsters);
		Assert.assertEquals(0.302f,cp.timePlayed.barbarian,0.0001f);
		Assert.assertEquals(0.131f,cp.timePlayed.crusader,0.0001f);
		Assert.assertEquals(0.132f,cp.timePlayed.demonhunter,0.0001f);
		Assert.assertEquals(0.115f,cp.timePlayed.monk,0.0001f);
		Assert.assertEquals(0.939f,cp.timePlayed.witchdoctor,0.0001f);
		Assert.assertEquals(1.0f,cp.timePlayed.wizard,0.0001f);
		
		Assert.assertEquals(0,cp.fallenHeroes.length);
		
		Assert.assertEquals(317,cp.paragonLevel);
		Assert.assertEquals(0,cp.paragonLevelHardcore);
		Assert.assertEquals("luzi82#3202",cp.battleTag);
		Assert.assertEquals(true,cp.progression.act1);
		Assert.assertEquals(true,cp.progression.act2);
		Assert.assertEquals(true,cp.progression.act3);
		Assert.assertEquals(true,cp.progression.act4);
		Assert.assertEquals(true,cp.progression.act5);
	}

}
