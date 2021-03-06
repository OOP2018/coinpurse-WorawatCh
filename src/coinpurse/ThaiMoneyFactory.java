package coinpurse;

/**
 * Create Thailand coin and banknote.
 * 
 * @author Worawat Chueajedton
 * 
 */

public class ThaiMoneyFactory extends MoneyFactory {
	static long nextSerialNumber = 1000000;
	private Valuable valuable;
	private String thaiCurrency = "Bath";

	/**
	 * Create coin and banknote.
	 * 
	 */
	@Override
	public Valuable createMoney(double value) {
		if (value < 1) {
			return valuable = new Coin(value, "Satang");
		} else if (value == 1 || value == 2 || value == 5 || value == 10) {
			return valuable = new Coin(value, thaiCurrency);
		} else if (value == 20 || value == 50 || value == 100 || value == 500 || value == 1000) {
			return valuable = new BankNote(value, thaiCurrency, nextSerialNumber++);
		}
		throw new IllegalArgumentException("Sorry "+value+" is not valid");
	}
}
