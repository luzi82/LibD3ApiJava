package com.luzi82.d3.communityapi;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ItemInformation {

	public String id;
	public String name;
	public String icon;
	public String displayColor;
	public String tooltipParams;
	public ItemInformation transmogItem;
	public Integer requiredLevel;
	public Integer itemLevel;
	public Integer bonusAffixes;
	public Integer bonusAffixesMax;
	public Boolean accountBound;
	public String flavorText;
	public String typeName;

	public static class Type{

		public Boolean twoHanded;
		public String id;
		
	}
	public Type type;
	
	public Value<Integer> armor;
	public Value<Float> dps;
	public Value<Float> attacksPerSecond;
	public Value<Float> minDamage;
	public Value<Float> maxDamage;
	public Value<Float> blockChance;

	public Attributes attributes;
	public AttributesRaw attributesRaw;
	
	public RandomAffixe[] randomAffixes;

	public static class Gem{
		public ItemInformation item;
		public Attributes attributes;
		public AttributesRaw attributesRaw;
	}
	public Gem[] gems;
	
	public Object[] socketEffects;
	
	public static class Set{
		public String name;
		public ItemInformation[] items;
		public String slug;
		public Rank[] ranks;
		public static class Rank{
			public Integer required;
			public Attributes attributes;
			public AttributesRaw attributesRaw;
		}
	}
	public Set set;
	public Recipt recipe;
	public Recipt[] craftedBy;

	public static class RandomAffixe {
		public OneOf[] oneOf;

		public static class OneOf {
			public Attributes attributes;
			public AttributesRaw attributesRaw;
		}
	}

	public static class Value<T> {
		public T min;
		public T max;
	}

	public static class Recipt {
		public String id;
		public String slug;
		public String name;
		public int cost;
		public Reagent[] reagents;

		public static class Reagent {
			public int quantity;
			public ItemInformation item;
		}

		public ItemInformation itemProduced;
	}

	public static class Attributes {
		public Attribute[] primary;
		public Attribute[] secondary;
		public Attribute[] passive;

		public static class Attribute {

			public String text;
			public String affixType;
			public String color;

		}

	}

	public static class AttributesRaw {
		public Value<Float> Dexterity_Item;
		public Value<Float> Intelligence_Item;
		public Value<Float> Strength_Item;
		public Value<Float> Vitality_Item;

		public Value<Float> Intelligence;
		public Value<Float> Vitality;

		public Value<Float> Resistance_All;
		public Value<Float> Hitpoints_Max_Percent_Bonus_Item;
		public Value<Float> Item_LegendaryItem_Level_Override;
		public Value<Float> Durability_Max;
		public Value<Float> Power_Cooldown_Reduction_Percent_All;
		public Value<Float> Item_Legendary_Item_Base_Item;
		public Value<Float> Season;
		public Value<Float> Health_Globe_Bonus_Health;
		public Value<Float> Durability_Max_Before_Reforge;
		public Value<Float> Durability_Cur;
		public Value<Float> Crit_Percent_Bonus_Capped;
		public Value<Float> Item_Binding_Level_Override;
		public Value<Float> Weapon_On_Hit_Blind_Proc_Chance;

		public Value<Float> Sockets;
		public Value<Float> Armor_Item;
		public Value<Float> Armor_Bonus_Item;

		public Value<Float> Gold_PickUp_Radius;
		public Value<Float> Item_Indestructible;
		public Value<Float> IsCrafted;
		public Value<Float> Experience_Bonus;
		public Value<Float> Hitpoints_Regen_Per_Second;
		public Value<Float> Resource_Cost_Reduction_Percent_All;
		public Value<Float> Crit_Damage_Percent;
		public Value<Float> Gold_Find;
		public Value<Float> Magic_Find;
		public Value<Float> Damage_Percent_Reduction_From_Melee;
		public Value<Float> Damage_Percent_Reduction_From_Ranged;
		public Value<Float> Damage_Percent_Reduction_From_Elites;
		public Value<Float> Damage_Percent_Bonus_Vs_Elites;
		public Value<Float> Hitpoints_On_Kill;
		public Value<Float> Attacks_Per_Second_Item;
		public Value<Float> Attribute_Set_Item_Discount;
		public Value<Float> Attacks_Per_Second_Percent;
		public Value<Float> CrowdControl_Reduction;
		public Value<Float> Hitpoints_On_Hit;
		public Value<Float> Weapon_On_Hit_Immobilize_Proc_Chance;
		public Value<Float> Weapon_On_Hit_Fear_Proc_Chance;
		public Value<Float> Weapon_On_Hit_Freeze_Proc_Chance;
		public Value<Float> Weapon_On_Hit_Knockback_Proc_Chance;
		public Value<Float> Weapon_On_Hit_Stun_Proc_Chance;
		public Value<Float> Block_Amount_Item_Min;
		public Value<Float> Block_Amount_Item_Delta;
		public Value<Float> Block_Chance_Item;
		public Value<Float> Block_Chance_Bonus_Item;
		public Value<Float> Steal_Health_Percent;
		public Value<Float> Movement_Scalar;
		public Value<Float> Item_Level_Requirement_Reduction;
		public Value<Float> Attacks_Per_Second_Item_Percent;
		public Value<Float> Experience_Bonus_Percent;
		public Value<Float> Weapon_On_Hit_Bleed_Proc_Chance;
		public Value<Float> Splash_Damage_Effect_Percent;
		
		@JsonProperty("Resource_On_Kill#Mana")
		public Value<Float> Resource_On_Kill_Mana;

		public Value<Float> Crossbow;
		public Value<Float> Bow;
		public Value<Float> Quiver;
		
		@JsonProperty("Resource_Max_Bonus#Arcanum")
		public Value<Float> Resource_Max_Bonus_Arcanum;
		@JsonProperty("Resource_Regen_Per_Second#Arcanum")
		public Value<Float> Resource_Regen_Per_Second_Arcanum;
		
		@JsonProperty("Resource_Max_Bonus#Fury")
		public Value<Float> Resource_Max_Bonus_Fury;
		
		@JsonProperty("Resource_Max_Bonus#Mana")
		public Value<Float> Resource_Max_Bonus_Mana;
		@JsonProperty("Resource_Regen_Per_Second#Mana")
		public Value<Float> Resource_Regen_Per_Second_Mana;
		
		@JsonProperty("Resource_Max_Bonus#Spirit")
		public Value<Float> Resource_Max_Bonus_Spirit;
		
		@JsonProperty("Damage_Dealt_Percent_Bonus#Arcane")
		public Value<Float> Damage_Dealt_Percent_Bonus_Arcane;
		@JsonProperty("Damage_Dealt_Percent_Bonus#Cold")
		public Value<Float> Damage_Dealt_Percent_Bonus_Cold;
		@JsonProperty("Damage_Dealt_Percent_Bonus#Fire")
		public Value<Float> Damage_Dealt_Percent_Bonus_Fire;
		@JsonProperty("Damage_Dealt_Percent_Bonus#Lightning")
		public Value<Float> Damage_Dealt_Percent_Bonus_Lightning;
		@JsonProperty("Damage_Dealt_Percent_Bonus#Physical")
		public Value<Float> Damage_Dealt_Percent_Bonus_Physical;

//		@JsonProperty("Damage_Delta#Arcane")
//		public Value<Float> Damage_Delta_Arcane;
//		@JsonProperty("Damage_Delta#Cold")
//		public Value<Float> Damage_Delta_Cold;
//		@JsonProperty("Damage_Delta#Fire")
//		public Value<Float> Damage_Delta_Fire;
//		@JsonProperty("Damage_Delta#Lightning")
//		public Value<Float> Damage_Delta_Lightning;
		@JsonProperty("Damage_Delta#Physical")
		public Value<Float> Damage_Delta_Physical;

//		@JsonProperty("Damage_Min#Arcane")
//		public Value<Float> Damage_Min_Arcane;
//		@JsonProperty("Damage_Min#Cold")
//		public Value<Float> Damage_Min_Cold;
//		@JsonProperty("Damage_Min#Fire")
//		public Value<Float> Damage_Min_Fire;
//		@JsonProperty("Damage_Min#Lightning")
//		public Value<Float> Damage_Min_Lightning;
		@JsonProperty("Damage_Min#Physical")
		public Value<Float> Damage_Min_Physical;

		@JsonProperty("Damage_Weapon_Delta#Arcane")
		public Value<Float> Damage_Weapon_Delta_Arcane;
		@JsonProperty("Damage_Weapon_Delta#Cold")
		public Value<Float> Damage_Weapon_Delta_Cold;
		@JsonProperty("Damage_Weapon_Delta#Fire")
		public Value<Float> Damage_Weapon_Delta_Fire;
		@JsonProperty("Damage_Weapon_Delta#Holy")
		public Value<Float> Damage_Weapon_Delta_Holy;
		@JsonProperty("Damage_Weapon_Delta#Lightning")
		public Value<Float> Damage_Weapon_Delta_Lightning;
		@JsonProperty("Damage_Weapon_Delta#Physical")
		public Value<Float> Damage_Weapon_Delta_Physical;
		@JsonProperty("Damage_Weapon_Delta#Poison")
		public Value<Float> Damage_Weapon_Delta_Poison;

		@JsonProperty("Damage_Weapon_Bonus_Delta#Physical")
		public Value<Float> Damage_Weapon_Bonus_Delta_Physical;
		@JsonProperty("Damage_Weapon_Bonus_Delta_X1#Physical")
		public Value<Float> Damage_Weapon_Bonus_Delta_X1_Physical;

		@JsonProperty("Damage_Weapon_Min#Arcane")
		public Value<Float> Damage_Weapon_Min_Arcane;
		@JsonProperty("Damage_Weapon_Min#Cold")
		public Value<Float> Damage_Weapon_Min_Cold;
		@JsonProperty("Damage_Weapon_Min#Fire")
		public Value<Float> Damage_Weapon_Min_Fire;
//		Damage_Weapon_Min#Holy
		@JsonProperty("Damage_Weapon_Min#Lightning")
		public Value<Float> Damage_Weapon_Min_Lightning;
		@JsonProperty("Damage_Weapon_Min#Physical")
		public Value<Float> Damage_Weapon_Min_Physical;
		@JsonProperty("Damage_Weapon_Min#Poison")
		public Value<Float> Damage_Weapon_Min_Poison;

		@JsonProperty("Resistance#Arcane")
		public Value<Float> Resistance_Arcane;
		@JsonProperty("Resistance#Cold")
		public Value<Float> Resistance_Cold;
		@JsonProperty("Resistance#Fire")
		public Value<Float> Resistance_Fire;
		@JsonProperty("Resistance#Lightning")
		public Value<Float> Resistance_Lightning;
		@JsonProperty("Resistance#Physical")
		public Value<Float> Resistance_Physical;
		@JsonProperty("Resistance#Poison")
		public Value<Float> Resistance_Poison;
		
//		Damage_Weapon_Bonus_Flat#Physical

		@JsonProperty("Damage_Weapon_Bonus_Min#Physical")
		public Value<Float> Damage_Weapon_Bonus_Min_Physical;
		@JsonProperty("Damage_Bonus_Min#Physical")
		public Value<Float> Damage_Bonus_Min_Physical;
		@JsonProperty("Damage_Weapon_Bonus_Min_X1#Physical")
		public Value<Float> Damage_Weapon_Bonus_Min_X1_Physical;

		@JsonProperty("Thorns_Fixed#Fire")
		public Value<Float> Thorns_Fixed_Fire;
		@JsonProperty("Thorns_Fixed#Physical")
		public Value<Float> Thorns_Fixed_Physical;
		
		@JsonProperty("Damage_Weapon_Percent_Bonus#Physical")
		public Value<Float> Damage_Weapon_Percent_Bonus_Physical;

		@JsonProperty("Power_Damage_Percent_Bonus#Barbarian_Bash")
		public Value<Float> Power_Damage_Percent_Bonus_Barbarian_Bash;

		@JsonProperty("Power_Damage_Percent_Bonus#X1_Crusader_BlessedShield")
		public Value<Float> Power_Damage_Percent_Bonus_X1_Crusader_BlessedShield;
		@JsonProperty("Power_Damage_Percent_Bonus#X1_Crusader_ShieldBash2")
		public Value<Float> Power_Damage_Percent_Bonus_X1_Crusader_ShieldBash2;

		@JsonProperty("Power_Damage_Percent_Bonus#X1_DemonHunter_EntanglingShot")
		public Value<Float> Power_Damage_Percent_Bonus_X1_DemonHunter_EntanglingShot;
//		Power_Damage_Percent_Bonus#X1_DemonHunter_EvasiveFire
//		Power_Damage_Percent_Bonus#DemonHunter_Sentry
//		Power_Damage_Percent_Bonus#DemonHunter_RapidFire
		
		@JsonProperty("Power_Damage_Percent_Bonus#Monk_CripplingWave")
		public Value<Float> Power_Damage_Percent_Bonus_Monk_CripplingWave;
		@JsonProperty("Power_Damage_Percent_Bonus#Monk_LashingTailKick")
		public Value<Float> Power_Damage_Percent_Bonus_Monk_LashingTailKick;
//		Power_Damage_Percent_Bonus#Monk_TempestRush

		@JsonProperty("Power_Damage_Percent_Bonus#Trait_Witchdoctor_ZombieDogSpawner_Passive")
		public Value<Float> Power_Damage_Percent_Bonus_Trait_Witchdoctor_ZombieDogSpawner_Passive;
		
//		Item_Power_Passive#ItemPassive_Unique_Boots_007_x1

		@JsonProperty("Item_Power_Passive#ItemPassive_Unique_Bracer_105_x1")
		public Value<Float> Item_Power_Passive_ItemPassive_Unique_Bracer_105_x1;
		
		@JsonProperty("Item_Power_Passive#itemPassive_Unique_Mace_1H_002_x1")
		public Value<Float> Item_Power_Passive_itemPassive_Unique_Mace_1H_002_x1;
		
		@JsonProperty("Item_Power_Passive#itemPassive_Unique_Pants_007_x1")
		public Value<Float> Item_Power_Passive_itemPassive_Unique_Pants_007_x1;
		
		@JsonProperty("Item_Power_Passive#ItemPassive_Unique_Ring_015_x1")
		public Value<Float> Item_Power_Passive_ItemPassive_Unique_Ring_015_x1;
		@JsonProperty("Item_Power_Passive#ItemPassive_Unique_Ring_020_x1")
		public Value<Float> Item_Power_Passive_ItemPassive_Unique_Ring_020_x1;
		@JsonProperty("Item_Power_Passive#ItemPassive_Unique_Ring_024")
		public Value<Float> Item_Power_Passive_ItemPassive_Unique_Ring_024;
		@JsonProperty("Item_Power_Passive#ItemPassive_Unique_Ring_513_x1")
		public Value<Float> Item_Power_Passive_ItemPassive_Unique_Ring_513_x1;
		@JsonProperty("Item_Power_Passive#ItemPassive_Unique_Ring_515_x1")
		public Value<Float> Item_Power_Passive_ItemPassive_Unique_Ring_515_x1;
		@JsonProperty("Item_Power_Passive#ItemPassive_Unique_Ring_526_x1")
		public Value<Float> Item_Power_Passive_ItemPassive_Unique_Ring_526_x1;
		@JsonProperty("Item_Power_Passive#ItemPassive_Unique_Ring_581_x1")
		public Value<Float> Item_Power_Passive_ItemPassive_Unique_Ring_581_x1;
		@JsonProperty("Item_Power_Passive#ItemPassive_Unique_Ring_616_x1")
		public Value<Float> Item_Power_Passive_ItemPassive_Unique_Ring_616_x1;
		@JsonProperty("Item_Power_Passive#ItemPassive_Unique_Ring_624_x1")
		public Value<Float> Item_Power_Passive_ItemPassive_Unique_Ring_624_x1;
		@JsonProperty("Item_Power_Passive#ItemPassive_Unique_Ring_648_x1")
		public Value<Float> Item_Power_Passive_ItemPassive_Unique_Ring_648_x1;
		@JsonProperty("Item_Power_Passive#ItemPassive_Unique_Ring_653_x1")
		public Value<Float> Item_Power_Passive_ItemPassive_Unique_Ring_653_x1;
		@JsonProperty("Item_Power_Passive#ItemPassive_Unique_Ring_664_x1")
		public Value<Float> Item_Power_Passive_ItemPassive_Unique_Ring_664_x1;
		@JsonProperty("Item_Power_Passive#ItemPassive_Unique_Ring_665_x1")
		public Value<Float> Item_Power_Passive_ItemPassive_Unique_Ring_665_x1;
		@JsonProperty("Item_Power_Passive#ItemPassive_Unique_Ring_669_x1")
		public Value<Float> Item_Power_Passive_ItemPassive_Unique_Ring_669_x1;
		@JsonProperty("Item_Power_Passive#ItemPassive_Unique_Ring_686_x1")
//		Item_Power_Passive#ItemPassive_Unique_Ring_681_x1
		public Value<Float> Item_Power_Passive_ItemPassive_Unique_Ring_686_x1;
		@JsonProperty("Item_Power_Passive#ItemPassive_Unique_Ring_703_x1")
		public Value<Float> Item_Power_Passive_ItemPassive_Unique_Ring_703_x1;
		@JsonProperty("Item_Power_Passive#ItemPassive_Unique_Ring_710_x1")
		public Value<Float> Item_Power_Passive_ItemPassive_Unique_Ring_710_x1;
		@JsonProperty("Item_Power_Passive#ItemPassive_Unique_Ring_715_x1")
		public Value<Float> Item_Power_Passive_ItemPassive_Unique_Ring_715_x1;
		@JsonProperty("Item_Power_Passive#ItemPassive_Unique_Ring_727_x1")
		public Value<Float> Item_Power_Passive_ItemPassive_Unique_Ring_727_x1;
		
		@JsonProperty("Item_Power_Passive#itemPassive_Unique_Shield_011")
		public Value<Float> Item_Power_Passive_itemPassive_Unique_Shield_011;

		@JsonProperty("Item_Power_Passive#ItemPassive_Unique_Shoulder_002_x1")
		public Value<Float> Item_Power_Passive_ItemPassive_Unique_Shoulder_002_x1;

		@JsonProperty("Item_Power_Passive#itemPassive_Unique_XBow_002")
		public Value<Float> Item_Power_Passive_itemPassive_Unique_XBow_002;
		
//		Requirement_When_Equipped#BowAny
	}
}
