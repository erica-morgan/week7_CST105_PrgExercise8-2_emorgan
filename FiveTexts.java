package application;

/**
 * Program: Programming Exercise_8_Ex4 
 * File: FiveTexts.java
 * Summary: This is programming exercise 14.4 from the textbook. 
 * 			It displays 5 versions of the same text in random color and opacity.
 * Author: Erica Morgan
 * Date: 4/6/2018 
 */

import javafx.application.*;
import javafx.geometry.*;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;

public class FiveTexts extends Application {
	public static void main(String[] args) {
		launch(args);
	}
	@Override
	public void start(Stage primaryStage) {
		//create the HBox pane 
		HBox pane = new HBox(2);
		//center the pane
		pane.setAlignment(Pos.CENTER);
		
		//create the text
		Label text1 = new Label ("Java");
		Label text2 = new Label ("Java");
		Label text3 = new Label ("Java");
		Label text4 = new Label ("Java");
		Label text5 = new Label ("Java");
		
		//set font for text
		text1.setFont(Font.font("Times Roman", FontWeight.BOLD, FontPosture.ITALIC, 22));
		//set random color
		text1.setTextFill(Color.color(Math.random(),Math.random(),Math.random()));
		//set random opacity
		text1.setOpacity(Math.random());
		//rotate so letters are vertical
		text1.setRotate(90);
		
		text2.setFont(Font.font("Times Roman", FontWeight.BOLD, FontPosture.ITALIC, 22));
		text2.setTextFill(Color.color(Math.random(),Math.random(),Math.random()));
		text2.setOpacity(Math.random());
		text2.setRotate(90);
		
		text3.setFont(Font.font("Times Roman", FontWeight.BOLD, FontPosture.ITALIC, 22));
		text3.setTextFill(Color.color(Math.random(),Math.random(),Math.random()));
		text3.setOpacity(Math.random());
		text3.setRotate(90);
		
		text4.setFont(Font.font("Times Roman", FontWeight.BOLD, FontPosture.ITALIC, 22));
		text4.setTextFill(Color.color(Math.random(),Math.random(),Math.random()));
		text4.setOpacity(Math.random());
		text4.setRotate(90);
		
		text5.setFont(Font.font("Times Roman", FontWeight.BOLD, FontPosture.ITALIC, 22));
		text5.setTextFill(Color.color(Math.random(),Math.random(),Math.random()));
		text5.setOpacity(Math.random());
		text5.setRotate(90);
		
		//add text to the pane
		pane.getChildren().addAll(text1,text2,text3,text4,text5);
		
		//set and show the scene
		Scene scene = new Scene(pane, 260, 120);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Programming Exercise 8 - Exercise 4");
		primaryStage.show();
		
	}
}
