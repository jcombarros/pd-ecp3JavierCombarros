package es.jab.model.dao;

import java.util.List;

public interface GenericDAO<T> {
	
	public void create(T entity);
	
	public T read(int id);
	
	public void update(T entity);
	
	public void delete(T entity);
	
	public void deleteById(int id);
	
	public List<T> findAll();
	
}
