package dad.login.ver;

import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class VerView extends VBox {
    
    private GridPane datosPanel;
    private HBox botonesPanel;

    private TextField usuarioText;
    private PasswordField passwdField;
    private CheckBox ldapBox;

    public VerView() {
        super();

        botonesPanel = new HBox(5, new Button("Acceder"), new Button("Cancelar"));
        datosPanel = new GridPane();

        datosPanel.addRow(0, new Label("Usuario: "), usuarioText = new TextField());
        datosPanel.addRow(1, new Label("Contraseña: "), passwdField = new PasswordField());
        datosPanel.add(ldapBox = new CheckBox("Usar LDAP"), 1, 2);

        getChildren().addAll(
            datosPanel,
            botonesPanel
        );

    }

    public String getUsuario() {
        return usuarioText.getText();
    }

    public TextField usuarioProperty() {
        return this.usuarioText;
    }

    public PasswordField passwdProperty() {
        return this.passwdField;
    }

    public CheckBox getLDAP() {
        return this.ldapBox;
    }

}
