package coinpurse;

/**
 * A singleton factory class of money.
 * 
 * @author Worawat Chueajedton
 *
 */

public abstract class MoneyFactory {

	private static MoneyFactory factory = null;

	/**
	 * get an instance of MoneyFactory. This method returns an object of a
	 * subclass (such as ThaiMoneyFactor). The instance is a Singleton -- it
	 * always returns the same object.
	 * 
	 * @return object of a subclass ex.ThaiMoneyFactory
	 */
	public static MoneyFactory getInstance() {
		return factory;
	}

	/**
	 * create new money object in the local currency. If the value is not a
	 * valid currency amount, then throw IllegalArgumentException.
	 * 
	 * @param value
	 *            value of coin of banknote that want to create
	 */
	public abstract Valuable createMoney(double value);

	/**
	 * accepts money value as a String,this method converts parameter to a
	 * double and calls createMoney(double).
	 * 
	 * @param value
	 *            value of coin of banknote that want to create in String
	 * @return
	 */
	public Valuable createMoney(String value) {
		double trueValue = Double.parseDouble(value);
		return createMoney(trueValue);
	}

	/**
	 * To set what country you want to create money.
	 * 
	 * @param mf
	 *         object of selected country
	 */
	public static void setMoneyFactory(MoneyFactory mf) {
		factory = mf;
	}
}
