package se.johsjo.iogenericexercise.storage;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import se.johsjo.iogenericexercise.model.User;

public class FileStorage<T extends FileStorageInfo<T>> implements Storage<T> {

	private final UserParser userParser = new UserParser();

	@Override
	public void add(T value) {

		// check if folder exists
		folderExist();

		List<T> objList = new ArrayList<>();
		objList.add(value);
		writer(objList);
	}

	@Override
	public void addList(List<T> value) {
		folderExist();
		writer(value);
		

	}

	@Override
	public List<T> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	//// private Methods.
	private void inputFile(T type, String fileData) {

		// try(){
	}

	private T reader() {

		try (BufferedReader bReader = new BufferedReader(new FileReader(userParser.directoryName()))) {

		} catch (FileNotFoundException e) { // TOTO one line exception
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}

		return null;
	}

	private void writer(List<T> objList) {

		
		
//		for (T oL : objList) {
			try {
				
				if(objList.size() < 1){
				
					String path = userParser.directoryName() + userParser.getSingleFileName(objList.get(0));
	
					File file = new File(path);
	
					BufferedWriter bWriter = new BufferedWriter(new FileWriter(path));
	
					String text = userParser.toLine((User) objList.get(0));
					bWriter.write(text);
					bWriter.close();
				}else{
					
					
					String path = userParser.directoryName() + userParser.getCollectionsFileName();
					
					BufferedWriter bWriter = new BufferedWriter(new FileWriter(path));
					for(T oLcol :objList){
						
						String text = userParser.toLine((User) oLcol);
						bWriter.write(text  + "\n");
					}
					bWriter.close();
					//FOR ALLA OBJ
					//WRITE.
					
					
				}
				
				
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	

	private void folderExist() {

		File file = new File(userParser.directoryName());

		if (file.exists()) {
			file.mkdir();
		}
	}

}
