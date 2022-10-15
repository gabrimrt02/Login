package dad.login;

import dad.login.Login.LoginController;
import dad.login.Login.LoginView;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application{

    private LoginView view;

    @Override
    public void start(Stage primaryStage) throws Exception {
        
        LoginController controller = new LoginController();

        primaryStage.setTitle("Login");
        primaryStage.setScene(new Scene(controller.getView()));
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
    
}