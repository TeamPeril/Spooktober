package com.github.spooktober.core.enums;

public class EnumInit {
	
	public class itemIDS
	{
		public static final String candy_chocolate_bar = "candy_chocolate_bar";
		public static final String candy_lollipop = "candy_lollipop";
		public static final String candy_gummy_worms = "candy_gummy_worms";
		public static final String candy_gumballs = "candy_gumballs";
		public static final String candy_corn = "candy_corn";
		public static final String candy_spider_eye = "candy_spider_eye";
		public static final String candy_slime_on_a_stick = "candy_slime_on_a_stick";
		public static final String candy_sugar_blaze_stick = "candy_sugar_blaze_stick";
		public static final String haunted_axe = "haunted_axe";
		public static final String haunted_pumkin_head = "haunted_pumkin_head";
	}
	
	
	
	public static String[] returnCandyIDS()
	{
		String[] IDS = {itemIDS.candy_chocolate_bar, 
				itemIDS.candy_lollipop, 
				itemIDS.candy_gummy_worms, 
				itemIDS.candy_gummy_worms, 
				itemIDS.candy_gumballs, 
				itemIDS.candy_corn,
				itemIDS.candy_spider_eye,
				itemIDS.candy_slime_on_a_stick,
				itemIDS.candy_sugar_blaze_stick};
		
		return IDS;
	}
	
	public static String getRandomCandyID()
	{
		String[] IDS = returnCandyIDS();
		return IDS[(int)(Math.random() * IDS.length)];
	}
	

}
