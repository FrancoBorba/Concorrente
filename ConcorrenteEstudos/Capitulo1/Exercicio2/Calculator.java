/* ***************************************************************
* Autor............: Franco Ribeiro Borba
* Matricula........: 202310445
* Inicio...........: 25/04/2023
* Ultima alteracao.: 25/04/2023
* Nome.............: Calculadora.java
* Funcao...........: Utilizando uma Thread como Calculadora
*************************************************************** */
package ConcorrenteEstudos.Capitulo1.Exercicio2;



 public class Calculator implements Runnable {

	/**
	 *  The number
	 */
	private int number;
	
	/**
	 *  Constructor of the class
	 * @param number : The number
	 */
	public Calculator(int number) {
		this.number=number;
	}
	
	/**
	 *  Method that do the calculations
	 */
	@Override
	public void run() {
		for (int i=1; i<=10; i++){
			System.out.printf("%s: %d * %d = %d\n",Thread.currentThread().getName(),number,i,i*number);
		}
	}
}
