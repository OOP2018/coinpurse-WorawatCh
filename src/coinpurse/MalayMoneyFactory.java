package coinpurse;

/**
 * Create Malaysia coin and banknote.
 * 
 * @author Worawat Chueajedton
 * 
 */

public class MalayMoneyFactory extends MoneyFactory {
	static long nextSerialNumber = 1000000;
	private Valuable valuable;
	private String subMalayCurrency = "Sen";
	private String MalayCurrency = "Ringgit";

	/**
	 * Create coin and banknote.
	 * 
	 */
	@Override
	public Valuable createMoney(double value) {
		if (value < 1) {
			return valuable = new Coin(value,"Sen");
		} else if (value == 1 || value == 2 || value == 5 || value == 10 || value == 20 || value ==50 || value == 100) {
			return valuable = new BankNote(value,MalayCurrency, nextSerialNumber++);
		}
		throw new IllegalArgumentException("Sorry "+value+" is not valid");
	}
}
