package controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.util.Duration;

public class Controller implements Initializable {

    @FXML
    private Circle myCircle;
    @FXML
    private Rectangle mySquare;

    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // Adicionando o Cirulo ao Local
        myCircle.setLayoutX(49);
        myCircle.setLayoutY(49);

        // Criando uma timeline para animar o círculo
        Timeline timeline = new Timeline();

        KeyValue circValue = new KeyValue(myCircle.translateXProperty(), 525);
        KeyValue squareValue = new KeyValue(mySquare.translateYProperty(), -350);
        /*
         * KeyValue é uma classe em JavaFX que representa um par chave-valor usado para definir o estado de uma propriedade em um determinado momento (keyframe) durante uma animação.

    A chave (Key) geralmente é a propriedade de um objeto que você deseja animar. Por exemplo, se você estiver animando a posição de um nó gráfico em um Pane, a chave seria a propriedade translateX ou translateY.
    O valor (Value) é o valor que a propriedade terá no momento específico definido pelo keyframe.
    Por exemplo, se você quiser animar a posição x de um nó gráfico para 100 pixels ao longo de 2 segundos, você criaria um KeyValue assim:
         */
        KeyFrame keyFrame = new KeyFrame(Duration.seconds(3),circValue,squareValue);
        

        timeline.getKeyFrames().add(keyFrame);

        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.setAutoReverse(true);
        timeline.play();
    }

    
}
