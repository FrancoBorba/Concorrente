import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Principal extends Application {
    public static void main(String[] args) throws Exception {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
      Parent root = FXMLLoader.load(getClass().getResource("view/scene.fxml"));

      Scene scene = new Scene(root);
      scene.getStylesheets().add(getClass().getResource("scenecss.css").toExternalForm()
      );
      primaryStage.setScene(scene);
      primaryStage.show();
    }
}

// Este codigo é um projeto do Canal Rafael Mesquita para o estudo de Threads , o codigo fonte está no seu canal
