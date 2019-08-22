package tax;

import general.Budget;
import interfaces.Tax;

public class ISS implements Tax {

	@Override
	public double calc(Budget budget) {
		return budget.getValue() * 0.1;
	}
}
