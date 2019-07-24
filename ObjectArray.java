package nine;

public class ObjectArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Object[] ObjectArray = { 1, 3.141, "2.5", false, 2.4535f, 23456L, };

		for (int i = 0; i < ObjectArray.length; i++) {
			System.out.println(i);
		}

		for (Object object : ObjectArray) {
			System.out.println(object);

		}

	}

}
