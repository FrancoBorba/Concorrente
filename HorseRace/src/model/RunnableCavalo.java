package model;

import java.util.Random;

import javafx.application.Platform;
import javafx.scene.control.Button;

public class RunnableCavalo implements Runnable{
    public Button button;
    public String nome;
    public int prioridade = Thread.MIN_PRIORITY;

    public RunnableCavalo(Button v1, String nome){
        this.button = v1;
        this.nome = nome;
    }
    @Override
    public void run() {
        Thread.currentThread().setPriority(prioridade);
        System.out.println(Thread.currentThread().getName() + "prioridade: " + Thread.currentThread().getPriority());

        
        // Implementar a movimentação do cavalo
        // Somar de 1 em 1 até 600 pontos ao bound.x
        // Na posição x igual a 350 o cavalo passa pela linha de chegada
        // button.setLayoutX(button.getLayoutX() + 1);
        // Para melhor visualizar a movimentação dos cavalos, utilize sleep. Ainda sobre o sleep, trabalhe com um valor aleatório até 50. Assim, em cada execução, um cavalo diferente vencerá.
        // Assim que os cavalos foram chegando imprima o nome do cavalo utilizando System.out.println

        for(int i=0 ; i <600 ; i++){
            Platform.runLater(() -> button.setLayoutX(button.getLayoutX() + 1));
            if( button.getLayoutX() == 350){
                System.out.println(Thread.currentThread().getName() + "chegou");
            }
            sleep1();
            //sleep2();
        }
    }
        /*
        Este método tem a finalidade de deixar a corrida de cavalos mais lenta.
        A estratégia para isso é utilizar o método Thread.sleep
    */

    public void sleep1(){
        try {
            Thread.sleep(new Random().nextInt(50)); // varia o tempo que o a Thread iira dormir para simular uma corrida
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
     /*
        Este método tem a finalidade de deixar a corrida de cavalos mais lenta.
        A estratégia para isso é a realização de um processamento (for e ifs)
    */
    public void sleep2() {
        int l = 0;
        for (int j = 1; j <= 4000000; j++) {
            if (l % 3 == 0) {
                l = l + 2;
            }
            if (l % 2 == 0) {
                l = l + 1;
            }
            l = l + 1;
        }
    }
    
}
    

