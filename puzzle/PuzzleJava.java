package puzzle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class PuzzleJava {
	ArrayList<Integer> highNums(int[] arr) {
		ArrayList<Integer> numberArr = new ArrayList<Integer>();
		int sum = 0;

		for (int num : arr) {
			sum += num;
			if (num > 10) {
				numberArr.add(num);
			}
		}
		System.out.println(sum);
		return numberArr;
	}

	ArrayList<String> randomNames(ArrayList<String> arr) {
		ArrayList<String> newArr = new ArrayList<String>();
		Collections.shuffle(arr);
		System.out.println(arr);

		for (String num : arr) {
			if (num.length() > 5) {
				newArr.add(num);
			}
		}
		return newArr;
	}

	void alphabet(ArrayList<String> arr) {
		Collections.shuffle(arr);
		String first = arr.get(0);
		int size = arr.size();
		String last = arr.get(size - 1);

		if (first.toString().matches(".*\\b(a|e|i|o|u)\\b.*")) {
			System.out.println("First vowel message!" + " Last: " + last);
		} else {
			System.out.println("First: " + first + " Last: " + last);
		}
	}

	ArrayList<Integer> randNums() {
		ArrayList<Integer> newArr = new ArrayList<Integer>();
		Random r = new Random();

		for (int i = 0; i < 10; i++) {
			int randNum = r.nextInt(45);
			newArr.add(randNum + 55);
		}
		return newArr;
	}

	void randSorted() {
		ArrayList<Integer> newArr = randNums();
		Collections.sort(newArr);
		System.out.println("min: " + newArr.get(0));
		System.out.println("max: " + newArr.get(newArr.size() - 1));
		System.out.println(newArr);
	}

	void randLetters() {
		Random r = new Random();
		String newString = "";

		for (int i = 0; i < 5; i++) {
			char c = (char) (r.nextInt('z' - 'a') + 'a');
			newString += c;
		}
		System.out.println(newString);
	}

	void randArrLetters() {
		ArrayList<String> newArr = new ArrayList<String>();
		Random r = new Random();

		for (int j = 0; j < 10; j++) {
			String newString = "";
			for (int i = 0; i < 5; i++) {				
				char c = (char) (r.nextInt('z' - 'a') + 'a');
				newString += c;
			}
			newArr.add(newString);
			newString = "";
		}
		System.out.println(newArr);

	}

}