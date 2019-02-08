package test;

import static org.junit.Assert.*;

import org.junit.Test;

import main.MinFlipsRequiredToMakeAlternateBooleanArray;

public class AlternateBooleanArrayTest {

	@Test
	public void test() {
		boolean [] entry = {false, true, false, true, true};
		int res = MinFlipsRequiredToMakeAlternateBooleanArray.calculate(entry);
		sopln(res + "");
		
	}

	private void sopln(String string) {
		System.out.println(string);
	}

}
