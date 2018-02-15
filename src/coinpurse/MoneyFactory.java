package coinpurse;

public abstract class MoneyFactory {

	private static MoneyFactory factory = null;

	public static MoneyFactory getInstance() {
		if (factory == null) {
           factory = new ThaiMoneyFactory();
		}
		return factory;
	}

	public abstract Valuable createMoney(double value);

	public Valuable createMoney(String value) {
		double trueValue = Double.parseDouble(value);
		return createMoney(trueValue);
	}
}
