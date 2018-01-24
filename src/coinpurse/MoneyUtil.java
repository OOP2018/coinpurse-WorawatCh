package coinpurse;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 
 * Class that can help coin and purse to east to sort and filter coin by
 * currency.
 * 
 * @author Worawat Chueajedton
 *
 */
public class MoneyUtil {

	/**
	 * 
	 * Return a List of Coins that contains only the coins from coins (the
	 * parameter) that have same currency as the currency parameter.
	 * 
	 * @param coins
	 *            List of coin which you want to sort.
	 * @param currency
	 *            Currency of coin which you want to filter.
	 * @return List of coin that already filter by currency
	 */
	public static List<Coin> filterByCurrency(List<Coin> coins, String currency) {
		List<Coin> tempList = new ArrayList<Coin>();
		for (Coin c : coins) {
			if (c.getCurrency() == currency) {
				tempList.add(c);
			}
		}
		return tempList;
	}

	/**
	 * Sort a list of coins and print the result on the console. Write a
	 * separate method to print the list.
	 * 
	 * @param coins
	 *          List of coin you want to sort
	 */
	public static void sortCoins(List<Coin> coins) {
		Collections.sort(coins);
		Collections.reverse(coins);
	}

}
