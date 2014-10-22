package es.jab.model.dao.impl;

import java.util.List;

import es.jab.model.dao.AdministratorDAO;
import es.jab.model.entities.Administrator;
import es.jab.model.entities.Player;

public class AdministratorDAOImpl extends GenericDAOImpl<Administrator> implements
		AdministratorDAO {

	@Override
	public Integer getId(Administrator entity) {
		return new Integer(entity.getId());
	}

}
