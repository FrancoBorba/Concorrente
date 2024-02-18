package controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.animation.FadeTransition;
import javafx.animation.Interpolator;
import javafx.animation.RotateTransition;
import javafx.animation.ScaleTransition;
import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.ImageView;
import javafx.scene.transform.Rotate;
import javafx.util.Duration;

public class Controller implements Initializable {

    @FXML
    private ImageView imageView;

    
    @FXML  
     public void starTranslate(ActionEvent event) {
      TranslateTransition translate = new TranslateTransition();
        translate.setNode(imageView);
        translate.setDuration(Duration.seconds(1));
        translate.setAutoReverse(true);
        translate.setCycleCount(TranslateTransition.INDEFINITE);
        //translate.setDelay(Duration.seconds(2));
        translate.setByX(200);
        //translate.setByY(300);
        translate.play();
        
    }
    @FXML
    void startFade(ActionEvent event) {
        FadeTransition fade = new FadeTransition();
        fade.setNode(imageView);
        fade.setDuration(Duration.millis(1000));
        fade.setCycleCount(FadeTransition.INDEFINITE);
        fade.setInterpolator(Interpolator.LINEAR);
        fade.setFromValue(0);//Para fade in use 0, fade out use 1
        fade.setToValue(1);//Para fade in use 1, fade out use 0
        fade.play();
    }

    @FXML
    void startRotate(ActionEvent event) {
        RotateTransition rotate = new RotateTransition();
        rotate.setNode(imageView);
        rotate.setDuration(Duration.millis(1000));
        rotate.setCycleCount(RotateTransition.INDEFINITE);
        rotate.setByAngle(360);
        rotate.setInterpolator(Interpolator.LINEAR);
        //rotate.setDelay(Duration.millis(1000));
        //rotate.setAutoReverse(true);
        rotate.setAxis(Rotate.Z_AXIS);//Podendo ser X/Y/Z
        rotate.play();
    }

    @FXML
    void startScale(ActionEvent event) {
        ScaleTransition scale = new ScaleTransition();
        scale.setNode(imageView);
        scale.setDuration(Duration.millis(1000));
        scale.setCycleCount(ScaleTransition.INDEFINITE);
        scale.setInterpolator(Interpolator.LINEAR);
        scale.setAutoReverse(true);
        scale.setByX(1.3);//Para diminuir use 0.5
        scale.setByY(1.3);//Para diminuir use 0.5
        scale.play();
    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        
        
        
    }

}
