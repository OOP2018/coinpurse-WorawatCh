package coinpurse;

public class ThaiMoneyFactory extends MoneyFactory {
	static long nextSerialNumber = 1000000;

	@Override
	public Valuable createMoney(double value) {
		if (value == 1 || value == 2 || value == 5 || value == 10) {
			return new Coin(value);
		} else if (value == 20 || value == 50 || value == 100 || value == 500 || value == 1000) {
			return BankNote(value, nextSerialNumber);
		}
		throw new IllegalArgumentException;
	}
}
