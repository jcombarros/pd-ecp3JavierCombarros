package es.jab.model.dao.impl;

import java.util.List;
import java.util.Map;

import es.jab.model.dao.GenericDAO;

public abstract class GenericDAOImpl<T> implements GenericDAO<T> {
	
	private Map<Integer, T> db;
	

	public abstract Integer getId(T entity);

	@Override
	public void create(T entity) {
		this.db.put(this.getId(entity), entity);
	}


	@Override
	public T read(int id) {
		return this.db.get(new Integer(id));
	}

	@Override
	public void update(T entity) {
		this.db.put(this.getId(entity), entity);
		
	}

	@Override
	public void delete(T entity) {
		this.db.remove(this.getId(entity));
		
	}

	@Override
	public void deleteById(int id) {
		this.db.remove(new Integer(id));
	}

	@Override
	public List<T> findAll() {
		return (List<T>)this.db.values();
	}

}
