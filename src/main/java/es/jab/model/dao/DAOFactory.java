package es.jab.model.dao;

public abstract class DAOFactory {
	
	protected static DAOFactory daoFactory = null;


    public DAOFactory (){
    }
    
	public abstract PlayerDAO getPlayerDAO();
	
	public abstract RoundDAO getRoundDAO();
	
	public abstract AdministratorDAO getAdministratorDAO();
    
    

}
