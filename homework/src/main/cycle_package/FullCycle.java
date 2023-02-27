package cycle_package;

public class FullCycle {

	int firstCounter;
	int secondCounter;

	//print first cycle
	public void fullCycle(int oneSizeCycle, int twoSizeCycle, String printFirstSymbol, String printThirdSymbol) {

		for (int firstCounter = 0; firstCounter < oneSizeCycle; firstCounter++, System.out.println()) {
			for (int secondCounter = 0; secondCounter < twoSizeCycle; secondCounter++) {
				System.out.print(printFirstSymbol + printThirdSymbol);
			}
		}
	}
}
