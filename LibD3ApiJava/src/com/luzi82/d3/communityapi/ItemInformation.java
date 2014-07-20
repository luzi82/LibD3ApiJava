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
		public Value<Float> Resistance_All;
		public Value<Float> Hitpoints_Max_Percent_Bonus_Item;
		public Value<Integer> Item_LegendaryItem_Level_Override;
		public Value<Integer> Durability_Max;
		public Value<Float> Power_Cooldown_Reduction_Percent_All;
		public Value<Integer> Item_Legendary_Item_Base_Item;
		public Value<Integer> Season;
		public Value<Integer> Dexterity_Item;
		public Value<Integer> Strength_Item;
		public Value<Integer> Vitality_Item;
		public Value<Integer> Health_Globe_Bonus_Health;
		public Value<Integer> Durability_Max_Before_Reforge;
		public Value<Integer> Durability_Cur;
		public Value<Float> Crit_Percent_Bonus_Capped;
		public Value<Integer> Item_Binding_Level_Override;
		public Value<Integer> Intelligence_Item;
		public Value<Float> Weapon_On_Hit_Blind_Proc_Chance;

		public Value<Float> Sockets;
		public Value<Float> Armor_Item;
		public Value<Float> Armor_Bonus_Item;

		public Value<Float> Gold_PickUp_Radius;
		public Value<Float> Item_Indestructible;
		public Value<Float> Intelligence;
		public Value<Float> IsCrafted;
		public Value<Float> Experience_Bonus;
		public Value<Float> Hitpoints_Regen_Per_Second;
		public Value<Float> Resource_Cost_Reduction_Percent_All;
		public Value<Float> Crit_Damage_Percent;
		public Value<Float> Gold_Find;
		public Value<Float> Damage_Percent_Reduction_From_Melee;
		public Value<Float> Damage_Percent_Reduction_From_Ranged;
		public Value<Float> Damage_Percent_Reduction_From_Elites;
		public Value<Float> Damage_Percent_Bonus_Vs_Elites;
		public Value<Float> Hitpoints_On_Kill;
		public Value<Float> Attacks_Per_Second_Item;
		public Value<Float> Weapon_On_Hit_Stun_Proc_Chance;
		public Value<Float> Attribute_Set_Item_Discount;
		public Value<Float> Attacks_Per_Second_Percent;
		public Value<Float> CrowdControl_Reduction;
		public Value<Float> Hitpoints_On_Hit;
		public Value<Float> Weapon_On_Hit_Immobilize_Proc_Chance;
		public Value<Float> Block_Amount_Item_Min;
		public Value<Float> Block_Amount_Item_Delta;
		public Value<Float> Block_Chance_Item;
		public Value<Float> Block_Chance_Bonus_Item;

		@JsonProperty("Resource_Max_Bonus#Arcanum")
		public Value<Integer> Resource_Max_Bonus_Arcanum;
		@JsonProperty("Resource_Regen_Per_Second#Arcanum")
		public Value<Float> Resource_Regen_Per_Second_Arcanum;
		
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

		@JsonProperty("Damage_Delta#Arcane")
		public Value<Integer> Damage_Delta_Arcane;
		@JsonProperty("Damage_Delta#Cold")
		public Value<Integer> Damage_Delta_Cold;
		@JsonProperty("Damage_Delta#Fire")
		public Value<Integer> Damage_Delta_Fire;
		@JsonProperty("Damage_Delta#Lightning")
		public Value<Integer> Damage_Delta_Lightning;
		@JsonProperty("Damage_Delta#Physical")
		public Value<Integer> Damage_Delta_Physical;

		@JsonProperty("Damage_Min#Arcane")
		public Value<Integer> Damage_Min_Arcane;
		@JsonProperty("Damage_Min#Cold")
		public Value<Integer> Damage_Min_Cold;
		@JsonProperty("Damage_Min#Fire")
		public Value<Integer> Damage_Min_Fire;
		@JsonProperty("Damage_Min#Lightning")
		public Value<Integer> Damage_Min_Lightning;
		@JsonProperty("Damage_Min#Physical")
		public Value<Integer> Damage_Min_Physical;

		@JsonProperty("Damage_Weapon_Delta#Arcane")
		public Value<Float> Damage_Weapon_Delta_Arcane;
		@JsonProperty("Damage_Weapon_Delta#Cold")
		public Value<Float> Damage_Weapon_Delta_Cold;
		@JsonProperty("Damage_Weapon_Delta#Fire")
		public Value<Float> Damage_Weapon_Delta_Fire;
		@JsonProperty("Damage_Weapon_Delta#Lightning")
		public Value<Float> Damage_Weapon_Delta_Lightning;
		@JsonProperty("Damage_Weapon_Delta#Physical")
		public Value<Float> Damage_Weapon_Delta_Physical;

		@JsonProperty("Damage_Weapon_Min#Arcane")
		public Value<Float> Damage_Weapon_Min_Arcane;
		@JsonProperty("Damage_Weapon_Min#Cold")
		public Value<Float> Damage_Weapon_Min_Cold;
		@JsonProperty("Damage_Weapon_Min#Fire")
		public Value<Float> Damage_Weapon_Min_Fire;
		@JsonProperty("Damage_Weapon_Min#Lightning")
		public Value<Float> Damage_Weapon_Min_Lightning;
		@JsonProperty("Damage_Weapon_Min#Physical")
		public Value<Float> Damage_Weapon_Min_Physical;

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
		
		@JsonProperty("Thorns_Fixed#Physical")
		public Value<Float> Thorns_Fixed_Physical;
		
		@JsonProperty("Damage_Weapon_Percent_Bonus#Physical")
		public Value<Float> Damage_Weapon_Percent_Bonus_Physical;
		
		@JsonProperty("Item_Power_Passive#ItemPassive_Unique_Ring_515_x1")
		public Value<Float> Item_Power_Passive_ItemPassive_Unique_Ring_515_x1;
		@JsonProperty("Item_Power_Passive#ItemPassive_Unique_Ring_581_x1")
		public Value<Float> Item_Power_Passive_ItemPassive_Unique_Ring_581_x1;
		@JsonProperty("Item_Power_Passive#ItemPassive_Unique_Ring_710_x1")
		public Value<Float> Item_Power_Passive_ItemPassive_Unique_Ring_710_x1;
		@JsonProperty("Item_Power_Passive#ItemPassive_Unique_Ring_715_x1")
		public Value<Float> Item_Power_Passive_ItemPassive_Unique_Ring_715_x1;
		@JsonProperty("Item_Power_Passive#ItemPassive_Unique_Ring_727_x1")
		public Value<Float> Item_Power_Passive_ItemPassive_Unique_Ring_727_x1;
	}
}
