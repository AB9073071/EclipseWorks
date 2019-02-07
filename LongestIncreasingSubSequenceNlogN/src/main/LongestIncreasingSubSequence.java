package main;

import java.util.ArrayList;
import java.util.List;

public class LongestIncreasingSubSequence {
	public static List<Integer> getLongestIncreasingSubSeq(List<Integer> entrySet) {
		if(entrySet == null || entrySet.size() == 0)
			return null;
		// sorted array of elements
		int [] runningArray = new int [entrySet.size()];
		// keeps track of the path from which current element is reached.
		int [] rootOf        = new int [entrySet.size()];
		
		//int size = 0;
		
		runningArray[0] = 0;
		for(int i=0;i<rootOf.length;i++) {
			rootOf[i] = -1;;
		}
		// size of the current longest increasing subarray
		// 
		int len = 0;
		for(int i=1; i<entrySet.size(); i++) {
			int curr = entrySet.get(i);
			// if the current element is smaller than the current small element then 
			// replace the current small element with curr
			sopln(runningArray);
			sopln(rootOf);
			sopln(curr + " <-- " + i);
			if(entrySet.get(runningArray[0])>curr) {
				sopln("one");
				runningArray[0] = i;
			}
			// else if current element is bigger than the current big element then 
			// increase the length and append the element to the running array.
			// update the track array at index i with 
			else if(entrySet.get(runningArray[len]) < curr) {
				sopln("two");
				len++;
				runningArray[len] = i;
				rootOf [i] = runningArray[len - 1];
			} 
			// current element is in between the small and big. does not add to the length.
			// find the ceiling for the current element and replace the ceiling element with
			// current element.
			else {
				sopln("three");
				int ceiling = findCeiling(runningArray, len, entrySet.get(i), entrySet);
				runningArray[ceiling] = i; 
				rootOf [i] = runningArray[ceiling-1];
			}
			sopln(runningArray);
			sopln(rootOf);
			sopln("");
		}
		ArrayList<Integer> result = new ArrayList<Integer>();
		int nextElementIndex = runningArray[len];
		result.add(entrySet.get(runningArray[len]));
		while (rootOf[nextElementIndex] != -1) {
			result.add(0, entrySet.get(rootOf[nextElementIndex]));
			nextElementIndex = rootOf[nextElementIndex];
		}
		return result;
	}
	private static void sopln(int[] arr) {
		for(int i : arr) {
			System.out.print(i + "  ");
		}
		sopln("");
		
	}
	private static void sopln(String curr) {
		System.out.println(curr);
	}
	/**
	 * finds the index of the element from sorted array runningArray
	 * which is bigger than element at entrySet.get(i).
	 * @param runningArray - sorted array
	 * @param len          - length of the sorted array
	 * @param entrySet
	 * @param i
	 * @return
	 */
	public static int findCeiling(int[] runningArray, int len, int element, List<Integer> entrySet) {
		//int element = entrySet.get(i);
		int start = 0;
		int end   = len-1;
		while(start<=end) {
			int mid = (end + start)/2;
			int curr = entrySet.get(runningArray[mid]);
			if(curr == element) {
				return mid;
			} else if(curr < element) {
				start = mid+1;
			} else if(curr > element) {
				end   = mid-1;
			}
		}
		//if(start >= len) 
		//	start = len - 1;
		return start;
	}
}
