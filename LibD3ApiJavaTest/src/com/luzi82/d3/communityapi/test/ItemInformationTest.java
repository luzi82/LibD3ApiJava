package com.luzi82.d3.communityapi.test;

import java.io.IOException;

import org.junit.Assert;
import org.junit.Test;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.luzi82.d3.communityapi.Const;
import com.luzi82.d3.communityapi.IO;
import com.luzi82.d3.communityapi.ItemInformation;

public class ItemInformationTest {

	@Test
	public void test_000() throws JsonParseException, JsonMappingException, IOException {
		ItemInformation ii = IO.readItemInformation("sample/iteminformation_000.json");

		Assert.assertEquals("Unique_Orb_012_x1", ii.id);
		Assert.assertEquals("Tal Rasha's Unwavering Glare", ii.name);
		Assert.assertEquals("unique_orb_012_x1_demonhunter_male", ii.icon);
		Assert.assertEquals("green", ii.displayColor);
		Assert.assertEquals("item/ClsI7LypiQISBwgEFdMehaUdrNOZOR3zGKDgHZsGAMsdU6uOLB3zcAetHX5Wsy4wiwI41gFAAFASWARgmAOAAUalAVOrjiytAbi8IHq1AdrDjnG4AYX7w78BwAEFGNmE16cLUARYAqAB2YTXpwugAajO478CoAH4qs-wCw", ii.tooltipParams);
		Assert.assertEquals(70, (int) ii.requiredLevel);
		Assert.assertEquals(60, (int) ii.itemLevel);
		Assert.assertEquals(0, (int) ii.bonusAffixes);
		Assert.assertEquals(0, (int) ii.bonusAffixesMax);
		Assert.assertEquals(true, ii.accountBound);
		Assert.assertEquals("Tal Rasha stored much of his power in this source before sacrificing himself to imprison the demon lord Baal.", ii.flavorText);
		Assert.assertEquals("Set Source", ii.typeName);
		Assert.assertEquals(false, ii.type.twoHanded);
		Assert.assertEquals(Const.ITEMTYPE_ORB, ii.type.id);
		Assert.assertEquals(5, ii.attributes.primary.length);
		Assert.assertEquals("+99–122 Damage", ii.attributes.primary[0].text);
		Assert.assertEquals(Const.AFFIXTYPE_DEFAULT, ii.attributes.primary[0].affixType);
		Assert.assertEquals("blue", ii.attributes.primary[0].color);
		Assert.assertEquals(Const.AFFIXTYPE_ENCHANT, ii.attributes.primary[4].affixType);
		Assert.assertEquals(2, ii.attributes.secondary.length);
		Assert.assertEquals(Const.AFFIXTYPE_UTILITY, ii.attributes.secondary[0].affixType);
		Assert.assertEquals(0, ii.attributes.passive.length);
		Assert.assertEquals(70, (int) ii.attributesRaw.Item_LegendaryItem_Level_Override.min);
		Assert.assertEquals(70, (int) ii.attributesRaw.Item_LegendaryItem_Level_Override.max);
		Assert.assertEquals(408, (int) ii.attributesRaw.Durability_Max.min);
		Assert.assertEquals(408, (int) ii.attributesRaw.Durability_Max.max);
		Assert.assertEquals(23, (int) ii.attributesRaw.Damage_Delta_Physical.min);
		Assert.assertEquals(23, (int) ii.attributesRaw.Damage_Delta_Physical.max);
		Assert.assertEquals(0.07999999999999996, ii.attributesRaw.Power_Cooldown_Reduction_Percent_All.min, 0.0001);
		Assert.assertEquals(0.07999999999999996, ii.attributesRaw.Power_Cooldown_Reduction_Percent_All.max, 0.0001);
		Assert.assertEquals(1905181658, (int) ii.attributesRaw.Item_Legendary_Item_Base_Item.min);
		Assert.assertEquals(1905181658, (int) ii.attributesRaw.Item_Legendary_Item_Base_Item.max);
		Assert.assertEquals(0, (int) ii.attributesRaw.Season.min);
		Assert.assertEquals(0, (int) ii.attributesRaw.Season.max);
		Assert.assertEquals(689, (int) ii.attributesRaw.Vitality_Item.min);
		Assert.assertEquals(689, (int) ii.attributesRaw.Vitality_Item.max);
		Assert.assertEquals(20181, (int) ii.attributesRaw.Health_Globe_Bonus_Health.min);
		Assert.assertEquals(20181, (int) ii.attributesRaw.Health_Globe_Bonus_Health.max);
		Assert.assertEquals(408, (int) ii.attributesRaw.Durability_Max_Before_Reforge.min);
		Assert.assertEquals(408, (int) ii.attributesRaw.Durability_Max_Before_Reforge.max);
		Assert.assertEquals(214, (int) ii.attributesRaw.Durability_Cur.min);
		Assert.assertEquals(214, (int) ii.attributesRaw.Durability_Cur.max);
		Assert.assertEquals(14, (int) ii.attributesRaw.Resource_Max_Bonus_Arcanum.min);
		Assert.assertEquals(14, (int) ii.attributesRaw.Resource_Max_Bonus_Arcanum.max);
		Assert.assertEquals(0.08, ii.attributesRaw.Crit_Percent_Bonus_Capped.min, 0.0001);
		Assert.assertEquals(0.08, ii.attributesRaw.Crit_Percent_Bonus_Capped.max, 0.0001);
		Assert.assertEquals(2, (int) ii.attributesRaw.Item_Binding_Level_Override.min);
		Assert.assertEquals(2, (int) ii.attributesRaw.Item_Binding_Level_Override.max);
		Assert.assertEquals(99, (int) ii.attributesRaw.Damage_Min_Physical.min);
		Assert.assertEquals(99, (int) ii.attributesRaw.Damage_Min_Physical.max);
		Assert.assertEquals(666, (int) ii.attributesRaw.Intelligence_Item.min);
		Assert.assertEquals(666, (int) ii.attributesRaw.Intelligence_Item.max);

		Assert.assertEquals(0, ii.randomAffixes.length);
		Assert.assertEquals(0, ii.gems.length);
		Assert.assertEquals(0, ii.socketEffects.length);

		Assert.assertEquals("Tal Rasha's Elements", ii.set.name);
		Assert.assertEquals(5, ii.set.items.length);
		Assert.assertEquals("Unique_Amulet_007_x1", ii.set.items[0].id);
		Assert.assertEquals("Tal Rasha's Allegiance", ii.set.items[0].name);
		Assert.assertEquals("unique_amulet_007_x1_demonhunter_male", ii.set.items[0].icon);
		Assert.assertEquals("green", ii.set.items[0].displayColor);
		Assert.assertEquals("item/tal-rashas-allegiance", ii.set.items[0].tooltipParams);
		Assert.assertEquals("tal-rashas-elements", ii.set.slug);
		Assert.assertEquals(3, ii.set.ranks.length);
		Assert.assertEquals(2, (int) ii.set.ranks[0].required);
		Assert.assertEquals(4, ii.set.ranks[0].attributes.primary.length);
		Assert.assertEquals("Cold skills deal 5% more damage.", ii.set.ranks[0].attributes.primary[0].text);
		Assert.assertEquals("default", ii.set.ranks[0].attributes.primary[0].affixType);
		Assert.assertEquals("blue", ii.set.ranks[0].attributes.primary[0].color);
		Assert.assertEquals(0, ii.set.ranks[0].attributes.secondary.length);
		Assert.assertEquals(0, ii.set.ranks[0].attributes.passive.length);
		Assert.assertEquals(0.05, ii.set.ranks[0].attributesRaw.Damage_Dealt_Percent_Bonus_Cold.min, 0.0001);
		Assert.assertEquals(0.05, ii.set.ranks[0].attributesRaw.Damage_Dealt_Percent_Bonus_Cold.min, 0.0001);
		Assert.assertEquals(0.05, ii.set.ranks[0].attributesRaw.Damage_Dealt_Percent_Bonus_Fire.min, 0.0001);
		Assert.assertEquals(0.05, ii.set.ranks[0].attributesRaw.Damage_Dealt_Percent_Bonus_Fire.min, 0.0001);
		Assert.assertEquals(0.05, ii.set.ranks[0].attributesRaw.Damage_Dealt_Percent_Bonus_Arcane.min, 0.0001);
		Assert.assertEquals(0.05, ii.set.ranks[0].attributesRaw.Damage_Dealt_Percent_Bonus_Arcane.min, 0.0001);
		Assert.assertEquals(0.05, ii.set.ranks[0].attributesRaw.Damage_Dealt_Percent_Bonus_Lightning.min, 0.0001);
		Assert.assertEquals(0.05, ii.set.ranks[0].attributesRaw.Damage_Dealt_Percent_Bonus_Lightning.min, 0.0001);
		Assert.assertEquals(2.0, ii.set.ranks[1].attributesRaw.Resource_Regen_Per_Second_Arcanum.min, 0.0001);
		Assert.assertEquals(2.0, ii.set.ranks[1].attributesRaw.Resource_Regen_Per_Second_Arcanum.max, 0.0001);
		Assert.assertEquals(2.0, ii.set.ranks[2].attributesRaw.Item_Power_Passive_ItemPassive_Unique_Ring_710_x1.min, 1.0);
		Assert.assertEquals(2.0, ii.set.ranks[2].attributesRaw.Item_Power_Passive_ItemPassive_Unique_Ring_710_x1.max, 1.0);

		Assert.assertEquals(0, ii.craftedBy.length);

	}

