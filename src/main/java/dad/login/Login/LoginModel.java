package dad.login.Login;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

// java fx bean

public class LoginModel {
    
    private StringProperty usuario = new SimpleStringProperty();
    private StringProperty passwd = new SimpleStringProperty();
    private BooleanProperty useLDAP = new SimpleBooleanProperty();

    public String getUsuario() {
        return this.usuario.getValue();
    }

    public void setUsuario(String texto) {
        this.usuario.set(texto);
    }

    public String getPasswd() {
        return this.passwd.getValue();
    }

    public void setPasswd(String texto) {
        this.passwd.set(texto);
    }

    public StringProperty usuarioProperty() {
        return usuario;
    }

    public StringProperty passwdProperty() {
        return passwd;
    }

    public Boolean getUseLDAP() {
        return useLDAP.get();
    }

    public void setUseLDAP(Boolean useLDAP) {
        this.useLDAP.set(useLDAP);;
    }

    public BooleanProperty useLDAPProperty() {
        return useLDAP;
    }

}
