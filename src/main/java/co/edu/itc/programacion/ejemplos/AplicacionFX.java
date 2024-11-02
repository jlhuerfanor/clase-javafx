package co.edu.itc.programacion.ejemplos;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.net.URL;

public class AplicacionFX extends Application {
    public static Scene scene;
    public static URL principal = AplicacionFX.class.getResource(
            "/co/edu/itc/programacion/ejemplos/principal.fxml");
    public static URL styles = AplicacionFX.class.getResource(
            "/co/edu/itc/programacion/ejemplos/styles.css");

    @Override
    public void start(Stage stage) throws Exception {
        scene = new Scene(FXMLLoader.load(principal));
        scene.getStylesheets().add(styles.toExternalForm());
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        AplicacionFX.launch(args);
    }
}
