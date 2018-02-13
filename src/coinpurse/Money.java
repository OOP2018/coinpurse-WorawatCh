package coinpurse;

/**
 * A super class of coin and bank note.It has same method that coin and bank note has the same.
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
	 * Get a money's value.
	 * 
	 * @return value of coin
	 * 
	 */
	public double getValue() {
		return value;
	}

	/**
	 * 
	 * Get a money's currency
	 * 
	 * @return currency of coin
	 */
	public String getCurrency() {
		return currency;
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
		if(arg0.getCurrency() == this.getCurrency()){
			return Double.compare(arg0.getValue(), this.getValue());
		}
		return 0;
	}

	/**
	 * 
	 * Two money note are equal if they have the same value and same currency
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
		return (other.getValue() == value && other.getCurrency().equalsIgnoreCase(currency));
			
	}
	
	public static void main(String[] args) {
		Money m1 = new Money(10, "Bath");
		Money m2 = new Money(20, "Bath");
	}

}