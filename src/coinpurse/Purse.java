package coinpurse;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * A coin purse contains coins. You can insert coins, withdraw money, check the
 * balance, and check if the purse is full.
 * 
 * @author Worawat Chueajedton
 */
public class Purse {
	/** Collection of objects in the purse. */
	// TODO declare a List of Coins named "money".
	private List<Coin> money = new ArrayList<Coin>();
	/**
	 * Capacity is maximum number of items the purse can hold. Capacity is set
	 * when the purse is created and cannot be changed.
	 */
	private final int capacity;

	/**
	 * Create a purse with a specified capacity.
	 * 
	 * @param capacity
	 *            is maximum number of coins you can put in purse.
	 */
	public Purse(int capacity) {
		this.capacity = capacity;
	}

	/**
	 * Count and return the number of coins in the purse. This is the number of
	 * coins, not their value.
	 * 
	 * @return the number of coins in the purse
	 */
	public int count() {
		return money.size();
	}

	/**
	 * Get the total value of all items in the purse.
	 * 
	 * @return the total value of items in the purse.
	 */
	public double getBalance() {
		double total = 0;
		for (Coin coins : money) {
			total += coins.getValue();
		}
		return total;
	}

	/**
	 * Return the capacity of the coin purse.
	 * 
	 * @return the capacity
	 */
	public int getCapacity() {
		return this.capacity;
	}

	/**
	 * Test whether the purse is full. The purse is full if number of items in
	 * purse equals or greater than the purse capacity.
	 * 
	 * @return true if purse is full.
	 */
	public boolean isFull() {
		if (count() == capacity)
			return true;
		return false;
	}

	/**
	 * Insert a coin into the purse. The coin is only inserted if the purse has
	 * space for it and the coin has positive value. No worthless coins!
	 * 
	 * @param coin
	 *            is a Coin object to insert into purse
	 * @return true if coin inserted, false if can't insert
	 */
	public boolean insert(Coin coin) {
		if (isFull()) {
			return false;
		} else if (coin.getValue() <= 0) {
			return false;
		} else {
			money.add(coin);
			return true;
		}
	}

	/**
	 * Withdraw the requested amount of money. Return an array of Coins
	 * withdrawn from purse, or return null if cannot withdraw the amount
	 * requested.
	 * 
	 * @param amount
	 *            is the amount to withdraw
	 * @return array of Coin objects for money withdrawn, or null if cannot
	 *         withdraw requested amount.
	 */
	public Coin[] withdraw(double amount) {
		MoneyUtil.sortCoins(this.money);
		List<Coin> tempList = new ArrayList<Coin>();
		if(this.getBalance() == 0.00){
			return null;
		}
		if (amount != 0) {
			if (amount <= this.getBalance()) {
				for (int i = 0; i < money.size(); i++) {
					if (money.get(i).getValue() <= amount) {
						tempList.add(money.get(i));
						amount -= money.get(i).getValue();
					}
				}
			}
			if (amount == 0) {
				for (Coin c1 : tempList) {
					money.remove(c1);
				}
			}
			Coin[] array = new Coin[tempList.size()]; // create the array
			tempList.toArray(array);
			return array;
		}
		return null;
	}

	/**
	 * toString returns a string description of the purse contents. It can
	 * return whatever is a useful description.
	 */
	public String toString() {
		return "We have " + count() + " coins with value " + getBalance();
	}

	public static void main(String[] args) {
		Purse purse = new Purse(3);
		// System.out.println(purse.getBalance( ));
		// System.out.println(purse.isFull( ));
		purse.insert(new Coin(5, "THB"));
		purse.insert(new Coin(10, "THB"));
		purse.insert(new Coin(0, "THB"));
		purse.insert(new Coin(1, "THB"));
		purse.insert(new Coin(5, "THB"));
		// System.out.println(purse.count());
		// System.out.println(purse.isFull());
		// System.out.println(purse.getBalance());
		System.out.println(purse.toString());
		purse.withdraw(12);
		// purse.withdraw(11);
		System.out.println(purse.toString());
	}
}