	@Test
	public void test_001() throws JsonParseException, JsonMappingException, IOException {
		ItemInformation ii = IO.readItemInformation("sample/iteminformation_001.json");
		Assert.assertEquals(660f, ii.transmogItem.armor.min, 0.000001f);
		Assert.assertEquals(759f, ii.transmogItem.armor.max, 0.000001f);

		Assert.assertEquals(1f, ii.transmogItem.attributesRaw.Sockets.min, 0.000001f);
		Assert.assertEquals(1f, ii.transmogItem.attributesRaw.Sockets.max, 0.000001f);

		Assert.assertEquals(660.0f, ii.transmogItem.attributesRaw.Armor_Item.min, 0.000001f);
		Assert.assertEquals(759.0f, ii.transmogItem.attributesRaw.Armor_Item.max, 0.000001f);

		Assert.assertEquals(1.0f, ii.transmogItem.set.ranks[1].attributesRaw.Item_Power_Passive_ItemPassive_Unique_Ring_715_x1.min, 0.000001f);
		Assert.assertEquals(1.0f, ii.transmogItem.set.ranks[1].attributesRaw.Item_Power_Passive_ItemPassive_Unique_Ring_715_x1.max, 0.000001f);

		Assert.assertEquals(1740.0f, ii.attributesRaw.Thorns_Fixed_Physical.min, 0.000001f);
		Assert.assertEquals(1740.0f, ii.attributesRaw.Thorns_Fixed_Physical.max, 0.000001f);

		Assert.assertEquals(580.0f, ii.attributesRaw.Armor_Bonus_Item.min, 0.000001f);
		Assert.assertEquals(580.0f, ii.attributesRaw.Armor_Bonus_Item.max, 0.000001f);

		Assert.assertEquals(148.0f, ii.attributesRaw.Resistance_Arcane.min, 0.000001f);
		Assert.assertEquals(148.0f, ii.attributesRaw.Resistance_Arcane.max, 0.000001f);

		Assert.assertEquals("Diamond_19", ii.gems[0].item.id);
	}

