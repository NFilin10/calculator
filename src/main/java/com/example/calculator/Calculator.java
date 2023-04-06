package com.example.calculator;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.TilePane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Calculator extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        //use vertical alignment for whole window
        BorderPane root = new BorderPane();
        root.setPadding(new Insets(5, 5, 5, 5));


        //top section
        //adding text field
        TextField textInput = new TextField();
        textInput.setPrefSize(400, 25);
        textInput.setAlignment(Pos.TOP_RIGHT);
        root.setTop(textInput);


        //middle section
        //adding backspace button
        Button backspace = new Button("backspace");
        backspace.setPrefSize(120, 25);
        root.setLeft(backspace);
        BorderPane.setMargin(backspace, new Insets(10, 0, 0, 0));

        //adding C and CE buttons
        HBox rightBtnPlacement = new HBox(2);
        Button ce = new Button("CE");
        ce.setPrefSize(80, 25);
        Button c = new Button("C");
        c.setPrefSize(80, 25);
        rightBtnPlacement.getChildren().addAll(ce, c);
        root.setRight(rightBtnPlacement);
        BorderPane.setMargin(rightBtnPlacement, new Insets(10, 0, 0, 0));


        //bottom section
        TilePane bottomBtns = new TilePane(2, 2);
        bottomBtns.setPrefRows(4);
        bottomBtns.setPrefColumns(5);
        root.setBottom(bottomBtns);

        //adding bottom section buttons
        Button btn1 = new Button("1");
        btn1.setPrefSize(80, 25);

        Button btn2 = new Button("2");
        btn2.setPrefSize(80, 25);

        Button btn3 = new Button("3");
        btn3.setPrefSize(80, 25);

        Button btn4 = new Button("4");
        btn4.setPrefSize(80, 25);

        Button btn5 = new Button("5");
        btn5.setPrefSize(80, 25);

        Button btn6 = new Button("6");
        btn6.setPrefSize(80, 25);

        Button btn7 = new Button("7");
        btn7.setPrefSize(80, 25);

        Button btn8 = new Button("8");
        btn8.setPrefSize(80, 25);

        Button btn9 = new Button("9");
        btn9.setPrefSize(80, 25);

        Button btn0 = new Button("0");
        btn0.setPrefSize(80, 25);

        Button div = new Button("/");
        div.setPrefSize(80, 25);

        Button sqrt = new Button("sqrt");
        sqrt.setPrefSize(80, 25);

        Button multi = new Button("*");
        multi.setPrefSize(80, 25);

        Button perc = new Button("%");
        perc.setPrefSize(80, 25);

        Button minus = new Button("-");
        minus.setPrefSize(80, 25);

        Button plus = new Button("+");
        plus.setPrefSize(80, 25);

        Button equals = new Button("=");
        equals.setPrefSize(80, 25);

        Button plusMinus = new Button("+/-");
        plusMinus.setPrefSize(80, 25);

        Button oneDivX = new Button("1/x");
        oneDivX.setPrefSize(80, 25);

        Button coma = new Button(",");
        coma.setPrefSize(80, 25);

        bottomBtns.getChildren().addAll(btn7, btn8, btn9, div, sqrt, btn4, btn5, btn6, multi, perc, btn1, btn2, btn3, minus, oneDivX, btn0, plusMinus, coma, plus, equals);


        //window setup
        Scene scene = new Scene(root, 420, 230);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Calculator");
        primaryStage.show();

    }
}
