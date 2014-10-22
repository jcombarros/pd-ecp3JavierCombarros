package es.jab.model.entities;

public abstract class User {
	
	private static int idCounter = 0;
	
	private int id;
	
	private String name;
	
	private String password;
	
	public User(String name, String password){
		this.setName(name);
		this.setPassword(password);
		this.id = User.idCounter++;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