	@Test
	public void test_002() throws JsonParseException, JsonMappingException, IOException {
		ItemInformation ii = IO.readItemInformation("sample/iteminformation_002.json");

		Assert.assertEquals(2f, ii.attributesRaw.Gold_PickUp_Radius.min, 0.000001f);
		Assert.assertEquals(2f, ii.attributesRaw.Gold_PickUp_Radius.max, 0.000001f);

		Assert.assertEquals(1f, ii.attributesRaw.Item_Indestructible.min, 0.000001f);
		Assert.assertEquals(1f, ii.attributesRaw.Item_Indestructible.max, 0.000001f);

		Assert.assertEquals(500f, ii.set.ranks[0].attributesRaw.Intelligence.min, 0.000001f);
		Assert.assertEquals(500f, ii.set.ranks[0].attributesRaw.Intelligence.max, 0.000001f);

		Assert.assertEquals(1.0f, ii.set.ranks[1].attributesRaw.Item_Power_Passive_ItemPassive_Unique_Ring_727_x1.min, 0.000001f);
		Assert.assertEquals(1.0f, ii.set.ranks[1].attributesRaw.Item_Power_Passive_ItemPassive_Unique_Ring_727_x1.min, 0.000001f);
	}

	@Test
	public void test_003() throws JsonParseException, JsonMappingException, IOException {
		ItemInformation ii = IO.readItemInformation("sample/iteminformation_003.json");

		Assert.assertEquals(1f, ii.attributesRaw.IsCrafted.min, 0.000001f);
		Assert.assertEquals(1f, ii.attributesRaw.IsCrafted.max, 0.000001f);

		Assert.assertEquals(189f, ii.attributesRaw.Experience_Bonus.min, 0.000001f);
		Assert.assertEquals(189f, ii.attributesRaw.Experience_Bonus.max, 0.000001f);

		Assert.assertEquals(2000f, ii.set.ranks[0].attributesRaw.Hitpoints_Regen_Per_Second.min, 0.000001f);
		Assert.assertEquals(2000f, ii.set.ranks[0].attributesRaw.Hitpoints_Regen_Per_Second.max, 0.000001f);

		Assert.assertEquals(0.1f, ii.set.ranks[1].attributesRaw.Resource_Cost_Reduction_Percent_All.min, 0.000001f);
		Assert.assertEquals(0.1f, ii.set.ranks[1].attributesRaw.Resource_Cost_Reduction_Percent_All.max, 0.000001f);
	}

