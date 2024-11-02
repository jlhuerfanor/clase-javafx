package co.edu.itc.programacion.ejemplos;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class PrincipalController implements Initializable {
    @FXML
    private Label primaryLabel;
    @FXML
    private CheckBox checkeado;
    @FXML
    private TextField nombreUsuario;

    private CheckModel model;

    @FXML
    public void switchToSecondary(ActionEvent actionEvent) {
        model.labelProperty().set(model.toString());
    }

    @FXML
    public void checkeadoCambio(ActionEvent actionEvent) {
        model.labelProperty().set("Checkeado cambio a: " + model.checkeadoProperty().get());
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        model = new CheckModel();

        model.checkeadoProperty().bind(checkeado.selectedProperty());
        model.nombreUsuarioProperty().bind(nombreUsuario.textProperty());
        model.labelProperty().bindBidirectional(primaryLabel.textProperty());

        // nombreUsuario.textProperty().bind(model.nombreUsuarioProperty());
        // checkeado.selectedProperty().bind(model.checkeadoProperty());
        // primaryLabel.textProperty().bindBidirectional(model.labelProperty());
    }
}
