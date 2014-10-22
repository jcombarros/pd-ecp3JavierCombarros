package es.jab.model.entities;

public class Player extends User {
	
	private int numRounds;

	public Player(String name, String password) {
		super(name, password);
		this.numRounds = 0;
	}

	public int getNumRounds() {
		return numRounds;
	}

}
