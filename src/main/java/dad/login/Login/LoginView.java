package dad.login.Login;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class LoginView extends VBox {
    
    private GridPane datosPanel;
    private HBox botonesPanel;

    private Button accederButton;
    private Button cancelarButton;

    private TextField usuarioText;
    private PasswordField passwdField;
    private CheckBox ldapBox;

    public LoginView() {
        super();

        accederButton = new Button("Acceder");
        cancelarButton = new Button("Cancelar");

        botonesPanel = new HBox(5, accederButton, cancelarButton);
        datosPanel = new GridPane();

        datosPanel.addRow(0, new Label("Usuario: "), usuarioText = new TextField());
        datosPanel.addRow(1, new Label("Contraseña: "), passwdField = new PasswordField());
        datosPanel.add(ldapBox = new CheckBox("Usar LDAP"), 1, 2);

        getChildren().addAll(
            datosPanel,
            botonesPanel
        );

        botonesPanel.setAlignment(Pos.CENTER);

        datosPanel.setAlignment(Pos.CENTER);
        datosPanel.setHgap(5);
        datosPanel.setVgap(5);
        
        setSpacing(5);
        setPadding(new Insets(5));
        setAlignment(Pos.CENTER);
        
    }

    public TextField usuarioProperty() {
        return this.usuarioText;
    }

    public PasswordField passwdProperty() {
        return this.passwdField;
    }

    public CheckBox ldapCheckBox() {
        return this.ldapBox;
    }

    public Button getAccederButton() {
        return this.accederButton;
    }

    public Button getCancelarButton() {
        return this.cancelarButton;
    }

}
