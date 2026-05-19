package com.mycompany.javafxapp;

import com.mycompany.javafxapp.practicas.Practica1;
import com.mycompany.javafxapp.practicas.Practica2;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage primaryStage) {
        Label titulo = new Label("Menú de Prácticas");
        titulo.setStyle("-fx-font-size: 18px; -fx-font-weight: bold;");

        Button btnPractica1 = new Button("Práctica 1 - Saludo");
        btnPractica1.setPrefWidth(200);
        btnPractica1.setOnAction(e -> {
            try { new Practica1().start(new Stage()); }
            catch (Exception ex) { ex.printStackTrace(); }
        });

        Button btnPractica2 = new Button("Práctica 2 - Número Aleatorio");
        btnPractica2.setPrefWidth(200);
        btnPractica2.setOnAction(e -> {
            try { new Practica2().start(new Stage()); }
            catch (Exception ex) { ex.printStackTrace(); }
        });

        VBox root = new VBox(15, titulo, btnPractica1, btnPractica2);
        root.setPadding(new Insets(30));
        root.setAlignment(Pos.CENTER);

        Scene scene = new Scene(root, 300, 400);
        primaryStage.setTitle("Prácticas JavaFX");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}