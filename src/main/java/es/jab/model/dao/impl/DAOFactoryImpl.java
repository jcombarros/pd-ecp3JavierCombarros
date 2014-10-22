package es.jab.model.dao.impl;

import es.jab.model.dao.AdministratorDAO;
import es.jab.model.dao.DAOFactory;
import es.jab.model.dao.PlayerDAO;
import es.jab.model.dao.RoundDAO;

public class DAOFactoryImpl extends DAOFactory {
	
	private PlayerDAO playerDAO;
	private AdministratorDAO administratorDAO;
	private RoundDAO roundDAO;
	
	public DAOFactoryImpl(){
		super();
		this.playerDAO = new PlayerDAOImpl();
		this.administratorDAO = new AdministratorDAOImpl();
		this.roundDAO = new RoundDAOImpl();
	}
	
	public static DAOFactory getDaoFactory(){
        if(DAOFactory.daoFactory == null){
        	DAOFactory.daoFactory = new DAOFactoryImpl();
        }
         return DAOFactory.daoFactory;
    }

	@Override
	public PlayerDAO getPlayerDAO() {
		return this.playerDAO;
	}

	@Override
	public RoundDAO getRoundDAO() {
		return this.roundDAO;
	}

	@Override
	public AdministratorDAO getAdministratorDAO() {
		return this.administratorDAO;
	}

}
