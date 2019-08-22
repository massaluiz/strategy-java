package general;

import interfaces.Tax;

/**
 * TaxCalculator é nossa classe responsável por realizar o calculo de Impostos em cima de um Orçamento. 
 * Nela existe o método makeCalc que recebe o orçamento e um Importo e com isso realiza o calculo e printa no sistema o resultado.
 * */

public class TaxCalculator {

	public void makeCalc(Budget budget, Tax tax) {
		double calc = tax.calc(budget);
		System.out.println(calc);
	}
}
