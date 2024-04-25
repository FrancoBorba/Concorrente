/* ***************************************************************
* Autor............: Franco Ribeiro Borba
* Matricula........: 202310445
* Inicio...........: 25/04/2023
* Ultima alteracao.: 25/04/2023
* Nome.............: GeradorPrimos.java
* Funcao...........: Gerar Numeros Primos atraves de Threads
*************************************************************** */
package ConcorrenteEstudos.Capitulo1.Exercicio3;

public class GeradorPrimos extends Thread{
  @Override
  public void run(){
    long number = 1;
    while (number <= 100) { 
      if(isPrime(number)){
        System.out.printf("Numero %d é primo \n",number);
      }
    
  if(isInterrupted()){ // isInterrupted é um metodo da classe Thread
    
    System.out.println("Gerador de Primos Status: " + getState()); // pega o status da Thread

    System.out.println("O gerador foi interrompido");
    return;
    
  }
      number++;
}
  }
  private boolean isPrime(long number) {
		if(number <= 2) {
			return true;
		}
		
		for(long i = 2; i < number; i++) {
			if((number % i) == 0) {
				return false;
			}
		}
		
		return true;
	}
}
