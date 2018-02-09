package coinpurse;

/**
 * An interface for objects having a monetary value and currency.
 */
public interface Valuable extends Comparable<Valuable> {
	/**
	 * 
	 * Get a object's value
	 * 
	 * @return value of object
	 */
	public double getValue();

	/**
	 * 
	 * Get a object's currency
	 * 
	 * @return currency of object
	 */
	public String getCurrency();

}