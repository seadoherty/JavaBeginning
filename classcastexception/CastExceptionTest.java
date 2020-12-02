package classcastexception;

import java.util.ArrayList;

public class CastExceptionTest {

	public static void main(String[] args) {
		ArrayList<Object> myList = new ArrayList<Object>();
		myList.add("13");
		myList.add("hello world");
		myList.add(48);
		myList.add("Goodbye World");

		for (int i = 0; i < myList.size(); i++) {
			try {
				Integer castedValue = (Integer) myList.get(i);
				System.out.println(castedValue);
			} catch (ClassCastException e) {
				System.out.println("index: " + i);
				System.out.println("message: " + e.getMessage());
				System.out.println("value of object that triggered: " + myList.get(i));
			}
		}
	}
}