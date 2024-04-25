/* ***************************************************************
* Autor............: Franco Ribeiro Borba
* Matricula........: 202310445
* Inicio...........: 25/04/2023
* Ultima alteracao.: 25/04/2023
* Nome.............: Principal.java
* Funcao...........: Aprender a interromper Threads
*************************************************************** */
package ConcorrenteEstudos.Capitulo1.Exercicio3;

import java.util.concurrent.TimeUnit;

public class Principal  {
  public static void main(String[] args) throws InterruptedException {
    Thread task = new GeradorPrimos();
		task.start();	// 
		
		
		try {
			TimeUnit.SECONDS.sleep(5);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		task.interrupt();
		
		Thread.sleep(10000); // faz a Thread dormir
		System.out.println(task.getState());	// TERMINATED
		task.interrupt();	
  }
}
