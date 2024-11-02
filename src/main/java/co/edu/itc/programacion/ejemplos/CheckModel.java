package co.edu.itc.programacion.ejemplos;

import co.edu.itc.programacion.ejemplos.dominio.Check;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class CheckModel {
    private StringProperty label = new SimpleStringProperty();
    private StringProperty nombreUsuario = new SimpleStringProperty();
    private BooleanProperty checkeado = new SimpleBooleanProperty();

    private Check check = new Check();

    public CheckModel() {
        nombreUsuario.addListener((observableValue, oldValue, newValue) -> check.setUsuario(newValue));
        checkeado.addListener((observable, oldValue, newValue) -> check.setCheckeado(newValue));
    }

    public StringProperty nombreUsuarioProperty() {
        return nombreUsuario;
    }

    public BooleanProperty checkeadoProperty() {
        return checkeado;
    }

    public StringProperty labelProperty() {
        return label;
    }

    @Override
    public String toString() {
        return check.toString();
    }
}
