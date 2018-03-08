package com.agreotech.service;

public interface IService<T, Pk> {
	
	public T getElementById(Pk pk);
	
	public boolean updateElement(T t);
	
	public void createElement(T t);
	
	public void deleteElementById(Pk pk);
	
}
