package coinpurse;

public class MoneyFactoryDemo {

	/**
	 * To test Money factory
	 * @param args
	 */
	public static void main(String[] args) {
	MoneyFactory.setMoneyFactory(new ThaiMoneyFactory());
		MoneyFactory money = MoneyFactory.getInstance();
		MoneyFactory money1 = MoneyFactory.getInstance();
		System.out.println(money.equals(money1));
		Purse purse = new Purse(3);
		purse.insert(money.createMoney(10.0));
		purse.insert(money.createMoney(20));
		purse.insert(money.createMoney(100));
		System.out.println(purse.getBalance());
		System.out.println("-----------------------------------");
		MoneyFactory.setMoneyFactory(new MalayMoneyFactory());
		MoneyFactory money2 = MoneyFactory.getInstance();
		MoneyFactory money3 = MoneyFactory.getInstance();
		System.out.println(money2.equals(money3));
		Purse purse1 = new Purse(3);
		purse.insert(money2.createMoney(10));
		purse.insert(money2.createMoney(20));
		purse.insert(money3.createMoney(100));
		System.out.println(purse1.getBalance());
		Valuable v = money.createMoney(0.5);
		System.out.println(v.toString());

	}
}
