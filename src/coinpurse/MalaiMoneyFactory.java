package coinpurse;

public class MalaiMoneyFactory extends MoneyFactory {
	static long nextSerialNumber = 1000000;

	@Override
	public Valuable createMoney(double value) {
		if (value < 1) {
			return new Coin(value);
		} else if (value == 1 || value == 2 || value == 5 || value == 10 || value == 20 || value ==50 || value == 100) {
			return BankNote(value, nextSerialNumber);
		}
		throw new IllegalArgumentException;
	}
}
