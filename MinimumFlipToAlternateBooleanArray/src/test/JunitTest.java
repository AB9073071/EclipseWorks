package test;

import static org.junit.Assert.*;

import org.junit.Test;

import main.MinFlipsRequiredToMakeAlternateBooleanArray;

public class JunitTest {

	@Test
	public void test() {
		boolean [] entry = {true, false, false, true};
		int res = MinFlipsRequiredToMakeAlternateBooleanArray.calculate(entry);
	}

}
