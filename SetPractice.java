package nine;

import java.util.HashSet;
import java.util.Set;

public class SetPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<Integer> numberset = new HashSet<Integer>();

		numberset.add(12);
		numberset.add(3);
		numberset.add(1);
		numberset.add(6);
		numberset.add(5);
		System.out.println(numberset);
		System.out.println(numberset.remove(3));
		System.out.println(numberset);

		System.out.println("is 4 there ?" + numberset.contains(4));
		System.out.println("Final numberset:" + numberset);
		System.out.println("The size of this set is:" + numberset.size());

	}
}
