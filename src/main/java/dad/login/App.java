package dad.login;

import dad.login.ver.VerView;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application{

    private VerView view;

    @Override
    public void start(Stage primaryStage) throws Exception {
        
        view = new VerView();

        primaryStage.setTitle("Login");
        primaryStage.setScene(new Scene(view));
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
    
}
