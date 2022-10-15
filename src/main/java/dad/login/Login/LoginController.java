package dad.login.Login;

import javafx.event.ActionEvent;

public class LoginController {
    
    private LoginView view = new LoginView();
    private LoginModel model = new LoginModel();

    public LoginController() {
        // view.usuarioProperty().textProperty().bindBidirectional(model.usuarioProperty());
    
        view.getCancelarButton().setOnAction(this::onCancelarAction);
        view.getAccederButton().setOnAction(this::onAccederAction);

        view.usuarioProperty().textProperty().addListener((o, ov, nv) -> {
            System.out.println("Nombre usuario = " + nv);
        });

        view.passwdProperty().textProperty().addListener((o, ov, nv) -> {
            System.out.println("Contraseña = " + nv);
        });

    }

    private void onCancelarAction(ActionEvent e) {
        System.out.println("Salir del programa");
    }

    private void onAccederAction(ActionEvent e) {
        System.out.println("Acceder con el usuario");
    }

    public LoginView getView() {
        return this.view;
    }

}
