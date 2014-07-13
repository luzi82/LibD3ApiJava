package com.luzi82.d3.communityapi;

import com.fasterxml.jackson.annotation.JsonProperty;

public class HeroProfile {

	public long id;
	public String name;
	@JsonProperty("class")
	public String clazz;
	public int gender;
	public int level;
	public int paragonLevel;
	public boolean hardcore;
	public Skills skills;

	public static class Skills {

		public Active[] active;

		public static class Active {
			public Skill skill;

			public static class Skill {
				public String slug;
				public String name;
				public String icon;
				public int level;
				public String categorySlug;
				public String tooltipUrl;
				public String description;
				public String simpleDescription;
				public String skillCalcId;
			}

			public Rune rune;

			public static class Rune {
				public String slug;
				public String type;
				public String name;
				public int level;
				public String description;
				public String simpleDescription;
				public String tooltipParams;
				public String skillCalcId;
				public int order;
			}
		}

		public Passive[] passive;

		public static class Passive {
			public Skill skill;

			public static class Skill {
				public String slug;
				public String name;
				public String icon;
				public int level;
				public String tooltipUrl;
				public String description;
				public String flavor;
				public String skillCalcId;
			}
		}

	}

	public Items items;

	public static class Items {

		public Item head;
		public Item torso;
		public Item feet;
		public Item hands;
		public Item shoulders;
		public Item legs;
		public Item bracers;
		public Item mainHand;
		public Item offHand;
		public Item waist;
		public Item rightFinger;
		public Item leftFinger;
		public Item neck;

	}

	public Followers followers;

	public static class Followers {
		public Follower templar;
		public Follower scoundrel;
		public Follower enchantress;

		public static class Follower {

			public String slug;
			public int level;
			public Items items;

			public static class Items {
				public Item special;
				public Item mainHand;
				public Item offHand;
				public Item rightFinger;
				public Item leftFinger;
				public Item neck;
			}

			public Stats stats;

			public static class Stats {
				public int goldFind;
				public int magicFind;
				public int experienceBonus;
			}

			public Skills[] skills;

			public static class Skills {

				public Skill skill;

				public static class Skill {

					public String slug;
					public String name;
					public String icon;
					public int level;
					public String tooltipUrl;
					public String description;
					public String simpleDescription;
					public String skillCalcId;

				}

			}

		}
	}

	public static class Item {

		public String id;
		public String name;
		public String icon;
		public String displayColor;
		public String tooltipParams;
		public Item transmogItem;
		public RandomAffixe[] randomAffixes;

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

					public static class Value<T> {
						public T min;
						public T max;
					}
				}
			}
		}

		public Recipt recipe;

		public static class Recipt {
			public String id;
			public String slug;
			public String name;
			public int cost;
			public Reagent[] reagents;

			public static class Reagent {
				public int quantity;
				public Item item;
			}

			public Item itemProduced;
		}

		public Recipt[] craftedBy;

	}

	public Stats stats;

	public static class Stats {
		public int life;
		public float damage;
		public float attackSpeed;
		public int armor;
		public int strength;
		public int dexterity;
		public int vitality;
		public int intelligence;
		public int physicalResist;
		public int fireResist;
		public int coldResist;
		public int lightningResist;
		public int poisonResist;
		public int arcaneResist;
		public float critDamage;
		public float blockChance;
		public int blockAmountMin;
		public int blockAmountMax;
		public float damageIncrease;
		public float critChance;
		public float damageReduction;
		public float thorns;
		public float lifeSteal;
		public float lifePerKill;
		public float goldFind;
		public float magicFind;
		public float lifeOnHit;
		public int primaryResource;
		public int secondaryResource;
	}

	public Kills kills;

	public static class Kills {
		public int elites;
	}

	public Progression progression;

	public static class Progression {
		public Act act1;
		public Act act2;
		public Act act3;
		public Act act4;
		public Act act5;

		public static class Act {
			public boolean completed;
			public CompletedQuest[] completedQuests;

			public static class CompletedQuest {
				public String slug;
				public String name;
			}
		}
	}
	
	public boolean dead;
	@JsonProperty("last-updated")
	public long lastUpdated;

}
