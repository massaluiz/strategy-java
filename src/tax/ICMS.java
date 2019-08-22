package tax;

import general.Budget;
import interfaces.Tax;

/** Uma classe que representa um tipo de imposto e respeita seu contrato com a interface Tax assim seguindo Padrão de Projeto
 * Strategy.
 */

public class ICMS implements Tax {
	
	@Override
	public double calc(Budget budget) {
		return budget.getValue() * 0.06;
	}
}
