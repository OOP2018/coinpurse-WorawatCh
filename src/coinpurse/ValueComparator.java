package coinpurse;

import java.util.Comparator;

public class ValueComparator implements Comparator<Valuable> {
	/**
	 * Compare two objects that implement Valuable. First compare them by
	 * currency, so that "Baht" < "Dollar". If both objects have the same
	 * currency, order them by value.
	 */
	@Override
	public int compare(Valuable a, Valuable b) {
		if (a.getCurrency().compareToIgnoreCase(b.getCurrency()) == 0) {
			if (a.getValue() > b.getValue()) {
				return 1;
			} else if (a.getValue() < b.getValue()) {
				return -1;
			} else {
				return 0;
			}
		}
		return a.getCurrency().compareToIgnoreCase(b.getCurrency());
	}
}
