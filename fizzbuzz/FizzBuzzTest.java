package fizzbuzz;

public class FizzBuzzTest {
    public static void main(String[] args) {
    	FizzBuzz answer = new FizzBuzz();
    	String testTwo = answer.fizzBuzz(2);
    	String testThree = answer.fizzBuzz(3);
    	String testFive = answer.fizzBuzz(5);
    	String testFifteen = answer.fizzBuzz(15);
    	
    	System.out.println("Testing two: " + testTwo);
    	System.out.println("Testing three: " + testThree);
    	System.out.println("Testing five: " + testFive);
    	System.out.println("Testing fifteen: " + testFifteen);
    }
}