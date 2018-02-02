package coinpurse;

/**
 * A bank note money with value and currency
 * 
 * @author Worawat Chueajedton
 *
 */
public class BankNote implements Valuable{
	
	private long nextSerialNumber = 1000000;
	private double value;
	private String currency;
	private long serialNumber;

	/**
	 * Create bank note with value and currency
	 * 
	 * @param value
	 *          is value of money
	 * @param currency
	 *          is currency of money
	 */
	public BankNote(double value, String currency){
		this.value =value;
		this.currency = currency;
		this.serialNumber = nextSerialNumber++;
	}
	
	/**
	 * To get value of bank note
	 * 
	 * @return value of bank note
	 * 
	 */
	public double getValue() {
		return value;
	}

	/**
	 * To get currency of bank note
	 * 
	 * @return currency of bank note
	 */
	public String getCurrency() {
		return currency;
	}
	
	/**
	 * To get serial number of bank note
	 * 
	 * @return serial number of bank note
	 */
	public long getSerial(){
		return nextSerialNumber;
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
		Coin other = (Coin) arg;
		return (other.getValue() == value && other.getCurrency().equalsIgnoreCase(currency));
	}
	
	/**
	 * 
	 * Show description of bank note
	 * 
	 * @return bank note's description
	 * 
	 */
	public String toString(){
		return value +" - "+ currency+" note ["+getSerial()+"]";
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
}

