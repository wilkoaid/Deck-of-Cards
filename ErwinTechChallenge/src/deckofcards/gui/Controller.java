package deckofcards.gui;

import java.io.IOException;

import deckofcards.Card;
import deckofcards.Deck;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Controller extends BorderPane {
	private Stage stage;
	private Deck deck;
	private ObservableList<Card> deckCards = FXCollections.observableArrayList();
	private ObservableList<Card> handCards = FXCollections.observableArrayList();
	
	@FXML private Button shuffleButton;
	@FXML private Button drawButton;
	@FXML private Button sortButton;
	@FXML private Button resetButton;
	@FXML private Button quitButton;
	@FXML private TextField numDrawField;
	@FXML private ListView<Card> deckList;
	@FXML private ListView<Card> handList;
	
	public Controller(Stage stage) {
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("View.fxml"));
        fxmlLoader.setRoot(this);
        fxmlLoader.setController(this);
        
        this.stage = stage;
        this.stage.setMinHeight(450);
        this.stage.setMinWidth(600);
		this.deck = new Deck();
		
		
		try {
			fxmlLoader.load();
			
			setDeckList();
			
			shuffleButton.setOnMouseClicked(e -> {
				deck.shuffleDeck();
				setDeckList();
			});
			
			drawButton.setOnMouseClicked(e -> {
				
				try {
					int n = Integer.parseInt(numDrawField.getText());
					handCards.addAll(deck.draw(n));
					handList.setItems(handCards);
					setDeckList();
					numDrawField.clear();
				} catch (NumberFormatException e1) {
					return;
				}
			});
			
			sortButton.setOnMouseClicked(e -> {
				deck.sortCards(handCards);
				handList.setItems(handCards);
			});
			
			
			resetButton.setOnMouseClicked(e -> {
				deck.reset();
				setDeckList();
				handCards.clear();
			});
			
			quitButton.setOnMouseClicked(e -> {
				stage.close();
			});
		} catch (IOException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		
		
	}
	
	private void setDeckList() {
		deckCards.clear();
		deckCards.addAll(deck.getDeck());
		deckList.setItems(deckCards);
	}
	
}
