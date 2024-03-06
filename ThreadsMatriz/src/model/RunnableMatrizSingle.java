package model;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

import javafx.application.Platform;
import javafx.scene.control.Label;

public class RunnableMatrizSingle implements Runnable{
    private Label[][] matriz;
    static int quantidade = 0;

    public RunnableMatrizSingle(Label matriz [][]){
        this.matriz = matriz;
    }

    @Override
    public void run() {
       for(int linha = 0; linha <=9 ; linha++){
            for(int coluna= 0 ; coluna <=9 ; coluna++){
                try {
                    Label label = matriz[linha][coluna]; 
                    Platform.runLater(() -> label.setStyle("-fx-border-color:black; -fx-background-color:#90EE90")); // pintando a matriz
                    Platform.runLater(() -> RunnableMatrizSingle.quantidade++); // contando quantas celulas ja foram pintadas
                    Thread.sleep(new Random().nextInt(1000)); // colocando a thread para dormir randomicamente 
                } catch (Exception e) {
                    Logger.getLogger(RunnableMatrizSingle.class.getName()).log(Level.SEVERE, null, e);
                }
            }
       }
       // O Platform.runLater é utilizado já que o javaFX não é uma biblioteca Thread Safe , assim poderia disparar uma execeção em tempo de execução

       // O PLatform.runLater sera o responsavel pela modificação grafica delegando a função a Thread do javaFX



    }
    
}
