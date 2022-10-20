package dad.login.Login;

import dad.login.auth.AuthService;
import dad.login.auth.FileAuthService;
import dad.login.auth.LdapAuthService;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class LoginController {

    private LoginView view = new LoginView();
    private LoginModel model = new LoginModel();

    private boolean useLdap = false;
    private AuthService auth;
    private Alert alert;

    public LoginController() {
        view.usuarioProperty().textProperty().bindBidirectional(model.usuarioProperty());
        view.passwdProperty().textProperty().bindBidirectional(model.passwdProperty());

        view.getCancelarButton().setOnAction(this::onCancelarAction);
        view.getAccederButton().setOnAction(this::onAccederAction);
    }

    private void onCancelarAction(ActionEvent e) {
        System.out.println("Salir del programa");
        System.exit(0);
    }

    private void onAccederAction(ActionEvent e) {
        System.out.println("Acceder con el usuario");
        System.out.println("Usuario = " + model.getUsuarioText());
        System.out.println("Contraseña = " + model.getPasswdText());

        if (view.ldapCheckBox().isSelected())
            useLdap = true;

        auth = useLdap ? new LdapAuthService() : new FileAuthService();

        if (useLdap) {
            System.out.println(useLdap);
            try {
                if (auth.login(model.getUsuarioText(), model.getPasswdText())) {
                    alert = new Alert(AlertType.INFORMATION);
                    alert.setTitle("Inciar Sesión");
                    alert.setHeaderText("Acceso permitido");
                    alert.setContentText("Las credenciales de acceso son válidas.");
                    alert.showAndWait();
                } else {
                    alert = new Alert(AlertType.ERROR);
                    alert.setTitle("Inciar Sesión");
                    alert.setHeaderText("Acceso denegado");
                    alert.setContentText("El usuario y/o la contraseña no son válidos.");
                    alert.showAndWait();
                }

            } catch (Exception e1) {
                e1.printStackTrace();
            }
        } else {
            System.out.println(useLdap);
            try {
                if (auth.login(model.getUsuarioText(), model.getPasswdText())) {
                    alert = new Alert(AlertType.INFORMATION);
                    alert.setTitle("Inciar Sesión");
                    alert.setHeaderText("Acceso permitido");
                    alert.setContentText("Las credenciales de acceso son válidas.");
                    alert.showAndWait();
                    
                } else {
                    alert = new Alert(AlertType.ERROR);
                    alert.setTitle("Inciar Sesión");
                    alert.setHeaderText("Acceso denegado");
                    alert.setContentText("El usuario y/o la contraseña no son válidos.");
                    alert.showAndWait();
                }

            } catch (Exception e1) {
                e1.printStackTrace();
            }
        }

    }

    public LoginView getView() {
        return this.view;
    }

}
