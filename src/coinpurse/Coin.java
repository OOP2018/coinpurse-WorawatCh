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
	 * Show description of coin
	 * 
	 * @return coin's description
	 * 
	 */
	public String toString() {
		if(value < 1){
			return String.format("%.0f-%s",getValue()*100,getCurrency());
		}
		return getValue() + "-" + getCurrency();
	}
}
