package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;



import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.stage.Stage;
import model.DataSingleton;

public class ControllerScene1 implements Initializable {

    @FXML
    private ChoiceBox<String>  choiceScenes;
    @FXML
    private Button buttonStart;

    private Stage stage;
    private Scene scene;
    private Parent root;

    private String[]  scenes = {"1","2","3","4"};

    DataSingleton data = DataSingleton.getInstance();
    

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        choiceScenes.getItems().addAll(scenes);
        choiceScenes.setValue(choiceScenes.getItems().get(data.getOpcao()));

     
        
         
    }
    public void switchScenes(ActionEvent event) throws IOException{
        data.setOpcao(choiceScenes.getSelectionModel().getSelectedIndex());
        FXMLLoader loader = new FXMLLoader(getClass().getResource("../view/scene2.fxml"));
        root = loader.load();
        scene = new Scene(root);
        stage= (Stage)buttonStart.getScene().getWindow();
        stage.setScene(scene);
        stage.show();

    }
    

}
