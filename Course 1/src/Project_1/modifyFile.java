package Project_1;

import java.io.File;
import java.io.IOException;

class modifyFile extends modifyMenu{
	String fileName;
	String directoryPath = "";
	String pathName;
	void begin() {
		if (directoryPath.isEmpty()) {
			System.out.println("Please enter your desired working directory:\n");
			directoryPath = scan.nextLine();
		}
		
		System.out.println(directoryPath + "\n");
		System.out.println("Please enter file name with file extension:\n");
		fileName = scan.nextLine();
		pathName = directoryPath.concat(fileName);
	}
	
	void modify() {
		modifyMenu modify = new modifyMenu();
		modify.Menu();
	}
	
	void add() {
		begin();
		File file = new File(pathName);
		try{
			System.out.println(pathName);
			if(file.createNewFile()) {
				System.out.println("\n" + file.getName() + " Added\n");
			}
			else {
				System.out.println("File already exists.");
				
			}
			
		}
		catch (IOException error) {  
            error.printStackTrace();  
        }  
		finally{
			
			modify();
		}
	}
	
	void delete() {
		begin();
		File file = new File("//Users//x//Full Stack Course//Hello.txt");
	    if (file.delete()) { 
	        System.out.println("\n" + file.getName() + " Deleted");
	      }
	    else {
	        System.out.println("The attempt to delete was unsuccessful");
	      } 

		System.out.println(fileName + " Deleted\n");
		modify();
	}
	
	void search() {
		
		begin();
		File directory = new File(directoryPath);
		try {
			System.out.println("Searching...\n");
			String contents[] = directory.list();
		    boolean found = false;
		    for(int i=0; i < contents.length; i++) {
		    	if (contents[i] == fileName) {
		    		found = true;
		    		break;
		    	}
		    }
		    if (found) {
		    	System.out.println(fileName + " was found succesfully");
		    }
		    else if (!found){
		    	System.out.println(fileName + " was found succesfully");
		    	
		    }
		    
		}

		finally {
			System.out.println("Finally\n");
			modify();
		}
	}
}
