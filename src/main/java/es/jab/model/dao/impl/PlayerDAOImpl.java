package es.jab.model.dao.impl;

import java.util.List;

import es.jab.model.dao.PlayerDAO;
import es.jab.model.entities.Player;

public class PlayerDAOImpl extends GenericDAOImpl<Player> implements PlayerDAO {

	@Override
	public Integer getId(Player entity) {
		return new Integer(entity.getId());
	}


}
