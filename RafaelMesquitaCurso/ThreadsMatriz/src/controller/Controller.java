package controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import model.RunnableMatrizMulti;
import model.RunnableMatrizSingle;
import model.RunnableTimer;

public class Controller implements Initializable {

    @FXML
    private AnchorPane anchorPaneMultiThread;

    @FXML
    private AnchorPane anchorPaneSingleThread;

    @FXML
    private Label labelTimerMultiThread;

    @FXML
    private Label labelTimerSingleThread;

    private Label[][] matrizSingleThread = new  Label[10][10];

    private Label[][] matrizMultiThread = new  Label[10][10];

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        criarMatriz(anchorPaneSingleThread, matrizSingleThread);
        criarMatriz(anchorPaneMultiThread, matrizMultiThread);

        RunnableMatrizSingle runnableMatrizSingle = new RunnableMatrizSingle(matrizSingleThread); // criando a runabble da Matriz Single

        Thread t1 = new Thread(runnableMatrizSingle); // instanciando na Thread
        t1.start(); // startando

        RunnableMatrizMulti runnableMatrizMulti1 = new RunnableMatrizMulti(matrizMultiThread, 0);
        Thread t2 = new Thread(runnableMatrizMulti1);
        RunnableMatrizMulti runnableMatrizMulti2 = new RunnableMatrizMulti(matrizMultiThread, 1);
        Thread t3 = new Thread(runnableMatrizMulti2);
        RunnableMatrizMulti runnableMatrizMulti3 = new RunnableMatrizMulti(matrizMultiThread, 2);
        Thread t4 = new Thread(runnableMatrizMulti3);
        RunnableMatrizMulti runnableMatrizMulti4 = new RunnableMatrizMulti(matrizMultiThread, 3);
        Thread t5 = new Thread(runnableMatrizMulti4);
        RunnableMatrizMulti runnableMatrizMulti5 = new RunnableMatrizMulti(matrizMultiThread, 4);
        Thread t6 = new Thread(runnableMatrizMulti5);
        RunnableMatrizMulti runnableMatrizMulti6 = new RunnableMatrizMulti(matrizMultiThread, 5);
        Thread t7 = new Thread(runnableMatrizMulti6);
        RunnableMatrizMulti runnableMatrizMulti7 = new RunnableMatrizMulti(matrizMultiThread, 6);
        Thread t8 = new Thread(runnableMatrizMulti7);
        RunnableMatrizMulti runnableMatrizMulti8 = new RunnableMatrizMulti(matrizMultiThread, 7);
        Thread t9 = new Thread(runnableMatrizMulti8);
        RunnableMatrizMulti runnableMatrizMulti9 = new RunnableMatrizMulti(matrizMultiThread, 8);
        Thread t10 = new Thread(runnableMatrizMulti9);
        RunnableMatrizMulti runnableMatrizMulti10 = new RunnableMatrizMulti(matrizMultiThread, 9);
        Thread t11 = new Thread(runnableMatrizMulti10);

       RunnableTimer runnableTimer = new RunnableTimer(labelTimerSingleThread, labelTimerMultiThread);
        Thread timerThread = new Thread(runnableTimer);
        timerThread.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();
        t8.start();
        t9.start();
        t10.start();
        t11.start();
    }



    public void criarMatriz(AnchorPane anchorPane , Label[][] matriz){
         int x = 25; 
         int y = 50;
        for(int l=0 ; l <= 9 ; l++){  // criando linhas
            for(int c=0 ; c<=9 ; c++){ // criando colnuas

                Label label = new Label(); // inicializando os quadrados

                label.setPrefHeight(25); // setando altura do quadrado
                label.setPrefWidth(25); // setando largura do quadrado
                label.setLineSpacing(1); // espaçamento entre as linhas
                label.setLayoutX(x); // setando onde vai aparecer o primeiro quadrado
                label.setLayoutY(y);     //setando onde vai aparecer o primeiro quadrado
                label.setStyle("-fx-border-color:black;");
                anchorPane.getChildren().addAll(label);

                matriz[l][c] = label; // adicionando um label a cada espaço da matriz

                x = x + 25; // aumentando o valor de x no 2 for para criar as colunas

            }
            y = y + 25; // aumnentando valor de y para criar as linhas no 1 for
            x = 25; // resetando x para se ir criando as demais colunas
        }
    }


}

