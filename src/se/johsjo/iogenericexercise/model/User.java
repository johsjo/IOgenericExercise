package se.johsjo.iogenericexercise.model;

import se.johsjo.iogenericexercise.storage.FileStorageInfo;

public class User<T> implements FileStorageInfo<T>{
	private String id;
	private String userName;
	private final static String PATH = "user/";
	
	public User(String userName, String id) {
		this.id = id;
		this.userName = userName;
	}
	
	public String getUserName() {
		return userName;
	}

	public String getId() {
		return id;
	}
	
	public static String getPath() {
		return PATH;
	}

	@Override
	public String getSingleFileName(T type) {
		
		return id + userName;
	}

	@Override
	public String getCollectionsFileName() {
		return "users";
	}

	@Override
	public String directoryName() {
		return "user/";
	}

	@Override
	public String objSaveInfo() {
		return id + "/" + userName;
	}
	
}