	@Test
	public void test_004() throws JsonParseException, JsonMappingException, IOException {
		ItemInformation ii = IO.readItemInformation("sample/iteminformation_004.json");

		Assert.assertEquals(0.47f, ii.attributesRaw.Crit_Damage_Percent.min, 0.000001f);
		Assert.assertEquals(0.47f, ii.attributesRaw.Crit_Damage_Percent.max, 0.000001f);
	}

	@Test
	public void test_005() throws JsonParseException, JsonMappingException, IOException {
		ItemInformation ii = IO.readItemInformation("sample/iteminformation_005.json");

		Assert.assertEquals(0.35f, ii.attributesRaw.Gold_Find.min, 0.000001f);
		Assert.assertEquals(0.35f, ii.attributesRaw.Gold_Find.max, 0.000001f);

		Assert.assertEquals(0.07f, ii.set.ranks[0].attributesRaw.Damage_Percent_Reduction_From_Melee.min, 0.000001f);
		Assert.assertEquals(0.07f, ii.set.ranks[0].attributesRaw.Damage_Percent_Reduction_From_Melee.max, 0.000001f);

		Assert.assertEquals(0.07f, ii.set.ranks[0].attributesRaw.Damage_Percent_Reduction_From_Ranged.min, 0.000001f);
		Assert.assertEquals(0.07f, ii.set.ranks[0].attributesRaw.Damage_Percent_Reduction_From_Ranged.max, 0.000001f);

		Assert.assertEquals(0.15f, ii.set.ranks[1].attributesRaw.Damage_Percent_Reduction_From_Elites.min, 0.000001f);
		Assert.assertEquals(0.15f, ii.set.ranks[1].attributesRaw.Damage_Percent_Reduction_From_Elites.max, 0.000001f);

		Assert.assertEquals(0.15f, ii.set.ranks[1].attributesRaw.Damage_Percent_Bonus_Vs_Elites.min, 0.000001f);
		Assert.assertEquals(0.15f, ii.set.ranks[1].attributesRaw.Damage_Percent_Bonus_Vs_Elites.max, 0.000001f);
	}

