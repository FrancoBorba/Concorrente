package model;

import java.util.logging.Level;
import java.util.logging.Logger;

import javafx.application.Platform;
import javafx.scene.control.Label;

public class RunnableTimer implements Runnable{
    private Label timer1;
    private Label timer2;

    private int minutos =0;
    private int segundos =0;

    public RunnableTimer(Label timer1 , Label timer2){
        this.timer1 = timer1;
        this.timer2 = timer2;
    }
    
    @Override
    public void run() {
        while (RunnableMatrizSingle.quantidade < 100 || RunnableMatrizMulti.quantidade <100) {
            try {
                Thread.sleep(1000);
                segundos++;
                if(RunnableMatrizSingle.quantidade<100){ // timer da matriz Single
                    if(segundos < 10){
                        Platform.runLater(()-> timer1.setText("00:0" + this.segundos));
                    }else{
                        Platform.runLater(()-> timer1.setText("00:"+this.segundos));
                    }
                }
                if(RunnableMatrizMulti.quantidade < 100){
                    if (this.segundos < 10) {
                        Platform.runLater(() -> this.timer2.setText("00:0" + this.segundos));
                    }else{
                        Platform.runLater(() -> this.timer2.setText("00:" + this.segundos));
                    }
                }
            } catch (Exception e) {
                Logger.getLogger(RunnableTimer.class.getName()).log(Level.SEVERE, null, e);
            }
        }
    }
    
}
