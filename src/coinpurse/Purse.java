package coinpurse;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
//TODO import List, ArrayList, and Collections
// You will use Collections.sort() to sort the coins

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
	private double total =0;
 
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
		for(Coin coins : money){
			 total+=coins.getValue();
		}
		return total;
	} 

	/**
	 * Return the capacity of the coin purse.
	 * 
	 * @return the capacity
	 */
	public int getCapacity() {
		return capacity;
	}

	/**
	 * Test whether the purse is full. The purse is full if number of items in
	 * purse equals or greater than the purse capacity.
	 * 
	 * @return true if purse is full.
	 */
	public boolean isFull() {
		if(count() == capacity) return true;
		else if (count() < capacity) return false;
		else if (count() > capacity) return false;
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
		if(isFull() == false){
			money.add(coin);
			return true;
		} else if(coin.getValue() < 0){
			return false;
		}
		return false;
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
          Collections.sort(money);
          List<Coin> tempList = new ArrayList<Coin>();
          for(Coin c : money){
        	  if(money.indexOf(c) < amount){
        		  tempList.add(c);
        		  amount = amount - money.indexOf(c);
        	  } else if(amount > getBalance()){
        		  return null;
        	  } else if(amount < 0){
        		  return null;
        	  }
          }
           
		/*
		 * See lab sheet for outline of a solution, or devise your own solution.
		 * The idea is to be greedy. Try to withdraw the largest coins possible.
		 * Each time you choose a coin as a candidate for withdraw, add it to a
		 * temporary list and decrease the amount (remainder) to withdraw.
		 * 
		 * If you reach a point where amountNeededToWithdraw == 0 then you found
		 * a solution! Now, use the temporary list to remove coins from the
		 * money list, and return the temporary list (as an array).
		 */

		// Did we get the full amount?
		// This code assumes you decrease amount each time you remove a coin.
		// Your code might use some other variable for the remaining amount to
		// withdraw.
        	  Coin [] array = new Coin[ tempList.size() ]; // create the array
        	  tempList.toArray(array); 
		return array;
	}

	/**
	 * toString returns a string description of the purse contents. It can
	 * return whatever is a useful description.
	 */
	public String toString() {
		return "We have "+count()+" coins with value "+getBalance() ;
	}

	public static void main(String[] args) {
		Purse purse = new Purse( 3 );
//		System.out.println(purse.getBalance( ));
//		System.out.println(purse.isFull( ));
		purse.insert(new Coin(5,"THB"));
		purse.insert(new Coin(10,"THB"));
		purse.insert(new Coin(0,"THB"));
		purse.insert(new Coin(1,"THB"));
		purse.insert(new Coin(5,"THB"));
		System.out.println(purse.count());
//		System.out.println(purse.isFull());
		System.out.println(purse.getBalance());
		System.out.println(purse.toString());
		purse.withdraw(12);
		purse.withdraw(11);
	}
}
