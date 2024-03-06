import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application{
    public static void main(String[] args) throws Exception {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
       Parent root = FXMLLoader.load(getClass().getResource("scene/scene.fxml"));

       Scene scene = new Scene(root);

       primaryStage.setScene(scene);
       primaryStage.show();
    }

    // Este é um projeto de estudos de Threads do canal do professor Rafael Mesquita
}
