package es.jab.model.entities;

public class Administrator extends User {
	
	private String permission;

	public Administrator(String name, String password) {
		super(name, password);
		this.permission = "admin";
	}

	public String getPermission() {
		return permission;
	}

	public void setPermission(String permission) {
		this.permission = permission;
	}

}
