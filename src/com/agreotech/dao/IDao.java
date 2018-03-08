package com.agreotech.dao;

public interface IDao<T, Pk> {
	
	public void create(T t);
	
	public T read(Pk pk);
	
	public boolean update(T t);
	
	public void delete(Pk pk);
	

}