package dad.login.Login;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

// java fx bean

public class LoginModel {
    
    private StringProperty usuario = new SimpleStringProperty();
    private StringProperty passwdString = new SimpleStringProperty();

    public String getUsuarioText() {
        return this.usuario.getValue();
    }

    public void setusuarioText(String texto) {
        this.usuario.set(texto);
    }

    public String getPasswdText() {
        return this.passwdString.getValue();
    }

    public void setPasswdText(String texto) {
        this.passwdString.set(texto);
    }

    public StringProperty usuarioProperty() {
        return usuario;
    }

    public StringProperty passwdProperty() {
        return passwdString;
    }

}
