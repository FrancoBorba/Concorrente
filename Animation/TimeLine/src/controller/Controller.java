package controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.util.Duration;

public class Controller implements Initializable {
    @FXML Label labelContagem;

    int i = 10;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        labelContagem.setText(String.valueOf(i));

        Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(1) , e ->{
            
                i--;
            labelContagem.setText(String.valueOf(i));

            if(i == 0){
                labelContagem.setText("ALARME");
                
            }

           
            

        }));
        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.play();
        
       
    }
    /*
       Aqui basicamente temos uma TimeLine com um KeyFrame, primeiro setamos no KeyFrame o seu
        Duration, que será o tempo entre suas execuções, então por esse meio teremos o controle sobre
        o tempo, pois o KeyFrame vai executar sua lambda function a cada 1 segundo.
        Nessa lambda function eu incremento o valor da minha variável de controle e atualizo a minha
        label com o valor do i, dessa forma o TImeLine executa esse KeyFrame a cada 1 segundo e
        assim fazendo toda lógica do nosso timer.
        Para que o Timer seja “Infinito” eu preciso declarar o .setCycleCount do meu time line como
        INDEFINITE.
        Dessa forma temos um maior entendimento sobre o controle de tempo do TimeLine e seus
        KeyFrames:
        Agora um exemplo de como adicionar vários KeyFrames na nossa TimeLine:
     */
}
