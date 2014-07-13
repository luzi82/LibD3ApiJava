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

		public ItemInformation head;
		public ItemInformation torso;
		public ItemInformation feet;
		public ItemInformation hands;
		public ItemInformation shoulders;
		public ItemInformation legs;
		public ItemInformation bracers;
		public ItemInformation mainHand;
		public ItemInformation offHand;
		public ItemInformation waist;
		public ItemInformation rightFinger;
		public ItemInformation leftFinger;
		public ItemInformation neck;

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
				public ItemInformation special;
				public ItemInformation mainHand;
				public ItemInformation offHand;
				public ItemInformation rightFinger;
				public ItemInformation leftFinger;
				public ItemInformation neck;
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
