package coinpurse;

/**
 * A super class of coin and bank note
 * 
 * @author Worawat Chuejedton
 *
 */
public class Money implements Valuable{

	protected double value;
	protected String currency;

	/**
	 * Create money with value and currency. It can be coin or bank note
	 * 
	 * @param value
	 * @param currency
	 */
	public Money(double value, String currency) {
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
	public String getCurrency() {
		return currency;
	}

	@Override
	public int compareTo(Valuable arg0) {
		return (int) Math.signum(arg0.getValue() - value);
	}

	/**
	 * 
	 * Two bank note are equal if they have the same value and same currency
	 * 
	 * @param arg
	 *            An object you want to check, Is it equal?
	 * @return if it equal return true, if not return false.
	 */
	public boolean equal(Object arg) {
		if (arg == null)
			return false;
		if (arg.getClass() != this.getClass())
			return false;
		 Money other = (Money) arg;
		if(other.getValue() == value && other.getCurrency().equalsIgnoreCase(currency)){
			return true;
		}
		return false;
	}

}