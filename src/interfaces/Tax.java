package interfaces;

import general.Budget;

/** 
 * Como existe muitos tipos de impostos diferentes e para cada tipo de imposto existe um algoritmo de que faz esse calculo
 * usamos ent�o o Padr�o de Projeto Strategy criando assim essa interface com o "Contrato" de como cada classe de Imposto ir� se comportar
 * e dessa maneira podemos implementar os algoritmos diferentes, entretanto, sem complexidade de cadeias de if ou v�rios m�todos. 
 * */

public interface Tax {
	double calc(Budget budget);
}
