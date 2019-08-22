package tests;

import general.Budget;
import general.TaxCalculator;
import interfaces.Tax;
import tax.ICMS;
import tax.ISS;

public class TaxTests {

	
	public static void main(String[] args) {
		Tax iss = new ISS();
		Tax icms = new ICMS();
		
		Budget budget = new Budget(500.0);
		
		TaxCalculator calc = new TaxCalculator();
		
		calc.makeCalc(budget, iss);
		calc.makeCalc(budget, icms);
	}
}
