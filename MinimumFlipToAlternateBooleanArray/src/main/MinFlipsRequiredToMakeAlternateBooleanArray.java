package main;

public class MinFlipsRequiredToMakeAlternateBooleanArray {

	public static int calculate(boolean[] entry) {
		if(entry == null)
			return -1;
		// entry is empty then we need not flip any bit. 
		// 
		boolean even = true;
		int evenOn = 0;
		int oddOn  = 0;
		
		for(boolean b : entry) {
			if(b) {
				if(even)
					evenOn++;
				else
					oddOn++;
			}
			even = !even;
		}
		int evenBlocks = 0;
		int oddBlocks  = 0;
		if(entry.length%2 == 0) {
			evenBlocks = oddBlocks = entry.length / 2;
		} else {
			evenBlocks = (entry.length / 2) + 1;
			oddBlocks  = (entry.length / 2);
		}
		
		// to turn on alternate even bytes;
		// we need to turn on remaining even bytes and turn off all true odd bytes
		int evenCalc = oddOn + (evenBlocks - evenOn);
		// to turn on alternate odd bytes; We need to turn off on even location. 
		// and wee need to turn on remaining off odd bytes.
		int oddCalc  = evenOn + (oddBlocks - oddOn);
		
		return evenCalc < oddCalc ? evenCalc : oddCalc;
	}

}
