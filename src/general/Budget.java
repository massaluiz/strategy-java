package general;


/**
 * Budget é nossa classe que representa algum orçamento generico. 
 * Nela existe apenas nosso Contrutor que instância e "seta" o valor da classe e seu respectivo getter.
 * */

public class Budget {

	private final double value;
	
	public Budget(double value) {
		this.value = value;
	}

	public double getValue() {
		return value;
	}
}
