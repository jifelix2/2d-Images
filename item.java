package priceWatcher;

//********************************************
//this is will be changed in the future but for
// now is just hard coded

public class item {
	static String itemName = "Desk";;
	static double itemPrice = 20;
	static String itemUrl = "www.amazon.com";
	static double recentPrice = itemPrice;
	static double priceChange = itemPrice/recentPrice;

	public static void priceUpdate() {
		recentPrice = itemPrice;
		itemPrice = 20 + (Math.random() * 5);
	}
	
	public static double getPrice() {
		return itemPrice;
	}

}
