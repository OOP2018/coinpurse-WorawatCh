package coinpurse;

public class MalaiMoneyFactory extends MoneyFactory {
	static long nextSerialNumber = 1000000;
	private Valuable valuable;
	private String subMalayCurrency = "Sen";
	private String MalayCurrency = "Ringgit";

	@Override
	public Valuable createMoney(double value) {
		if (value < 1) {
			return valuable = new Coin(value,subMalayCurrency);
		} else if (value == 1 || value == 2 || value == 5 || value == 10 || value == 20 || value ==50 || value == 100) {
			return valuable = new BankNote(value,MalayCurrency, nextSerialNumber++);
		}
		throw new IllegalArgumentException();
	}
}
