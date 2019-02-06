package main;
/**
 * 
 */
import java.util.List;

public class LongestIncreasingSubSeq {
	public static List<Integer> getLongestIncreasingSubSeq(List<Integer> entrySet) {
		if(entrySet == null || entrySet.size() == 0)
			return null;
		
		int [] runningArray = new int [entrySet.size()];
		int [] track        = new int [entrySet.size()];
		
		int size = 0;
		
		runningArray[0] = 0;
		for(int i=0;i<track.length;i++) {
			track[i] = -1;
		}
		int len = 0;
		for(int i=1; i<entrySet.size(); i++) {
			int curr = entrySet.get(i);
			// if the current element is smaller than the current small element then 
			// replace the current small element with curr
			if(entrySet.get(runningArray[0])>curr) {
				runningArray[0] = i;
			}
			// else if current element is bigger than the current big element then 
			// increase the length and append the element to the running array.
			// update the track array at index i with 
			else if(entrySet.get(len) < curr) {
				len++;
				runningArray[len] = i;
				track [i] = runningArray[len - 1];
			} 
			// current element is in between the small and big. does not add to the length
			// find the ceiling for the current element and replace the ceiling element with
			// current element.
			else {
				
			}
		}
		return null;
	}
}
