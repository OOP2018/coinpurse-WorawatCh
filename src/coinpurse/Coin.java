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

	public String toString() {
		return value + "-" + currency;
	}
}
