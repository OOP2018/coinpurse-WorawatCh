package coinpurse;

public class BankNote implements Valuable{
	
	private long nextSerialNumber = 1000000;
	private double value;
	private String currency;
	private long serialNumber;

	public BankNote(double value, String currency){
		this.value =value;
		this.currency = currency;
		this.serialNumber = nextSerialNumber++;
	}
	
	public double getValue() {
		return value;
	}

	/**
	 * 
	 * Get a BankNote's currency
	 * 
	 * @return currency of BankNote
	 */
	public String getCurrency() {
		return currency;
	}
	
	public long getSerial(){
		return nextSerialNumber;
	}
	
	public boolean equal(Object arg) {
		if (arg == null)
			return false;
		if (arg.getClass() != this.getClass())
			return false;
		Coin other = (Coin) arg;
		return (other.getValue() == value && other.getCurrency().equalsIgnoreCase(currency));
	}
	
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

