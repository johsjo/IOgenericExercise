package se.johsjo.iogenericexercise.storage;

public interface FileStorageInfo<T> {

	String getSingleFileName(T type);

	String getCollectionsFileName();

	String directoryName();

	String objSaveInfo();

}