	@Test
	public void test_006() throws JsonParseException, JsonMappingException, IOException {
		ItemInformation ii = IO.readItemInformation("sample/iteminformation_006.json");

		Assert.assertEquals(5389f, ii.attributesRaw.Hitpoints_On_Kill.min, 0.000001f);
		Assert.assertEquals(5389f, ii.attributesRaw.Hitpoints_On_Kill.max, 0.000001f);
	}

	@Test
	public void test_007() throws JsonParseException, JsonMappingException, IOException {
		ItemInformation ii = IO.readItemInformation("sample/iteminformation_007.json");

		Assert.assertEquals(39.19999933242798f, ii.transmogItem.dps.min, 0.000001f);
		Assert.assertEquals(39.19999933242798f, ii.transmogItem.dps.max, 0.000001f);

		Assert.assertEquals(1.399999976158142f, ii.transmogItem.attacksPerSecond.min, 0.000001f);
		Assert.assertEquals(1.399999976158142f, ii.transmogItem.attacksPerSecond.max, 0.000001f);

		Assert.assertEquals(17f, ii.transmogItem.minDamage.min, 0.000001f);
		Assert.assertEquals(17f, ii.transmogItem.minDamage.max, 0.000001f);

		Assert.assertEquals(39f, ii.transmogItem.maxDamage.min, 0.000001f);
		Assert.assertEquals(39f, ii.transmogItem.maxDamage.max, 0.000001f);

		Assert.assertEquals(1.399999976158142f, ii.transmogItem.attributesRaw.Attacks_Per_Second_Item.min, 0.000001f);
		Assert.assertEquals(1.399999976158142f, ii.transmogItem.attributesRaw.Attacks_Per_Second_Item.max, 0.000001f);

		Assert.assertEquals(17f, ii.transmogItem.attributesRaw.Damage_Weapon_Min_Physical.min, 0.000001f);
		Assert.assertEquals(17f, ii.transmogItem.attributesRaw.Damage_Weapon_Min_Physical.max, 0.000001f);

		Assert.assertEquals(22f, ii.transmogItem.attributesRaw.Damage_Weapon_Delta_Physical.min, 0.000001f);
		Assert.assertEquals(22f, ii.transmogItem.attributesRaw.Damage_Weapon_Delta_Physical.max, 0.000001f);

		Assert.assertEquals(199f, ii.attributesRaw.Damage_Weapon_Delta_Lightning.min, 0.000001f);
		Assert.assertEquals(199f, ii.attributesRaw.Damage_Weapon_Delta_Lightning.max, 0.000001f);

		Assert.assertEquals(1188f, ii.attributesRaw.Damage_Weapon_Min_Lightning.min, 0.000001f);
		Assert.assertEquals(1188f, ii.attributesRaw.Damage_Weapon_Min_Lightning.max, 0.000001f);

		Assert.assertEquals(3.04f, ii.attributesRaw.Item_Power_Passive_ItemPassive_Unique_Ring_581_x1.min, 0.000001f);
		Assert.assertEquals(3.04f, ii.attributesRaw.Item_Power_Passive_ItemPassive_Unique_Ring_581_x1.max, 0.000001f);

		Assert.assertEquals(0.023800000000000043f, ii.attributesRaw.Weapon_On_Hit_Stun_Proc_Chance.min, 0.000001f);
		Assert.assertEquals(0.023800000000000043f, ii.attributesRaw.Weapon_On_Hit_Stun_Proc_Chance.max, 0.000001f);
	}

