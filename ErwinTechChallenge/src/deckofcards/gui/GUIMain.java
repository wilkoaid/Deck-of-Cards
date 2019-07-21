package deckofcards.gui;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class GUIMain extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		Controller control = new Controller(stage);
		stage.setScene(new Scene(control));
		stage.setTitle("Deck of Cards");
		stage.setWidth(600);
		stage.setHeight(400);
		stage.show();
		
	}

}
