package es.jab.model.entities;

public class Round {
	
	private static int idCounter = 0;
	
	private int id;
	
	private String deckOfCard;
	
	public Round(String deckOfCard){
		this.setDeckOfCard(deckOfCard);
		this.id = Round.idCounter++;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDeckOfCard() {
		return deckOfCard;
	}

	public void setDeckOfCard(String deckOfCard) {
		this.deckOfCard = deckOfCard;
	}

}
