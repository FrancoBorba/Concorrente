package controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.animation.AnimationTimer;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.shape.Circle;

public class Controller implements Initializable {
    @FXML
    private Circle myCircle;

    private int speedX = 5;
    private int speedY = speedX;

    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        myCircle.setLayoutX(91); 
        myCircle.setLayoutY(88);   

        AnimationTimer animationTimer = new AnimationTimer() {

            @Override
            public void handle(long now) {
                myCircle.setLayoutX(myCircle.getLayoutX() + speedX);
                myCircle.setLayoutY(myCircle.getLayoutY() + speedY);

                if(myCircle.getLayoutX() >= 600){
                    speedX = speedX*-1;
                } else if(myCircle.getLayoutY() >= 400){
                    speedY = speedY*-1;
                    
                }else if(myCircle.getLayoutY() <= 0){
                    speedY = speedY*-1;
                } else if(myCircle.getLayoutX() <= 0){
                    speedX = speedX*-1;
                }
                

            }
        
            
        };
        animationTimer.start();
    }
}
