package interfaces;

import general.Budget;

/** 
 * Como existe muitos tipos de impostos diferentes e para cada tipo de imposto existe um algoritmo de que faz esse calculo
 * usamos então o Padrão de Projeto Strategy criando assim essa interface com o "Contrato" de como cada classe de Imposto irá se comportar
 * e dessa maneira podemos implementar os algoritmos diferentes, entretanto, sem complexidade de cadeias de if ou vários métodos. 
 * */

public interface Tax {
	double calc(Budget budget);
}