	@Test
	public void test_008() throws JsonParseException, JsonMappingException, IOException {
		ItemInformation ii = IO.readItemInformation("sample/iteminformation_008.json");

		Assert.assertEquals(1f, ii.attributesRaw.Attribute_Set_Item_Discount.min, 0.000001f);
		Assert.assertEquals(1f, ii.attributesRaw.Attribute_Set_Item_Discount.max, 0.000001f);

		Assert.assertEquals(0.07f, ii.attributesRaw.Attacks_Per_Second_Percent.min, 0.000001f);
		Assert.assertEquals(0.07f, ii.attributesRaw.Attacks_Per_Second_Percent.max, 0.000001f);
	}

	@Test
	public void test_009() throws JsonParseException, JsonMappingException, IOException {
		ItemInformation ii = IO.readItemInformation("sample/iteminformation_009.json");

		Assert.assertEquals(141f, ii.attributesRaw.Resistance_Cold.min, 0.000001f);
		Assert.assertEquals(141f, ii.attributesRaw.Resistance_Cold.max, 0.000001f);

		Assert.assertEquals(0.33f, ii.attributesRaw.CrowdControl_Reduction.min, 0.000001f);
		Assert.assertEquals(0.33f, ii.attributesRaw.CrowdControl_Reduction.max, 0.000001f);
	}

	@Test
	public void test_010() throws JsonParseException, JsonMappingException, IOException {
		ItemInformation ii = IO.readItemInformation("sample/iteminformation_010.json");

		Assert.assertEquals(2298f, ii.attributesRaw.Hitpoints_On_Hit.min, 0.000001f);
		Assert.assertEquals(2298f, ii.attributesRaw.Hitpoints_On_Hit.max, 0.000001f);

		Assert.assertEquals(1.0f, ii.attributesRaw.Item_Power_Passive_ItemPassive_Unique_Ring_515_x1.min, 0.000001f);
		Assert.assertEquals(1.0f, ii.attributesRaw.Item_Power_Passive_ItemPassive_Unique_Ring_515_x1.max, 0.000001f);
	}

	@Test
	public void test_011() throws JsonParseException, JsonMappingException, IOException {
		ItemInformation ii = IO.readItemInformation("sample/iteminformation_011.json");

		Assert.assertEquals(0.08f, ii.attributesRaw.Damage_Weapon_Percent_Bonus_Physical.min, 0.000001f);
		Assert.assertEquals(0.08f, ii.attributesRaw.Damage_Weapon_Percent_Bonus_Physical.max, 0.000001f);

		Assert.assertEquals(0.010800000000000032f, ii.attributesRaw.Weapon_On_Hit_Immobilize_Proc_Chance.min, 0.000001f);
		Assert.assertEquals(0.010800000000000032f, ii.attributesRaw.Weapon_On_Hit_Immobilize_Proc_Chance.max, 0.000001f);
	}

	@Test
	public void test_012() throws JsonParseException, JsonMappingException, IOException {
		ItemInformation ii = IO.readItemInformation("sample/iteminformation_012.json");

		Assert.assertEquals(2443f, ii.transmogItem.attributesRaw.Block_Amount_Item_Min.min, 0.000001f);
		Assert.assertEquals(3053f, ii.transmogItem.attributesRaw.Block_Amount_Item_Min.max, 0.000001f);

		Assert.assertEquals(488f, ii.transmogItem.attributesRaw.Block_Amount_Item_Delta.min, 0.000001f);
		Assert.assertEquals(1221f, ii.transmogItem.attributesRaw.Block_Amount_Item_Delta.max, 0.000001f);

		Assert.assertEquals(0.1f, ii.transmogItem.attributesRaw.Block_Chance_Item.min, 0.000001f);
		Assert.assertEquals(0.2f, ii.transmogItem.attributesRaw.Block_Chance_Item.max, 0.000001f);

		Assert.assertEquals(0.1f, ii.transmogItem.blockChance.min, 0.000001f);
		Assert.assertEquals(0.2f, ii.transmogItem.blockChance.max, 0.000001f);

		Assert.assertEquals(0.1f, ii.attributesRaw.Block_Chance_Bonus_Item.min, 0.000001f);
		Assert.assertEquals(0.1f, ii.attributesRaw.Block_Chance_Bonus_Item.max, 0.000001f);
	}

