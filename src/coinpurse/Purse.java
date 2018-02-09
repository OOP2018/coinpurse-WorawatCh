package coinpurse;

import java.util.ArrayList;
import java.util.List;

/**
 * A coin purse contains coins. You can insert coins, withdraw money, check the
 * balance, and check if the purse is full.
 * 
 * @author Worawat Chueajedton
 */
public class Purse {
	/** Collection of objects in the purse. */
	private List<Valuable> money = new ArrayList<Valuable>();
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
		for (Valuable values : money) {
			total += values.getValue();
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
	 * @param valuable
	 *            is a Coin object to insert into purse
	 * @return true if coin inserted, false if can't insert
	 */
	public boolean insert(Valuable valuable) {
		if (isFull()) {
			return false;
		} else if (valuable.getValue() <= 0) {
			return false;
		} else {
			money.add(valuable);
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
	public Valuable[] withdraw(double amount) {
		MoneyUtil.sortCoins(money);
		List<Valuable> tempList = new ArrayList<Valuable>();
		if (this.getBalance() == 0.00) {
			return null;
		}
		if (amount < 0) {
			return null;
		}
		if (amount <= this.getBalance()) {
			for (Valuable m : money) {
				if (m.getValue() <= amount) {
					tempList.add(m);
					amount -= m.getValue();
				}
			}
			if (amount != 0) {
				return null;
			}

			for (Valuable c1 : tempList) {
				money.remove(c1);
			}
			Valuable[] array = new Valuable[tempList.size()];
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

}
