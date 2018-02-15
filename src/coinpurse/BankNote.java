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

//	public static void main(String[] args) {
//		BankNote n = new BankNote(20, "Bath");
//		BankNote n1 = new BankNote(50, "Bath");
//		// System.out.println(n.getSerial());
//		// System.out.println(n1.getSerial());
//		Purse purse = new Purse(3);
//		purse.insert(n);
//		purse.insert(n1);
//		// System.out.println(purse.getBalance());
//		BankNote n2 = new BankNote(100, "Bath");
//		BankNote n3 = new BankNote(20, "Bath");
//		purse.insert(n2);
//		// System.out.println(purse.getBalance());
//		purse.insert(n3);
//		// Should be same value because it can't insert
//		 System.out.println(purse.getBalance());
//		purse.withdraw(15);
//		// Can't withdraw because it doesn't have any coin
//		System.out.println("Must be 170 : "+purse.getBalance());
//		purse.withdraw(100);
//		System.out.println("Must be 70 : "+purse.getBalance());

//	}
}
