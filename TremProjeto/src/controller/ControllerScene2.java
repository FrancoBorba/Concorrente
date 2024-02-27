package controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.animation.AnimationTimer;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Slider;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Circle;
import model.DataSingleton;
import model.Train;
import model.TrainMoviment;

public class ControllerScene2 implements Initializable{
    
    private Train trem1 , trem2;
    private TrainMoviment trainMoviment;

    @FXML
    private ImageView imageTrain1,imageTrain2; ;

    @FXML
    private Slider speedTrain1,speedTrain2;

     @FXML
    Circle dangerZone1, dangerZone2;

    private

    DataSingleton data = DataSingleton.getInstance();

    private Boolean train1InDanger1F = false;
    private Boolean train1InDanger2F = false;
    private Boolean train2InDanger1F = false;
    private Boolean train2InDanger2F = false;
    private Boolean danger1;
    private Boolean danger2;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
       switch (data.getOpcao()) {
        case 0:{
        trem1 = new Train(imageTrain1, 0);
        trem2 = new Train(imageTrain2, 1);
                break;
        }
        case 1:{
         trem1 = new Train(imageTrain1, 2);
         trem2 = new Train(imageTrain2,  3);
         break;
        }
        case 2:{
            trem1 = new Train(imageTrain1, 0);
            trem2 = new Train(imageTrain2,  3);
            break;
        }
        case 3:{
            trem1 = new Train(imageTrain1, 2);
            trem2 = new Train(imageTrain2,  1);
            break;
        }

        default:
            break;
       }
       

       speedTrain1.valueProperty().addListener( new ChangeListener<Number>() {

        @Override
        public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
            trem1.setVelocidadeX(speedTrain1.getValue());
            trem1.setVelocidadeY(speedTrain1.getValue());
        }
        
       });

       speedTrain2.valueProperty().addListener(new ChangeListener<Number>() {

       

        @Override
        public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
           trem2.setVelocidadeX(speedTrain1.getValue());
           trem2.setVelocidadeY(speedTrain2.getValue());
        }
        
       });

       trainMoviment = new TrainMoviment();
       start.start();
}
    AnimationTimer start = new AnimationTimer() {

        @Override
        public void handle(long now) {
            dangerZoneDetecter();
        }
        
    };

       AnimationTimer train1Timer = new AnimationTimer() {

        @Override
        public void handle(long now) {
           trem1.setVelocidadeX(speedTrain1.getValue());
           trem1.setVelocidadeY(speedTrain1.getValue());
          trainMoviment.trainMoviment(trem1);
        }
        
       };
      // train1Timer.start();

       AnimationTimer train2timer = new AnimationTimer(){

         @Override
         public void handle(long now) {
         trem2.setVelocidadeX(speedTrain2.getValue());
         trem2.setVelocidadeY(speedTrain2.getValue());
         trainMoviment.trainMoviment(trem2);
         }

       };
      // train2timer.start();

      
    
      public void dangerZoneDetecter(){
        
        //pra ver que trem entrou primeiro em qual zona
        Boolean train1InDanger1 = trainMoviment.isInDanger(trem1, dangerZone1);
        Boolean train2InDanger1 = trainMoviment.isInDanger(trem2, dangerZone1);

        Boolean train1InDanger2 = trainMoviment.isInDanger(trem1, dangerZone2);
        Boolean train2InDanger2 = trainMoviment.isInDanger(trem2, dangerZone2);

        if (train1InDanger1 && train2InDanger1){ // Ambos na Danger Zone 1
            if(train1InDanger1F && !train2InDanger1F){ //Trem 1 entrou primeiro
                train2timer.stop();
            } else if (train2InDanger1F && !train1InDanger1F){// Trem 2 entrou primeiro
                train1Timer.stop();
            }
            danger1 = true;
        }else{
            if(train1InDanger1){
                train1InDanger1F = true;
                train2InDanger1 = false;
            } else{
                train1InDanger1F = false;
            }
            if(train2InDanger1){
                train2InDanger1F = true;
                train1InDanger1 = false;
            } else{
                train2InDanger1F = false;
            }
            danger1 = false;
        }

        if(train1InDanger2 && train2InDanger2){ // Ambos na Danger Zone 2
            if(train1InDanger2F && !train2InDanger2F){
                train2timer.stop();
            } else if(train2InDanger2F && !train1InDanger2F){
                train1Timer.stop();
            }
            danger2=true;
        }else{
            if(train1InDanger2){
                train1InDanger2F = true;
                train2InDanger2 = false;
            } else{
                train1InDanger2F = false;
            }
            if(train2InDanger2){
                train2InDanger2F = true;
                train1InDanger2 = false;
            } else{
                train2InDanger2F = false;
            }
            danger2 = false;
        }
        if(!danger1 && !danger2){
           train1Timer.start();
           train2timer.start();
        }
    }

}
