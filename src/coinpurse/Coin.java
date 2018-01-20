package coinpurse;

import java.lang.Comparable;
import java.util.ArrayList;
import java.util.List;

/**
 * Coin represents coinage (money) with a fixed value and currency.
 * 
 * @author Worawat Chueajedton
 */

public class Coin implements Comparable<Coin> {

	private double value;
	private String currency;

	/**
	 * 
	 * Make a coins with value and currency.
	 * 
	 * @param value
	 *            value of coin
	 * @param currency
	 *            currency of coin
	 */

	public Coin(double value, String currency) {
		this.value = value;
		this.currency = currency;
	}

	/**
	 * 
	 * Get a coin's value.
	 * 
	 * @return value of coin
	 * 
	 */
	public double getValue() {
		return value;
	}

	/**
	 * 
	 * Get a coin's currency
	 * 
	 * @return currency of coin
	 */
	public String getCurrenccy() {
		return currency;
	}

	/**
	 * 
	 * Two coins are equal if they have the same value and same currency
	 * 
	 * @param arg
	 *           An object you want to check, Is it equal?
	 * @return if it equal return true, if not return false.
	 */
	public boolean equal(Object arg) {
		if (arg == null)
			return false;
		if (arg.getClass() != this.getClass())
			return false;
		Coin other = (Coin) arg;
		if (other.getValue() == value && other.getCurrenccy().equalsIgnoreCase(currency)) {
			return true;
		}
		return false;
	}

	/**
	 * 
	 * To compare which one is greater of less than another one.
	 * 
	 * @param arg0
	 *           coin that you want to check. 
	 * 
	 */
	@Override
	public int compareTo(Coin arg0) {
		if (value < arg0.getValue()) {
			return -1;
		} else if (value > arg0.getValue()) {
			return 1;
		} else if (value == arg0.getValue()) {
			return 0;
		}
		return 0;
	}

	/**
	 * 
	 * Show description of coin
	 * 
	 * @return coin's description
	 * 
	 */
	public String toString() {
		return value + "-" + currency;
	}
}
