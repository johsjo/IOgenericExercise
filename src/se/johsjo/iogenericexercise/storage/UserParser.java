package se.johsjo.iogenericexercise.storage;

import se.johsjo.iogenericexercise.model.User;

public final class UserParser<T> implements Parser<User>, FileStorageInfo<T> {

	public User toType(String line) {

		String[] parts = line.split("/"); // dela upp textsträngen

		String id = parts[0];
		String username = parts[1];

		return new User(id, username);
	}

	public String toLine(User user) {
		return String.format("%s;%s", user.getId(), user.getUserName());
	}

	@Override
	public String getSingleFileName(T type) {
		
		User user = (User) type;
		
		return user.getId() + user.getUserName();
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
		// TODO Auto-generated method stub
		return null;
	}
	


}
