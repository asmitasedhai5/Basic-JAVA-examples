package com.usermanagement.dao;

import java.util.List;

public interface GenericDAO<T>{
	public void insert(T t);
	public void selectId(int id);
	public void update(T t);
	public void delete(T t);
	public List display();
	



}
