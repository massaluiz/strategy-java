package general;

import interfaces.Tax;

public class TaxCalculator {

	public void makeCalc(Budget budget, Tax tax) {
		double calc = tax.calc(budget);
		System.out.println(calc);
	}
}
