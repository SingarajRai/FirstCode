package collectionsPractice;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IteratorClassWork {
	public static void main(String[] args) {

		Set<Integer> Ramu = new HashSet<Integer>();
		Ramu.add(201);
		Ramu.add(205);
		Ramu.add(203);
		Ramu.add(2012);
		Ramu.add(207);
		Ramu.add(208);
		Ramu.add(2012);
		Iterator<Integer> suja = Ramu.iterator();
		while (suja.hasNext()) {
			Integer x = suja.next();
			// System.out.println(x);  // i have blocked this print to see the next print of Y

		}

		for (Integer Y : Ramu) {

			System.out.println(Y);
		}

	}

}
