package general;


/**
 * Budget � nossa classe que representa algum or�amento generico. 
 * Nela existe apenas nosso Contrutor que inst�ncia e "seta" o valor da classe e seu respectivo getter.
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
