package coinpurse;

/**
 * Coin represents coinage (money) with a fixed value and currency.
 * 
 * @author Worawat Chueajedton
 */

public class Coin extends Money {

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
		super(value, currency);
	}

	/**
	 * 
	 * To compare which one is greater of less than another one.
	 * 
	 * @param arg0
	 *            coin that you want to check.
	 * 
	 */
	@Override
	public int compareTo(Valuable arg0) {
		return (int) Math.signum(arg0.getValue() - value);
	}

	/**
	 * 
	 * Show description of coin
	 * 
	 * @return coin's description
	 * 
	 */
	public String toString() {
		return getValue() + "-" + getCurrency();
	}
}
