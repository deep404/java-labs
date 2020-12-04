package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Cursor;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.scene.layout.GridPane;


public class Main extends Application {

    @Override
//    public void start(Stage stage) throws Exception{
//
//        Parent homeRoot = FXMLLoader.load(getClass().getResource("sample.fxml"));
//
//
//        stage.setTitle("Lab9 Basic Division Calculator");
//        //stage.setWidth(500);
//        //stage.setHeight(500);
//
//        //Create grid for elements
//        GridPane root = new GridPane();
//        root.setVgap(10);
//        root.setHgap(10);
//        root.setPadding(new Insets(50));
//
//        //Create labels
//        Label firstNumberLabel = new Label("Write below the DIVIDEND");
//        Label secondNumberLabel = new Label("Write below the DIVISOR");
//        firstNumberLabel.setFont(Font.font("Gilroy", FontWeight.BOLD, 24));
//        secondNumberLabel.setFont(Font.font("Gilroy", FontWeight.BOLD, 24));
//
//        //Create textfield for input
//        TextField firstNumberField = new TextField();
//        TextField secondNumberField = new TextField();
//        firstNumberField.setFont(Font.font("Gilroy", FontWeight.BOLD, 24));
//        secondNumberField.setFont(Font.font("Gilroy", FontWeight.BOLD, 24));
//
//        //Create button
//        Button submit = new Button("Submit");
//        submit.setFont(Font.font("Gilroy", FontWeight.BOLD, 24));
//        submit.setCursor(Cursor.HAND);
//        submit.setAlignment(Pos.CENTER);
//
//        //Elements position on desktop app
//        root.add(firstNumberLabel, 0, 0);
//        root.add(firstNumberField, 0 ,2);
//        root.add(secondNumberLabel, 0, 3);
//        root.add(secondNumberField,0,4 );
//        root.add(submit, 0, 5);
//
//        //Establish the scene on stage
//        Scene scene = new Scene(root);
//        stage.setScene(scene);
//
//        //View the app
//        stage.show();
//
//    }
    public void start(Stage primaryStage) throws Exception{
        primaryStage.setTitle("lab9 Basic Division Calculator");

        Parent homeRoot = FXMLLoader.load(getClass().getResource("sample.fxml"));
        Scene home = new Scene(homeRoot);

        primaryStage.setScene(home);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
