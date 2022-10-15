package dad.login.Login;

import javafx.event.ActionEvent;

public class LoginController {
    
    private LoginView view = new LoginView();
    private LoginModel model = new LoginModel();

    public LoginController() {
        view.usuarioProperty().textProperty().bindBidirectional(model.usuarioProperty());
        view.passwdProperty().textProperty().bindBidirectional(model.passwdProperty());

        view.getCancelarButton().setOnAction(this::onCancelarAction);
        view.getAccederButton().setOnAction(this::onAccederAction);
    }

    private void onCancelarAction(ActionEvent e) {
        System.out.println("Salir del programa");
        // TODO Hacer que el programa termine al pulsar cancelar
    }

    private void onAccederAction(ActionEvent e) {
        System.out.println("Acceder con el usuario");
        System.out.println("Usuario = " + model.getUsuarioText());
        System.out.println("Contraseña = " + model.getPasswdText());
        // TODO Comprobar si la CheckBox isSelected y realizar la comparativa con los usuarios
    }

    public LoginView getView() {
        return this.view;
    }

}
