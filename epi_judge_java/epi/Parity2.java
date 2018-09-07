package epi;

import epi.test_framework.EpiTest;
import epi.test_framework.GenericTest;

public class Parity2 {
	@EpiTest(testDataFile = "parity.tsv")
	public static short parity(long x) {
		short count = 0;
		while (x != 0) {
			count ^= 1;
			x = x & (x - 1);
		}

		return count;
	}

	public static void main(String[] args) {
		System.exit(GenericTest.runFromAnnotations(args, "Parity2.java", new Object() {
		}.getClass().getEnclosingClass()).ordinal());
	}
}
