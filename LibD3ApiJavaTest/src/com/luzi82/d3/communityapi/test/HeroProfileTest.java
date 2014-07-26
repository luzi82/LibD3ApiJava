package com.luzi82.d3.communityapi.test;

import java.io.IOException;

import org.junit.Assert;
import org.junit.Test;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.luzi82.d3.communityapi.Const;
import com.luzi82.d3.communityapi.HeroProfile;
import com.luzi82.d3.communityapi.IO;

public class HeroProfileTest {

	@Test
	public void test_000() throws JsonParseException, JsonMappingException,
			IOException {
		HeroProfile hp = IO.readHeroProfile("sample/heroprofile_000.json");

		Assert.assertEquals(1784440, hp.id);
		Assert.assertEquals("LuziCrenata", hp.name);
		Assert.assertEquals(Const.CLASS_WIZARD, hp.clazz);
		Assert.assertEquals(Const.GENDER_FEMALE, hp.gender);
		Assert.assertEquals(70, hp.level);
		Assert.assertEquals(317, hp.paragonLevel);
		Assert.assertEquals(false, hp.hardcore);
		
		Assert.assertEquals(6, hp.skills.active.length);
		Assert.assertEquals("black-hole", hp.skills.active[0].skill.slug);
		Assert.assertEquals("Black Hole", hp.skills.active[0].skill.name);
		Assert.assertEquals("x1_wizard_wormhole", hp.skills.active[0].skill.icon);
		Assert.assertEquals(61, hp.skills.active[0].skill.level);
		Assert.assertEquals("mastery", hp.skills.active[0].skill.categorySlug);
		Assert.assertEquals("skill/wizard/black-hole", hp.skills.active[0].skill.tooltipUrl);
		Assert.assertEquals("Cost: 20 Arcane Power\r\nCooldown: 12 seconds\r\n\r\nConjure a Black Hole at the target location that draws enemies to it and deals 360% weapon damage as Arcane over 2 seconds to all enemies within 15 yards.", hp.skills.active[0].skill.description);
		Assert.assertEquals("Cost: 20 Arcane Power\r\nCooldown: 12 seconds\r\n\r\nConjure a Black Hole that draws enemies to it and deals damage.", hp.skills.active[0].skill.simpleDescription);
		Assert.assertEquals("N", hp.skills.active[0].skill.skillCalcId);
		Assert.assertEquals("black-hole-c", hp.skills.active[0].rune.slug);
		Assert.assertEquals("c", hp.skills.active[0].rune.type);
		Assert.assertEquals("Blazar", hp.skills.active[0].rune.name);
		Assert.assertEquals(67, hp.skills.active[0].rune.level);
		Assert.assertEquals("Conjure a Black Hole at the target location that draws enemies to it and deals 360% weapon damage as Fire over 2 seconds to all enemies within 15 yards.\r\n\r\nAfter the Black Hole disappears, an explosion occurs that deals 464% weapon damage as Fire to enemies within 15 yards.", hp.skills.active[0].rune.description);
		Assert.assertEquals("A fiery explosion occurs after the Black Hole disappears.\r\n\r\nBlack Hole's damage turns into Fire.", hp.skills.active[0].rune.simpleDescription);
		Assert.assertEquals("rune/black-hole/c", hp.skills.active[0].rune.tooltipParams);
		Assert.assertEquals("Y", hp.skills.active[0].rune.skillCalcId);
		Assert.assertEquals(3, hp.skills.active[0].rune.order);
		Assert.assertEquals("energy-armor", hp.skills.active[5].skill.slug);
		Assert.assertEquals("energy-armor-a", hp.skills.active[5].rune.slug);
		
		Assert.assertEquals(4, hp.skills.passive.length);
		Assert.assertEquals("blur", hp.skills.passive[0].skill.slug);
		Assert.assertEquals("Blur", hp.skills.passive[0].skill.name);
		Assert.assertEquals("wizard_passive_blur", hp.skills.passive[0].skill.icon);
		Assert.assertEquals(10, hp.skills.passive[0].skill.level);
		Assert.assertEquals("skill/wizard/blur", hp.skills.passive[0].skill.tooltipUrl);
		Assert.assertEquals("Decrease damage taken by 17%.", hp.skills.passive[0].skill.description);
		Assert.assertEquals("Truly powerful Wizards have been known to turn their magic inward, transmuting the very composition of their own bodies for boundless energy and catlike reflexes.", hp.skills.passive[0].skill.flavor);
		Assert.assertEquals("Z", hp.skills.passive[0].skill.skillCalcId);
		Assert.assertEquals("conflagration", hp.skills.passive[3].skill.slug);
		
		Assert.assertEquals("Unique_Helm_014_x1", hp.items.head.id);
		Assert.assertEquals("Aughild's Spike", hp.items.head.name);
		Assert.assertEquals("unique_helm_014_x1_demonhunter_male", hp.items.head.icon);
		Assert.assertEquals("green", hp.items.head.displayColor);
		Assert.assertEquals("item/CoUBCK6p7toPEgcIBBUYpf4THTsnbyQd83AHrR3mFdsNHZsGAMsdco4dIR1xi3fwMI8COIoBQABICVASWARg-gFqKQoMCAAQy7WNoICAgOAeEhkI3JPZ8gUSBwgEFYUnlLEwjwI4AEABkAEAjQHavf8TpQE7J28krQFmIwZQuAH02bmQDMABAhiwlPW_AlAEWAKgAbCU9b8CoAHKy8_wBg", hp.items.head.tooltipParams);
		Assert.assertEquals("Unique_Helm_016_x1", hp.items.head.transmogItem.id);
		Assert.assertEquals("Sage's Apogee", hp.items.head.transmogItem.name);
		Assert.assertEquals("unique_helm_016_x1_demonhunter_male", hp.items.head.transmogItem.icon);
		Assert.assertEquals("green", hp.items.head.transmogItem.displayColor);
		Assert.assertEquals("recipe/sages-apogee", hp.items.head.transmogItem.tooltipParams);
		Assert.assertEquals(0, hp.items.head.transmogItem.randomAffixes.length);
		Assert.assertEquals("T12_Legendary_Set_Sage_Helm_X1", hp.items.head.transmogItem.recipe.id);
		Assert.assertEquals("sages-apogee", hp.items.head.transmogItem.recipe.slug);
		Assert.assertEquals("Sage's Apogee", hp.items.head.transmogItem.recipe.name);
		Assert.assertEquals(36720, hp.items.head.transmogItem.recipe.cost);
		Assert.assertEquals(5, hp.items.head.transmogItem.recipe.reagents.length);
		Assert.assertEquals(1, hp.items.head.transmogItem.recipe.reagents[0].quantity);
		Assert.assertEquals("Helm_208", hp.items.head.transmogItem.recipe.reagents[0].item.id);
		Assert.assertEquals("Ascended Crown", hp.items.head.transmogItem.recipe.reagents[0].item.name);
		Assert.assertEquals("helm_208_demonhunter_male", hp.items.head.transmogItem.recipe.reagents[0].item.icon);
		Assert.assertEquals("white", hp.items.head.transmogItem.recipe.reagents[0].item.displayColor);
		Assert.assertEquals("item/ascended-crown", hp.items.head.transmogItem.recipe.reagents[0].item.tooltipParams);
		Assert.assertEquals("Unique_Helm_016_x1", hp.items.head.transmogItem.recipe.itemProduced.id);
		Assert.assertEquals("Sage's Apogee", hp.items.head.transmogItem.recipe.itemProduced.name);
		Assert.assertEquals("unique_helm_016_x1_demonhunter_male", hp.items.head.transmogItem.recipe.itemProduced.icon);
		Assert.assertEquals("green", hp.items.head.transmogItem.recipe.itemProduced.displayColor);
		Assert.assertEquals("recipe/sages-apogee", hp.items.head.transmogItem.recipe.itemProduced.tooltipParams);
		Assert.assertEquals(1, hp.items.head.transmogItem.craftedBy.length);
		Assert.assertEquals("T12_Legendary_Set_Sage_Helm_X1", hp.items.head.transmogItem.craftedBy[0].id);
		Assert.assertEquals("sages-apogee", hp.items.head.transmogItem.craftedBy[0].slug);
		Assert.assertEquals("Sage's Apogee", hp.items.head.transmogItem.craftedBy[0].name);
		Assert.assertEquals(36720, hp.items.head.transmogItem.craftedBy[0].cost);
		Assert.assertEquals(5, hp.items.head.transmogItem.craftedBy[0].reagents.length);
		Assert.assertEquals(1, hp.items.head.transmogItem.craftedBy[0].reagents[0].quantity);
		Assert.assertEquals("Helm_208", hp.items.head.transmogItem.craftedBy[0].reagents[0].item.id);
		Assert.assertEquals("Ascended Crown", hp.items.head.transmogItem.craftedBy[0].reagents[0].item.name);
		Assert.assertEquals("helm_208_demonhunter_male", hp.items.head.transmogItem.craftedBy[0].reagents[0].item.icon);
		Assert.assertEquals("white", hp.items.head.transmogItem.craftedBy[0].reagents[0].item.displayColor);
		Assert.assertEquals("item/ascended-crown", hp.items.head.transmogItem.craftedBy[0].reagents[0].item.tooltipParams);
		Assert.assertEquals(0, hp.items.head.randomAffixes.length);
		Assert.assertEquals("T12_Legendary_Set_Aughild_Helm_X1", hp.items.head.recipe.id);
		Assert.assertEquals("aughilds-spike", hp.items.head.recipe.slug);
		Assert.assertEquals("Aughild's Spike", hp.items.head.recipe.name);
		Assert.assertEquals(36720, hp.items.head.recipe.cost);
		Assert.assertEquals(5, hp.items.head.recipe.reagents.length);
		Assert.assertEquals(1, hp.items.head.recipe.reagents[0].quantity);
		Assert.assertEquals("Helm_208", hp.items.head.recipe.reagents[0].item.id);
		Assert.assertEquals("Ascended Crown", hp.items.head.recipe.reagents[0].item.name);
		Assert.assertEquals("helm_208_demonhunter_male", hp.items.head.recipe.reagents[0].item.icon);
		Assert.assertEquals("white", hp.items.head.recipe.reagents[0].item.displayColor);
		Assert.assertEquals("item/ascended-crown", hp.items.head.recipe.reagents[0].item.tooltipParams);
		Assert.assertEquals("Unique_Helm_014_x1", hp.items.head.recipe.itemProduced.id);
		Assert.assertEquals("Aughild's Spike", hp.items.head.recipe.itemProduced.name);
		Assert.assertEquals("unique_helm_014_x1_demonhunter_male", hp.items.head.recipe.itemProduced.icon);
		Assert.assertEquals("green", hp.items.head.recipe.itemProduced.displayColor);
		Assert.assertEquals("recipe/aughilds-spike", hp.items.head.recipe.itemProduced.tooltipParams);
		Assert.assertEquals(1, hp.items.head.craftedBy.length);
		Assert.assertEquals("T12_Legendary_Set_Aughild_Helm_X1", hp.items.head.craftedBy[0].id);
		Assert.assertEquals("aughilds-spike", hp.items.head.craftedBy[0].slug);
		Assert.assertEquals("Aughild's Spike", hp.items.head.craftedBy[0].name);
		Assert.assertEquals(36720, hp.items.head.craftedBy[0].cost);
		Assert.assertEquals(5, hp.items.head.craftedBy[0].reagents.length);
		Assert.assertEquals(1, hp.items.head.craftedBy[0].reagents[0].quantity);
		Assert.assertEquals("Helm_208", hp.items.head.craftedBy[0].reagents[0].item.id);
		Assert.assertEquals("Ascended Crown", hp.items.head.craftedBy[0].reagents[0].item.name);
		Assert.assertEquals("helm_208_demonhunter_male", hp.items.head.craftedBy[0].reagents[0].item.icon);
		Assert.assertEquals("white", hp.items.head.craftedBy[0].reagents[0].item.displayColor);
		Assert.assertEquals("item/ascended-crown", hp.items.head.craftedBy[0].reagents[0].item.tooltipParams);
		Assert.assertEquals("Unique_Helm_014_x1", hp.items.head.craftedBy[0].itemProduced.id);
		Assert.assertEquals("Aughild's Spike", hp.items.head.craftedBy[0].itemProduced.name);
		Assert.assertEquals("unique_helm_014_x1_demonhunter_male", hp.items.head.craftedBy[0].itemProduced.icon);
		Assert.assertEquals("green", hp.items.head.craftedBy[0].itemProduced.displayColor);
		Assert.assertEquals("recipe/aughilds-spike", hp.items.head.craftedBy[0].itemProduced.tooltipParams);
		
		Assert.assertNotNull(hp.items.head);
		Assert.assertNotNull(hp.items.torso);
		Assert.assertNotNull(hp.items.feet);
		Assert.assertNotNull(hp.items.hands);
		Assert.assertNotNull(hp.items.shoulders);
		Assert.assertNotNull(hp.items.legs);
		Assert.assertNotNull(hp.items.bracers);
		Assert.assertNotNull(hp.items.mainHand);
		Assert.assertNotNull(hp.items.offHand);
		Assert.assertNotNull(hp.items.waist);
		Assert.assertNotNull(hp.items.rightFinger);
		Assert.assertNotNull(hp.items.leftFinger);
		Assert.assertNotNull(hp.items.neck);
		
		Assert.assertEquals("templar",hp.followers.templar.slug);
		Assert.assertEquals(0,hp.followers.templar.level);
		Assert.assertNotNull(hp.followers.templar.items.special);
		Assert.assertNotNull(hp.followers.templar.items.mainHand);
		Assert.assertNotNull(hp.followers.templar.items.offHand);
		Assert.assertNotNull(hp.followers.templar.items.rightFinger);
		Assert.assertNotNull(hp.followers.templar.items.leftFinger);
		Assert.assertNotNull(hp.followers.templar.items.neck);
		Assert.assertEquals(2,hp.followers.templar.items.offHand.transmogItem.randomAffixes.length);
		Assert.assertEquals(2,hp.followers.templar.items.offHand.transmogItem.randomAffixes[0].oneOf.length);
		Assert.assertEquals(1,hp.followers.templar.items.offHand.transmogItem.randomAffixes[0].oneOf[0].attributes.primary.length);
		Assert.assertEquals("+81–85 Resistance to All Elements",hp.followers.templar.items.offHand.transmogItem.randomAffixes[0].oneOf[0].attributes.primary[0].text);
		Assert.assertEquals("default",hp.followers.templar.items.offHand.transmogItem.randomAffixes[0].oneOf[0].attributes.primary[0].affixType);
		Assert.assertEquals("blue",hp.followers.templar.items.offHand.transmogItem.randomAffixes[0].oneOf[0].attributes.primary[0].color);
		Assert.assertEquals(0,hp.followers.templar.items.offHand.transmogItem.randomAffixes[0].oneOf[0].attributes.secondary.length);
		Assert.assertEquals(0,hp.followers.templar.items.offHand.transmogItem.randomAffixes[0].oneOf[0].attributes.passive.length);
		Assert.assertEquals(81.0f,hp.followers.templar.items.offHand.transmogItem.randomAffixes[0].oneOf[0].attributesRaw.Resistance_All.min,0.01f);
		Assert.assertEquals(85.0f,hp.followers.templar.items.offHand.transmogItem.randomAffixes[0].oneOf[0].attributesRaw.Resistance_All.max,0.01f);
		Assert.assertEquals(4,hp.followers.templar.items.offHand.transmogItem.randomAffixes[1].oneOf.length);
		Assert.assertEquals(1,hp.followers.templar.items.offHand.transmogItem.randomAffixes[1].oneOf[0].attributes.primary.length);
		Assert.assertEquals("+5% Life",hp.followers.templar.items.offHand.transmogItem.randomAffixes[1].oneOf[0].attributes.primary[0].text);
		Assert.assertEquals("default",hp.followers.templar.items.offHand.transmogItem.randomAffixes[1].oneOf[0].attributes.primary[0].affixType);
		Assert.assertEquals("blue",hp.followers.templar.items.offHand.transmogItem.randomAffixes[1].oneOf[0].attributes.primary[0].color);
		Assert.assertEquals(0,hp.followers.templar.items.offHand.transmogItem.randomAffixes[1].oneOf[0].attributes.secondary.length);
		Assert.assertEquals(0,hp.followers.templar.items.offHand.transmogItem.randomAffixes[1].oneOf[0].attributes.passive.length);
		Assert.assertEquals(0.05f,hp.followers.templar.items.offHand.transmogItem.randomAffixes[1].oneOf[0].attributesRaw.Hitpoints_Max_Percent_Bonus_Item.min,0.01f);
		Assert.assertEquals(0.05f,hp.followers.templar.items.offHand.transmogItem.randomAffixes[1].oneOf[0].attributesRaw.Hitpoints_Max_Percent_Bonus_Item.max,0.01f);
		Assert.assertEquals(14,hp.followers.templar.stats.goldFind);
		Assert.assertEquals(0,hp.followers.templar.stats.magicFind);
		Assert.assertEquals(37,hp.followers.templar.stats.experienceBonus);
		Assert.assertEquals(4,hp.followers.templar.skills.length);
		Assert.assertEquals("intervene",hp.followers.templar.skills[0].skill.slug);
		Assert.assertEquals("Intervene",hp.followers.templar.skills[0].skill.name);
		Assert.assertEquals("templar_intervene",hp.followers.templar.skills[0].skill.icon);
		Assert.assertEquals(5,hp.followers.templar.skills[0].skill.level);
		Assert.assertEquals("skill/templar/intervene",hp.followers.templar.skills[0].skill.tooltipUrl);
		Assert.assertEquals("Cooldown: 10 seconds\r\n\r\nTaunt enemies within 10 yards of you for 3 seconds when you are hit.",hp.followers.templar.skills[0].skill.description);
		Assert.assertEquals("Cooldown: 10 seconds\r\n\r\nTaunt enemies near you when you are hit.",hp.followers.templar.skills[0].skill.simpleDescription);
		Assert.assertEquals("Z",hp.followers.templar.skills[0].skill.skillCalcId);
		Assert.assertNotNull(hp.followers.templar);
		Assert.assertNotNull(hp.followers.scoundrel);
		Assert.assertNotNull(hp.followers.enchantress);
		
		Assert.assertEquals(315284, hp.stats.life);
		Assert.assertEquals(621974.0, hp.stats.damage,0.01f);
		Assert.assertEquals(1.399999976158142f, hp.stats.attackSpeed,0.01f);
		Assert.assertEquals(5952, hp.stats.armor);
		Assert.assertEquals(77, hp.stats.strength);
		Assert.assertEquals(77, hp.stats.dexterity);
		Assert.assertEquals(3075, hp.stats.vitality);
		Assert.assertEquals(8095, hp.stats.intelligence);
		Assert.assertEquals(1190, hp.stats.physicalResist);
		Assert.assertEquals(1189, hp.stats.fireResist);
		Assert.assertEquals(1351, hp.stats.coldResist);
		Assert.assertEquals(1207, hp.stats.lightningResist);
		Assert.assertEquals(1047, hp.stats.poisonResist);
		Assert.assertEquals(1047, hp.stats.arcaneResist);
		Assert.assertEquals(4.890000000000001f, hp.stats.critDamage,0.01f);
		Assert.assertEquals(0.0f, hp.stats.blockChance,0.01f);
		Assert.assertEquals(0, hp.stats.blockAmountMin);
		Assert.assertEquals(0, hp.stats.blockAmountMax);
		Assert.assertEquals(0.0f, hp.stats.damageIncrease,0.01f);
		Assert.assertEquals(0.0f, hp.stats.critChance,0.01f);
		Assert.assertEquals(0.0f, hp.stats.damageReduction,0.01f);
		Assert.assertEquals(2932.0f, hp.stats.thorns,0.01f);
		Assert.assertEquals(0.0f, hp.stats.lifeSteal,0.01f);
		Assert.assertEquals(4399.0f, hp.stats.lifePerKill,0.01f);
		Assert.assertEquals(0.68f, hp.stats.goldFind,0.01f);
		Assert.assertEquals(0.0f, hp.stats.magicFind,0.01f);
		Assert.assertEquals(2776.0f, hp.stats.lifeOnHit,0.01f);
		Assert.assertEquals(120, hp.stats.primaryResource);
		Assert.assertEquals(0, hp.stats.secondaryResource);
		Assert.assertEquals(19945, hp.kills.elites);
		Assert.assertEquals(true, hp.progression.act1.completed);
		Assert.assertEquals(10, hp.progression.act1.completedQuests.length);
		Assert.assertEquals("the-fallen-star", hp.progression.act1.completedQuests[0].slug);
		Assert.assertEquals("The Fallen Star", hp.progression.act1.completedQuests[0].name);
		Assert.assertEquals(false, hp.dead);
		Assert.assertEquals(1402106952L, hp.lastUpdated);
	}

