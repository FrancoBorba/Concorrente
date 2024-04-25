/* ***************************************************************
* Autor............: Franco Ribeiro Borba
* Matricula........: 202310445
* Inicio...........: 25/04/2023
* Ultima alteracao.: 25/04/2023
* Nome.............: Calculadora.java
* Funcao...........: Testar minha primeira Thread criada
*************************************************************** */
package ConcorrenteEstudos.Capitulo1.Exercicio1;

public class Calculadora extends Thread {

  private int number;
  public Calculadora(int number){
    this.number = number;
  }
  @Override
  public void run(){
      for (int i = 1; i <= 10; i++) {
			System.out.printf("%s: %d * %d = %d\n", Thread.currentThread().getName(), number, i, i * number); // multiplicação do numero do contrutor x i(0-10)
		}
  }
  // Thread.currentThread().getName() esse metodo volta o nome da Thread , o currentThread volta a thead atual
}
