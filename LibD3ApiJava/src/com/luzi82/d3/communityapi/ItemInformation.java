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

	public RandomAffixe.OneOf.Attributes attributes;
	public RandomAffixe.OneOf.AttributesRaw attributesRaw;
	
	public RandomAffixe[] randomAffixes;
	public Object[] gems;
	public Object[] socketEffects;
	
	public static class Set{
		public String name;
		public ItemInformation[] items;
		public String slug;
		public Rank[] ranks;
		public static class Rank{
			public Integer required;
			public RandomAffixe.OneOf.Attributes attributes;
			public RandomAffixe.OneOf.AttributesRaw attributesRaw;
		}
	}
	public Set set;
	public Recipt recipe;
	public Recipt[] craftedBy;

	public static class RandomAffixe {
		public OneOf[] oneOf;

		public static class OneOf {
			public Attributes attributes;

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

			public AttributesRaw attributesRaw;

			public static class AttributesRaw {
				public Value<Float> Resistance_All;
				public Value<Float> Hitpoints_Max_Percent_Bonus_Item;
				public Value<Integer> Item_LegendaryItem_Level_Override;
				public Value<Integer> Durability_Max;
				@JsonProperty("Damage_Delta#Physical")
				public Value<Integer> Damage_Delta_Physical;
				public Value<Float> Power_Cooldown_Reduction_Percent_All;
				public Value<Integer> Item_Legendary_Item_Base_Item;
				public Value<Integer> Season;
				public Value<Integer> Dexterity_Item;
				public Value<Integer> Strength_Item;
				public Value<Integer> Vitality_Item;
				public Value<Integer> Health_Globe_Bonus_Health;
				public Value<Integer> Durability_Max_Before_Reforge;
				public Value<Integer> Durability_Cur;
				@JsonProperty("Resource_Max_Bonus#Arcanum")
				public Value<Integer> Resource_Max_Bonus_Arcanum;
				public Value<Float> Crit_Percent_Bonus_Capped;
				public Value<Integer> Item_Binding_Level_Override;
				@JsonProperty("Damage_Min#Physical")
				public Value<Integer> Damage_Min_Physical;
				public Value<Integer> Intelligence_Item;
				@JsonProperty("Damage_Dealt_Percent_Bonus#Cold")
				public Value<Float> Damage_Dealt_Percent_Bonus_Cold;
				@JsonProperty("Damage_Dealt_Percent_Bonus#Fire")
				public Value<Float> Damage_Dealt_Percent_Bonus_Fire;
				@JsonProperty("Damage_Dealt_Percent_Bonus#Arcane")
				public Value<Float> Damage_Dealt_Percent_Bonus_Arcane;
				@JsonProperty("Damage_Dealt_Percent_Bonus#Lightning")
				public Value<Float> Damage_Dealt_Percent_Bonus_Lightning;
				@JsonProperty("Resource_Regen_Per_Second#Arcanum")
				public Value<Float> Resource_Regen_Per_Second_Arcanum;
				@JsonProperty("Item_Power_Passive#ItemPassive_Unique_Ring_710_x1")
				public Value<Float> Item_Power_Passive_ItemPassive_Unique_Ring_710_x1;
				@JsonProperty("Item_Power_Passive#ItemPassive_Unique_Ring_715_x1")
				public Value<Float> Item_Power_Passive_ItemPassive_Unique_Ring_715_x1;
				@JsonProperty("Item_Power_Passive#ItemPassive_Unique_Ring_727_x1")
				public Value<Float> Item_Power_Passive_ItemPassive_Unique_Ring_727_x1;
				public Value<Float> Weapon_On_Hit_Blind_Proc_Chance;

				public Value<Float> Sockets;
				public Value<Float> Armor_Item;
				@JsonProperty("Thorns_Fixed#Physical")
				public Value<Float> Thorns_Fixed_Physical;
				public Value<Float> Armor_Bonus_Item;

				@JsonProperty("Resistance#Arcane")
				public Value<Float> Resistance_Arcane;
				
				public Value<Float> Gold_PickUp_Radius;
				public Value<Float> Item_Indestructible;
				public Value<Float> Intelligence;
			}
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
}
