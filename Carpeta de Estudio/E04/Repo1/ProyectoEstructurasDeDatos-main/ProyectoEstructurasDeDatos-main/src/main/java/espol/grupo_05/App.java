package espol.grupo_05;

import TDAs.List;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import modelo.*; 


import java.io.IOException;

/**
 * JavaFX App
 */
public class App extends Application {

    public static String pathImg = "ImagenesCatalogo/";
    private final List<Juego> allGames = GameLoader.cargarJuegos();
    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        scene = new Scene(loadFXML("principal"), 710, 550);
        stage.setScene(scene);
        stage.show();
    }

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        launch();
    }
    
        static void changeRoot(Parent rootNode) {
        scene.setRoot(rootNode);
    }

}