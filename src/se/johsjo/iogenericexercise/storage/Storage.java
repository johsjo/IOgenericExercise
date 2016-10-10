package se.johsjo.iogenericexercise.storage;

import java.util.List;

public interface Storage<T> {

	public void add(T value);
	public void addList(List<T> value);
	
	List<T> getAll();
}
