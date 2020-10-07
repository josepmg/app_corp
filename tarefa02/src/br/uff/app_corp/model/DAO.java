package br.uff.app_corp.model;

import java.util.List;

public interface DAO {

	public void create(Object obj) throws Exception;
	public Object getById(int id) throws Exception;
	public List<Object> getAll() ;
	public void update(Object obj) throws Exception;
	public void delete(Object obj) throws Exception;
	
}
