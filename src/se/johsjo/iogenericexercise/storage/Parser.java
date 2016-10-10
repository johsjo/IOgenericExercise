package se.johsjo.iogenericexercise.storage;

public interface Parser<T> {
	
	   T toType(String line);

	   String toLine(T type);
}
