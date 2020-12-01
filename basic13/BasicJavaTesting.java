package basic13;

import java.util.ArrayList;

public class BasicJavaTesting {
	public static void main(String[] args) {
		BasicJava result = new BasicJava();
//		#1
//		result.oneTo255();
//		#2
//		result.odd();
//		#3
//		result.sum();
//		#4
//		int [] myArr = {1,3,5,7,9,13};
//		result.iterateArray(myArr);
//		#5
//		int[] highArr = { -7, -9, -5, -13 };
//		int high = result.findHigh(highArr);
//		System.out.println(high);
//		#6
//		int[] avgArr = { 7, 13, 13 };
//		int avg = result.findAvg(avgArr);
//		System.out.println(avg);
//		#7
//		ArrayList<Integer> odd = result.oddArray();
//		System.out.println(odd);
//		#8
//		int[] gtArr = { 4, 5, 9, 7, 13, 23 };
//		ArrayList<Integer> gt = result.gtArray(gtArr, 8);
//		System.out.println(gt);
//		#9
//		int[] sqArr = { 4, -5, 9, 7, 13, 23 };
//		ArrayList<Integer> sq = result.sqArray(sqArr);
//		System.out.println(sq);
//		#10
//		int[] posArr = { -4, -5, 9, 7, -13, 23 };
//		ArrayList<Integer> pos = result.positiveArray(posArr);
//		System.out.println(pos);
//		#11
//		int[] statArr = { -4, -5, 9, 7, -13, 28 };
//		ArrayList<Integer> stat = result.statArray(statArr);
//		System.out.println(stat);
//		#12
		int[] shiftArr = { -4, -5, 9, 7, -13, 28 };
		ArrayList<Integer> stat = result.shiftArray(shiftArr);
		System.out.println(stat);
	}
}