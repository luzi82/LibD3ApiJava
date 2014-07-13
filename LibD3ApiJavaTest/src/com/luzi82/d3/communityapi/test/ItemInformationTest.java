package com.luzi82.d3.communityapi.test;

import java.io.IOException;

import org.junit.Assert;
import org.junit.Test;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.luzi82.d3.communityapi.Const;
import com.luzi82.d3.communityapi.HeroProfile;
import com.luzi82.d3.communityapi.IO;
import com.luzi82.d3.communityapi.ItemInformation;

public class ItemInformationTest {

	@Test
	public void test_000() throws JsonParseException, JsonMappingException,
			IOException {
		ItemInformation ii = IO.readItemInformation("sample/iteminformation_000.json");
		
		Assert.assertEquals("Unique_Orb_012_x1",ii.id);
		Assert.assertEquals("Tal Rasha's Unwavering Glare",ii.name);
		Assert.assertEquals("unique_orb_012_x1_demonhunter_male",ii.icon);
		Assert.assertEquals("green",ii.displayColor);
		Assert.assertEquals("item/ClsI7LypiQISBwgEFdMehaUdrNOZOR3zGKDgHZsGAMsdU6uOLB3zcAetHX5Wsy4wiwI41gFAAFASWARgmAOAAUalAVOrjiytAbi8IHq1AdrDjnG4AYX7w78BwAEFGNmE16cLUARYAqAB2YTXpwugAajO478CoAH4qs-wCw",ii.tooltipParams);
		Assert.assertEquals(70,(int)ii.requiredLevel);
		Assert.assertEquals(60,(int)ii.itemLevel);
		Assert.assertEquals(0,(int)ii.bonusAffixes);
		Assert.assertEquals(0,(int)ii.bonusAffixesMax);
		Assert.assertEquals(true,ii.accountBound);
		Assert.assertEquals("Tal Rasha stored much of his power in this source before sacrificing himself to imprison the demon lord Baal.",ii.flavorText);
		Assert.assertEquals("Set Source",ii.typeName);
		Assert.assertEquals(false,ii.type.twoHanded);
		Assert.assertEquals(Const.ITEMTYPE_ORB,ii.type.id);
		Assert.assertEquals(5,ii.attributes.primary.length);
		Assert.assertEquals("+99–122 Damage",ii.attributes.primary[0].text);
		Assert.assertEquals(Const.AFFIXTYPE_DEFAULT,ii.attributes.primary[0].affixType);
		Assert.assertEquals("blue",ii.attributes.primary[0].color);
		Assert.assertEquals(Const.AFFIXTYPE_ENCHANT,ii.attributes.primary[4].affixType);
		Assert.assertEquals(2,ii.attributes.secondary.length);
		Assert.assertEquals(Const.AFFIXTYPE_UTILITY,ii.attributes.secondary[0].affixType);
		Assert.assertEquals(0,ii.attributes.passive.length);
		Assert.assertEquals(70,(int)ii.attributesRaw.Item_LegendaryItem_Level_Override.min);
		Assert.assertEquals(70,(int)ii.attributesRaw.Item_LegendaryItem_Level_Override.max);
		Assert.assertEquals(408,(int)ii.attributesRaw.Durability_Max.min);
		Assert.assertEquals(408,(int)ii.attributesRaw.Durability_Max.max);
		Assert.assertEquals(23,(int)ii.attributesRaw.Damage_Delta_Physical.min);
		Assert.assertEquals(23,(int)ii.attributesRaw.Damage_Delta_Physical.max);
		Assert.assertEquals(0.07999999999999996,ii.attributesRaw.Power_Cooldown_Reduction_Percent_All.min,0.0001);
		Assert.assertEquals(0.07999999999999996,ii.attributesRaw.Power_Cooldown_Reduction_Percent_All.max,0.0001);
		Assert.assertEquals(1905181658,(int)ii.attributesRaw.Item_Legendary_Item_Base_Item.min);
		Assert.assertEquals(1905181658,(int)ii.attributesRaw.Item_Legendary_Item_Base_Item.max);
		Assert.assertEquals(0,(int)ii.attributesRaw.Season.min);
		Assert.assertEquals(0,(int)ii.attributesRaw.Season.max);
		Assert.assertEquals(689,(int)ii.attributesRaw.Vitality_Item.min);
		Assert.assertEquals(689,(int)ii.attributesRaw.Vitality_Item.max);
		Assert.assertEquals(20181,(int)ii.attributesRaw.Health_Globe_Bonus_Health.min);
		Assert.assertEquals(20181,(int)ii.attributesRaw.Health_Globe_Bonus_Health.max);
		Assert.assertEquals(408,(int)ii.attributesRaw.Durability_Max_Before_Reforge.min);
		Assert.assertEquals(408,(int)ii.attributesRaw.Durability_Max_Before_Reforge.max);
		Assert.assertEquals(214,(int)ii.attributesRaw.Durability_Cur.min);
		Assert.assertEquals(214,(int)ii.attributesRaw.Durability_Cur.max);
		Assert.assertEquals(14,(int)ii.attributesRaw.Resource_Max_Bonus_Arcanum.min);
		Assert.assertEquals(14,(int)ii.attributesRaw.Resource_Max_Bonus_Arcanum.max);
		Assert.assertEquals(0.08,ii.attributesRaw.Crit_Percent_Bonus_Capped.min,0.0001);
		Assert.assertEquals(0.08,ii.attributesRaw.Crit_Percent_Bonus_Capped.max,0.0001);
		Assert.assertEquals(2,(int)ii.attributesRaw.Item_Binding_Level_Override.min);
		Assert.assertEquals(2,(int)ii.attributesRaw.Item_Binding_Level_Override.max);
		Assert.assertEquals(99,(int)ii.attributesRaw.Damage_Min_Physical.min);
		Assert.assertEquals(99,(int)ii.attributesRaw.Damage_Min_Physical.max);
		Assert.assertEquals(666,(int)ii.attributesRaw.Intelligence_Item.min);
		Assert.assertEquals(666,(int)ii.attributesRaw.Intelligence_Item.max);
		
		Assert.assertEquals(0,ii.randomAffixes.length);
		Assert.assertEquals(0,ii.gems.length);
		Assert.assertEquals(0,ii.socketEffects.length);
		
		Assert.assertEquals("Tal Rasha's Elements",ii.set.name);
		Assert.assertEquals(5,ii.set.items.length);
		Assert.assertEquals("Unique_Amulet_007_x1",ii.set.items[0].id);
		Assert.assertEquals("Tal Rasha's Allegiance",ii.set.items[0].name);
		Assert.assertEquals("unique_amulet_007_x1_demonhunter_male",ii.set.items[0].icon);
		Assert.assertEquals("green",ii.set.items[0].displayColor);
		Assert.assertEquals("item/tal-rashas-allegiance",ii.set.items[0].tooltipParams);
		Assert.assertEquals("tal-rashas-elements",ii.set.slug);
		Assert.assertEquals(3,ii.set.ranks.length);
		Assert.assertEquals(2,(int)ii.set.ranks[0].required);
		Assert.assertEquals(4,ii.set.ranks[0].attributes.primary.length);
		Assert.assertEquals("Cold skills deal 5% more damage.",ii.set.ranks[0].attributes.primary[0].text);
		Assert.assertEquals("default",ii.set.ranks[0].attributes.primary[0].affixType);
		Assert.assertEquals("blue",ii.set.ranks[0].attributes.primary[0].color);
		Assert.assertEquals(0,ii.set.ranks[0].attributes.secondary.length);
		Assert.assertEquals(0,ii.set.ranks[0].attributes.passive.length);
		Assert.assertEquals(0.05,ii.set.ranks[0].attributesRaw.Damage_Dealt_Percent_Bonus_Cold.min,0.0001);
		Assert.assertEquals(0.05,ii.set.ranks[0].attributesRaw.Damage_Dealt_Percent_Bonus_Cold.min,0.0001);
		Assert.assertEquals(0.05,ii.set.ranks[0].attributesRaw.Damage_Dealt_Percent_Bonus_Fire.min,0.0001);
		Assert.assertEquals(0.05,ii.set.ranks[0].attributesRaw.Damage_Dealt_Percent_Bonus_Fire.min,0.0001);
		Assert.assertEquals(0.05,ii.set.ranks[0].attributesRaw.Damage_Dealt_Percent_Bonus_Arcane.min,0.0001);
		Assert.assertEquals(0.05,ii.set.ranks[0].attributesRaw.Damage_Dealt_Percent_Bonus_Arcane.min,0.0001);
		Assert.assertEquals(0.05,ii.set.ranks[0].attributesRaw.Damage_Dealt_Percent_Bonus_Lightning.min,0.0001);
		Assert.assertEquals(0.05,ii.set.ranks[0].attributesRaw.Damage_Dealt_Percent_Bonus_Lightning.min,0.0001);
		Assert.assertEquals(2.0,ii.set.ranks[1].attributesRaw.Resource_Regen_Per_Second_Arcanum.min,0.0001);
		Assert.assertEquals(2.0,ii.set.ranks[1].attributesRaw.Resource_Regen_Per_Second_Arcanum.max,0.0001);
		Assert.assertEquals(2.0,ii.set.ranks[2].attributesRaw.Item_Power_Passive_ItemPassive_Unique_Ring_710_x1.min,1.0);
		Assert.assertEquals(2.0,ii.set.ranks[2].attributesRaw.Item_Power_Passive_ItemPassive_Unique_Ring_710_x1.max,1.0);
		
		Assert.assertEquals(0,ii.craftedBy.length);
		
	}

}
