package es.jab.model.dao.impl;

import java.util.List;

import es.jab.model.dao.RoundDAO;
import es.jab.model.entities.Administrator;
import es.jab.model.entities.Round;

public class RoundDAOImpl extends GenericDAOImpl<Round> implements RoundDAO {

	@Override
	public Integer getId(Round entity) {
		return new Integer(entity.getId());
	}

}
