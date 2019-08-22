package general;

import interfaces.Tax;

/**
 * TaxCalculator � nossa classe respons�vel por realizar o calculo de Impostos em cima de um Or�amento. 
 * Nela existe o m�todo makeCalc que recebe o or�amento e um Importo e com isso realiza o calculo e printa no sistema o resultado.
 * */

public class TaxCalculator {

	public void makeCalc(Budget budget, Tax tax) {
		double calc = tax.calc(budget);
		System.out.println(calc);
	}
}
