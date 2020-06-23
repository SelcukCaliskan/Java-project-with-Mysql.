package tr.com.selcuk.interfaces;

import java.util.List;

public interface IDataAccessLayer<T> {
	
	
	public void insert(T constract);
	public void update(T contract);
	public void delete(T constract);
	public List<T> getList(T constract);
	public T getById(int id);
	

}
