package es.jab.model.dao;

public abstract class DAOFactory {
	
	protected static DAOFactory daoFactory = null;


    private DAOFactory (){
    }


	public static DAOFactory getDaoFactory() {
		return daoFactory;
	}
	
	public abstract PlayerDAO getPlayerDAO();
	
	public abstract RoundDAO getRoundDAO();
	
	public abstract AdministratorDAO getAdministratorDAO();
    
    

}
