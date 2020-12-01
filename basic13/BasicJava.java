package basic13;

import java.util.ArrayList;

public class BasicJava {
	void oneTo255() {
		for (int i = 1; i < 256; i++) {
			System.out.println(i);
		}
	}

	void odd() {
		for (int i = 1; i < 256; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}
	}

	void sum() {
		int sum = 0;

		for (int i = 0; i < 256; i++) {
			sum += i;
			System.out.println("New number: " + i + " Sum: " + sum);
		}
	}

	void iterateArray(int[] arr) {
		for (int num : arr) {
			System.out.println(num);
		}
	}

	Integer findHigh(int[] arr) {
		int max = arr[0];
		for (int num : arr) {
			if (num > max) {
				max = num;
			}
		}
		return max;
	}

	Integer findAvg(int[] arr) {
		int avg = 0;
		int len = arr.length;
		for (int num : arr) {
			avg += num;
		}
		avg /= len;
		return avg;
	}

	ArrayList<Integer> oddArray() {
		ArrayList<Integer> newArr = new ArrayList<Integer>();

		for (int i = 1; i < 256; i++) {
			if (i % 2 != 0) {
				newArr.add(i);
			}
		}
		return newArr;
	}

	ArrayList<Integer> gtArray(int[] arr, int gt) {
		ArrayList<Integer> newArr = new ArrayList<Integer>();

		for (int num : arr) {
			if (num > gt) {
				newArr.add(num);
			}
		}
		return newArr;
	}

	ArrayList<Integer> sqArray(int[] arr) {
		ArrayList<Integer> newArr = new ArrayList<Integer>();

		for (int num : arr) {
			newArr.add(num * num);
		}
		return newArr;
	}

	ArrayList<Integer> positiveArray(int[] arr) {
		ArrayList<Integer> newArr = new ArrayList<Integer>();

		for (int num : arr) {
			if (num > 0) {
				newArr.add(num);
			}
		}
		return newArr;
	}

	ArrayList<Integer> statArray(int[] arr) {
		ArrayList<Integer> newArr = new ArrayList<Integer>();
		int max = arr[0];
		int min = arr[0];
		int avg = 0;
		int len = arr.length;

		for (int num : arr) {
			avg += num;
			if (num > max) {
				max = num;
			}
			if (num < min) {
				min = num;
			}
		}
		avg /= len;
		newArr.add(max);
		newArr.add(min);
		newArr.add(avg);
		return newArr;
	}

	ArrayList<Integer> shiftArray(int[] arr) {
		ArrayList<Integer> newArr = new ArrayList<Integer>();
		ArrayList<Integer> finalArr = new ArrayList<Integer>();

		int len = arr.length;

		for (int i = len - 1; i > 0; i--) {
			newArr.add(arr[i]);
		}

		for (int i = len - 2; i >= 0; i--) {
			int temp = newArr.get(i);
			finalArr.add(temp);
		}
		finalArr.add(0);

		return finalArr;
	}

}