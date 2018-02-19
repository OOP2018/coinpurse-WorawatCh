package coinpurse;

public abstract class MoneyFactory {

	private static MoneyFactory factory = null ;

	public static MoneyFactory getInstance() {
		return factory; 
	}

	public abstract Valuable createMoney(double value);

	public Valuable createMoney(String value) {
		double trueValue = Double.parseDouble(value);
		return createMoney(trueValue);
	}
	
	public static void setMoneyFactory(MoneyFactory mf){
		   factory = mf;
	}
}
