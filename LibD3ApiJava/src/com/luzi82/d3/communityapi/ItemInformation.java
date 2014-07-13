package com.luzi82.d3.communityapi;

import com.luzi82.d3.communityapi.HeroProfile.Item.Recipt;

public class ItemInformation {

	public String id;
	public String name;
	public String icon;
	public String displayColor;
	public String tooltipParams;
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

	public HeroProfile.Item.RandomAffixe.OneOf.Attributes attributes;
	public HeroProfile.Item.RandomAffixe.OneOf.AttributesRaw attributesRaw;
	
	public HeroProfile.Item.RandomAffixe[] randomAffixes;
	public Object[] gems;
	public Object[] socketEffects;
	
	public static class Set{
		public String name;
		public ItemInformation[] items;
		public String slug;
		public Rank[] ranks;
		public static class Rank{
			public Integer required;
			public HeroProfile.Item.RandomAffixe.OneOf.Attributes attributes;
			public HeroProfile.Item.RandomAffixe.OneOf.AttributesRaw attributesRaw;
		}
	}
	public Set set;
	public Recipt[] craftedBy;
}
