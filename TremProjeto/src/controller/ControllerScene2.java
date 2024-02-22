package controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Slider;
import javafx.scene.image.ImageView;
import model.DataSingleton;
import model.Train;

public class ControllerScene2 implements Initializable{
    
    private Train trem1 , trem2;
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
    }

    

}