	@Test
	public void test_001() throws JsonParseException, JsonMappingException,
			IOException {
		HeroProfile hp = IO.readHeroProfile("sample/heroprofile_001.json");
		
		Assert.assertEquals(0.01f, hp.items.mainHand.transmogItem.randomAffixes[0].oneOf[0].attributesRaw.Weapon_On_Hit_Blind_Proc_Chance.min,0.00001f);
		Assert.assertEquals(0.0175f, hp.items.mainHand.transmogItem.randomAffixes[0].oneOf[0].attributesRaw.Weapon_On_Hit_Blind_Proc_Chance.max,0.00001f);
		
		Assert.assertEquals(36f, hp.items.mainHand.transmogItem.randomAffixes[1].oneOf[0].attributesRaw.Dexterity_Item.min,0.00001f);
		Assert.assertEquals(42f, hp.items.mainHand.transmogItem.randomAffixes[1].oneOf[0].attributesRaw.Dexterity_Item.max,0.00001f);
		Assert.assertEquals(36f, hp.items.mainHand.transmogItem.randomAffixes[1].oneOf[0].attributesRaw.Strength_Item.min,0.00001f);
		Assert.assertEquals(42f, hp.items.mainHand.transmogItem.randomAffixes[1].oneOf[0].attributesRaw.Strength_Item.max,0.00001f);
	}
}
