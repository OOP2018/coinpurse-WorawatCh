package coinpurse;

import java.lang.Comparable;

/**
 * Coin represents coinage (money) with a fixed value and currency.
 * 
 * @author Worawat Chueajedton
 */

public class Coin implements Comparable<Coin> {
	private double value;
	private String currency;

	public Coin(double value, String currency) {
		this.value = value;
		this.currency = currency;
	}

	public double getValue() {
		return value;
	}

	public String getCurrenccy() {
		return currency;
	}

	@Override
	public int compareTo(Coin arg0) {
		
		return 0;
	}

	public String toString() {
       return value+"-"+currency;
	}
}