	@Test
	public void test_013() throws JsonParseException, JsonMappingException, IOException {
		ItemInformation ii = IO.readItemInformation("sample/iteminformation_013.json");
		
		Assert.assertEquals(0.11380000000000001f, ii.attributesRaw.Weapon_On_Hit_Fear_Proc_Chance.min, 0.000001f);
		Assert.assertEquals(0.11380000000000001f, ii.attributesRaw.Weapon_On_Hit_Fear_Proc_Chance.max, 0.000001f);

		Assert.assertEquals(1f, ii.attributesRaw.Item_Power_Passive_ItemPassive_Unique_Ring_648_x1.min, 0.000001f);
		Assert.assertEquals(1f, ii.attributesRaw.Item_Power_Passive_ItemPassive_Unique_Ring_648_x1.max, 0.000001f);
	}

	@Test
	public void test_014() throws JsonParseException, JsonMappingException, IOException {
		ItemInformation ii = IO.readItemInformation("sample/iteminformation_014.json");
		
		Assert.assertEquals(1f, ii.attributesRaw.Item_Power_Passive_ItemPassive_Unique_Ring_669_x1.min, 0.000001f);
		Assert.assertEquals(1f, ii.attributesRaw.Item_Power_Passive_ItemPassive_Unique_Ring_669_x1.max, 0.000001f);
	}

	@Test
	public void test_015() throws JsonParseException, JsonMappingException, IOException {
		ItemInformation ii = IO.readItemInformation("sample/iteminformation_015.json");

		Assert.assertEquals(1f, ii.attributesRaw.Damage_Weapon_Bonus_Min_Physical.min, 0.000001f);
		Assert.assertEquals(1f, ii.attributesRaw.Damage_Weapon_Bonus_Min_Physical.max, 0.000001f);

		Assert.assertEquals(1f, ii.attributesRaw.Crossbow.min, 0.000001f);
		Assert.assertEquals(1f, ii.attributesRaw.Crossbow.max, 0.000001f);
	}

	@Test
	public void test_016() throws JsonParseException, JsonMappingException, IOException {
		ItemInformation ii = IO.readItemInformation("sample/iteminformation_016.json");

		Assert.assertEquals(1f, ii.attributesRaw.Item_Power_Passive_ItemPassive_Unique_Ring_653_x1.min, 0.000001f);
		Assert.assertEquals(1f, ii.attributesRaw.Item_Power_Passive_ItemPassive_Unique_Ring_653_x1.max, 0.000001f);
	}

	@Test
	public void test_017() throws JsonParseException, JsonMappingException, IOException {
		ItemInformation ii = IO.readItemInformation("sample/iteminformation_017.json");

		Assert.assertEquals(1319f, ii.attributesRaw.Damage_Weapon_Min_Poison.min, 0.000001f);
		Assert.assertEquals(1319f, ii.attributesRaw.Damage_Weapon_Min_Poison.max, 0.000001f);

		Assert.assertEquals(344f, ii.attributesRaw.Damage_Weapon_Delta_Poison.min, 0.000001f);
		Assert.assertEquals(344f, ii.attributesRaw.Damage_Weapon_Delta_Poison.max, 0.000001f);
	}
	
	@Test
	public void test_018() throws JsonParseException, JsonMappingException, IOException {
		ItemInformation ii = IO.readItemInformation("sample/iteminformation_018.json");

		Assert.assertEquals(12f, ii.attributesRaw.Item_Power_Passive_ItemPassive_Unique_Ring_513_x1.min, 0.000001f);
		Assert.assertEquals(12f, ii.attributesRaw.Item_Power_Passive_ItemPassive_Unique_Ring_513_x1.max, 0.000001f);
	}

}
