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
    @Override
    public void initialize(URL location, ResourceBundle resources) {

       
       myCircle.setLayoutX(28);
       myCircle.setLayoutY(28);

        
        int movimento = 5;
        AnimationTimer animationTimer = new AnimationTimer() {

            @Override
            public void handle(long now) {
         
            if(myCircle.getLayoutX() < 580){
             
                 myCircle.setLayoutX(myCircle.getLayoutX() + movimento);  

            }else if(myCircle.getLayoutY() < 375){
                myCircle.setLayoutY(myCircle.getLayoutY() + movimento);
            }
            

            }
            
        };
        animationTimer.start();
    }
    
}
