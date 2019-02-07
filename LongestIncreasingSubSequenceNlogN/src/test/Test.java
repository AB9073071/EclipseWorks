package test;

import java.util.ArrayList;
import java.util.List;

import main.LongestIncreasingSubSequence;

public class Test {

	public static void main(String[] args) {
//		int [] arr = {0, 3, 6, 8, 10};
//		int element = 4;
//		int ceiling = LongestIncreasingSubSequence.findCeiling(arr, arr.length, element);
//		sopln("--> " + element + "  ceiling  " + ceiling + " ceiling element " + arr[ceiling]);
//		element = 9;
//		ceiling = LongestIncreasingSubSequence.findCeiling(arr, arr.length, element);
//		sopln("--> " + element + "  ceiling  " + ceiling + " ceiling element " + arr[ceiling]);
//		element = -1;
//		ceiling = LongestIncreasingSubSequence.findCeiling(arr, arr.length, element);
//		sopln("--> " + element + "  ceiling  " + ceiling + " ceiling element " + arr[ceiling]);
//		element = 0;
//		ceiling = LongestIncreasingSubSequence.findCeiling(arr, arr.length, element);
//		sopln("--> " + element + "  ceiling  " + ceiling + " ceiling element " + arr[ceiling]);
//		element = 11;
//		ceiling = LongestIncreasingSubSequence.findCeiling(arr, arr.length, element);
//		if(ceiling >= arr.length)
//			sopln("no ceiling found for " + element);
//		else
//			sopln("--> " + element + "  ceiling  " + ceiling + " ceiling element " + arr[ceiling]);
//		element = 2;
//		ceiling = LongestIncreasingSubSequence.findCeiling(arr, arr.length, element);
//		sopln("--> " + element + "  ceiling  " + ceiling + " ceiling element " + arr[ceiling]);
//		element = 7;
//		ceiling = LongestIncreasingSubSequence.findCeiling(arr, arr.length, element);
//		sopln("--> " + element + "  ceiling  " + ceiling + " ceiling element " + arr[ceiling]);
//		element = 5;
//		ceiling = LongestIncreasingSubSequence.findCeiling(arr, 2, element);
//		if(ceiling >= 2)
//			sopln("no ceiling found for length 2 for element 5");
//		else
//			sopln("--> " + element + "  ceiling  " + ceiling + " ceiling element " + arr[ceiling]);
//		
		int [] arr2 = {0,5,2,4,7,5,9,6};
		
		ArrayList<Integer> intg = new ArrayList<Integer> ();
		intg.add(0); intg.add(5); intg.add(2);intg.add(4);intg.add(7);intg.add(5);intg.add(9);intg.add(6);
		sopln(LongestIncreasingSubSequence.getLongestIncreasingSubSeq(intg));
		
	}

	private static void sopln(List<Integer> ll) {
		for(int i : ll) 
			System.out.print(i + "  ");
		
		System.out.println("");
	}

	private static void sopln(String string) {
		System.out.println(string);
	}

}
