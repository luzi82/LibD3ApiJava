package com.luzi82.d3.communityapi;


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
}
