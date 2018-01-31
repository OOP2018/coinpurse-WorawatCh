package coinpurse;

// TODO write good Javadoc. An interface is a specification,
// so it needs good documentation! An interface without documentation
// is USELESS. Write all the tags (@param, @return) for methods.
/**
 * An interface for objects having a monetary value and currency.
 */
public interface Valuable extends Comparable<Valuable> {
	public double getValue();

	/**
	 * 
	 * Get a coin's currency
	 * 
	 * @return currency of coin
	 */
	public String getCurrency();


}