package com.github.spooktober.core.enums;

public class EnumInit {
	
	public class itemIDS
	{
		public static final String candy_chocolate_bar = "candy_chocolate_bar";
		public static final String candy_lollipop = "candy_lollipop";
		public static final String candy_gummy_worms = "candy_gummy_worms";
		public static final String candy_gumballs = "candy_gumballs";
		public static final String candy_corn = "candy_corn";	
		
	}
	
	public static String[] returnCandyIDS()
	{
		String[] IDS = {itemIDS.candy_chocolate_bar, itemIDS.candy_lollipop, itemIDS.candy_gummy_worms, itemIDS.candy_gummy_worms, itemIDS.candy_gumballs, itemIDS.candy_corn};
		return IDS;
	}
	
	public static String getRandomCandyID()
	{
		String[] IDS = returnCandyIDS();
		return IDS[(int)(Math.random() * IDS.length)];
	}
	

}
