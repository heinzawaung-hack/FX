package sample;

import javafx.application.Application;;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception{

        Label username = new Label();
        username.setText("Username : ");
        username.setFont(Font.font("Arial",15));
        username.setTextFill(Color.GREEN);

        Label password = new Label();
        password.setText("Password : ");
        password.setFont(Font.font("Arial",15));
        password.setTextFill(Color.GREEN);

        Label welcomeBack = new Label();
        welcomeBack.setText("Welcome Back");
        welcomeBack.setFont(Font.font("Arial",15));
        welcomeBack.setTextFill(Color.GREEN);

        TextField textField = new TextField();
        PasswordField passwordField = new PasswordField();

        Button button = new Button();
        button.setText("Login");
        button.setFont(Font.font("Arial",15));
        button.setTextFill(Color.GREEN);

        GridPane layOut = new GridPane();
        layOut.setAlignment(Pos.CENTER);
        layOut.setHgap(15);
        layOut.setVgap(15);
        layOut.add(welcomeBack,0,0,2,1);
        layOut.add(username,0,1);
        layOut.add(textField,1,1);
        layOut.add(password,0,2);
        layOut.add(passwordField,1,2);
        layOut.add(button,1,3);

        Scene scene = new Scene(layOut,400,200);
        stage.setScene(scene);
        stage.setTitle("MDL Wallet");
        stage.show();

    }
}
