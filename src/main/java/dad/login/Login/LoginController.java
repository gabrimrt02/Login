package dad.login.Login;

import dad.login.App;
import dad.login.auth.AuthService;
import dad.login.auth.FileAuthService;
import dad.login.auth.LdapAuthService;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class LoginController {

    private LoginView view = new LoginView();
    private LoginModel model = new LoginModel();

    public LoginController() {
        view.usuarioProperty().textProperty().bindBidirectional(model.usuarioProperty());
        view.passwdProperty().textProperty().bindBidirectional(model.passwdProperty());
        
        view.getCancelarButton().setOnAction(this::onCancelarAction);
        view.getAccederButton().setOnAction(this::onAccederAction);
        
        view.ldapCheckBox().selectedProperty().bindBidirectional(model.useLDAPProperty());;
        
    }
    
    private void onCancelarAction(ActionEvent e) {
        App.primaryStage.close();
    }
    
    private void onAccederAction(ActionEvent e) {
        
        AuthService auth;
        auth = model.getUseLDAP() ? new LdapAuthService() : new FileAuthService();

        try {

            Alert alert;
            if (auth.login(model.getUsuario(), model.getPasswd())) {
                alert = new Alert(AlertType.INFORMATION);
                alert.setTitle("Inciar Sesión");
                alert.setHeaderText("Acceso permitido");
                alert.setContentText("Las credenciales de acceso son válidas.");
                alert.showAndWait();
                App.primaryStage.close();
            } else {
                alert = new Alert(AlertType.ERROR);
                alert.setTitle("Inciar Sesión");
                alert.setHeaderText("Acceso denegado");
                alert.setContentText("El usuario y/o la contraseña no son válidos.");
                alert.showAndWait();
                view.passwdProperty().clear();
            }

        } catch (Exception e1) {
            e1.printStackTrace();
        }

    }

    public LoginView getView() {
        return this.view;
    }

}
