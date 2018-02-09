package coinpurse;

/**
 * A bank note money with value and currency
 * 
 * @author Worawat Chueajedton
 *
 */
public class BankNote extends Money {

	private static long nextSerialNumber = 1000000;
	private long serialNumber;

	/**
	 * Create bank note with value and currency
	 * 
	 * @param value
	 *            is value of money
	 * @param currency
	 *            is currency of money
	 */
	public BankNote(double value, String currency) {
		super(value, currency);
		this.serialNumber = nextSerialNumber++;
	}

	/**
	 * To get serial number of bank note
	 * 
	 * @return serial number of bank note
	 */
	public long getSerial() {
		return serialNumber;
	}

	/**
	 * 
	 * Show description of bank note
	 * 
	 * @return bank note's description
	 * 
	 */
	public String toString() {
		return getValue() + " - " + getValue() + " note [" + getSerial() + "]";
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

	public static void main(String[] args) {
		BankNote n = new BankNote(20, "Bath");
		BankNote n1 = new BankNote(20, "Bath");
		System.out.println(n.getSerial());
		System.out.println(n1.getSerial());
	}
}
