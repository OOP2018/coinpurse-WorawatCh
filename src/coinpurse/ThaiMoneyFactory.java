package coinpurse;

public class ThaiMoneyFactory extends MoneyFactory {
	static long nextSerialNumber = 1000000;
	private Valuable valuable;
	private String subThaiCurrency = "Satang";
	private String thaiCurrency = "Bath";

	@Override
	public Valuable createMoney(double value) {
		if(value < 1){
			return valuable = new Coin(value,subThaiCurrency);
		}else if (value == 1 || value == 2 || value == 5 || value == 10) {
			return valuable = new Coin(value,thaiCurrency);
		} else if (value == 20 || value == 50 || value == 100 || value == 500 || value == 1000) {
			return valuable = new BankNote(value,thaiCurrency,nextSerialNumber++);
		}
		throw new IllegalArgumentException();
	}
}
