package model;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

import javafx.application.Platform;
import javafx.scene.control.Label;

public class RunnableMatrizMulti implements Runnable {

    private Label matriz[][];
    private int linhaInicial;
    static int quantidade = 0;

    public RunnableMatrizMulti(Label matriz[][] , int linha){
        this.linhaInicial = linha;
        this.matriz = matriz;
    }


    @Override
    public void run() {
        try {
            for(int coluna = 0 ; coluna <=9 ; coluna++){
                Label label = matriz[linhaInicial][coluna];
                Platform.runLater(() -> label.setStyle("-fx-border-color:black; -fx-background-color:#90EE90")); // pintando a matriz
                Platform.runLater(() -> RunnableMatrizMulti.quantidade++); // contando os quadrados
                Thread.sleep(new Random().nextInt(1000)); // aleatorizando o tempo que cada Thread ira "Dormir"
            }
        } catch (Exception e) {
            Logger.getLogger(RunnableMatrizMulti.class.getName()).log(Level.SEVERE, null, e);
        }
    }



}


