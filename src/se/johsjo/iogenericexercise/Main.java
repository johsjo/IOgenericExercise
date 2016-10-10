package se.johsjo.iogenericexercise;

import java.util.ArrayList;
import java.util.List;


import se.johsjo.iogenericexercise.model.User;
import se.johsjo.iogenericexercise.storage.FileStorage;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FileStorage fileStorage = new FileStorage();
		
		List<User> userList = new ArrayList<>();
			userList.add(new User("Urban", "10001"));
			userList.add(new User("Peter","10002"));
//		
//			fileStorage.add(new User("Anne", "1007"));
			fileStorage.addList(userList);
			
	}

}
