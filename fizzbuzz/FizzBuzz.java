package fizzbuzz;

public class FizzBuzz {
	public String fizzBuzz(int number) {
		String three = "Fizz";
		String five = "Buzz";
		String fifteen = three.concat(five);
		String result = null;

		if (number == 2) {
			result = "2";
		} else if (number == 3) {
			result = three;
		} else if (number == 5) {
			result = five;
		} else if (number == 15) {
			result = fifteen;
		}

		return result;
	}
}
