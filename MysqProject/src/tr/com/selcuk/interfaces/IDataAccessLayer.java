package tr.com.selcuk.interfaces;

import java.util.List;

public interface IDataAccessLayer<T> {
	
	
	public void insert(T contract);
	public void update(T contract);
	public void delete(T contract);
	public List<T> getList();
	public T getById(int id);
	

}
