package controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;

public class ControllerScene1 implements Initializable {

    @FXML
    private ChoiceBox<String>  choiceScenes;

    private String[]  scenes = {"1","2","3","4"};
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        choiceScenes.getItems().addAll(scenes);
    }
    
}
