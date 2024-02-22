package controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Slider;
import javafx.scene.image.ImageView;
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

    private

    DataSingleton data = DataSingleton.getInstance();

    @Override
    public void initialize(URL location, ResourceBundle resources) {
       switch (data.getOpcao()) {
        case 0:{
            trem1 = new Train(imageTrain1, 0);
             trem2 = new Train(imageTrain2, 1);
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

    }

    

}
