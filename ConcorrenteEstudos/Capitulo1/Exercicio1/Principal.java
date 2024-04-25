/* ***************************************************************
* Autor............: Franco Ribeiro Borba
* Matricula........: 202310445
* Inicio...........: 25/04/2023
* Ultima alteracao.: 25/04/2023
* Nome.............: Principal.java
* Funcao...........: Testar minha primeira Thread criada
*************************************************************** */
package ConcorrenteEstudos.Capitulo1.Exercicio1;

public class Principal {
  public static void main(String[] args) {
    for(int i =0 ; i <= 10 ; i++){
      Calculadora calculadora = new Calculadora(i); // criando 10 calculadoras
      calculadora.start(); // startando as threads
    }
  }
}
