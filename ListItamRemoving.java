package ifcondition;

import java.util.ArrayList;
import java.util.List;

public class ListItamRemoving {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> students = new ArrayList<String>();

		students.add("Kumar");
		students.add("Samir");
		students.add("Rajendra");
		students.add("Bijendra");
		students.add("Sapin");
		students.add("Samjhana");
		students.add("Sajana");
		students.add("Anjila");
		students.add("Anika");
		students.add("Anjana");
		// students.remove(1); // removing the name Samir.
		// System.out.println(students);

		System.out.println("Before removel: " + students);

		students.removeAll(students);
		System.out.println("After removal of all:" + students); // removes all the itam form the list.

	}

}
