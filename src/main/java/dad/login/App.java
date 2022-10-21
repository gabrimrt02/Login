package dad.login;

import dad.login.Login.LoginController;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application{

    // TODO Crear la variable static primaryStage
    public static Stage primaryStage;

    private LoginController controller;
    
    @Override
    public void start(Stage primaryStage) throws Exception {

        App.primaryStage = primaryStage;
        
        controller = new LoginController();
        
        primaryStage.setTitle("Login");
        primaryStage.setScene(new Scene(controller.getView(), 300, 200));
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
    
}
