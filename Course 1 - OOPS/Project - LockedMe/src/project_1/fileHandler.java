package project_1;

import java.io.File;
import java.io.IOException;

class fileHandler extends homeMenu {
	String fileName;
	String directoryPath = "";
	String filePath;
	void begin() {
		if (directoryPath.isEmpty()) {
			System.out.println("Please enter your desired working directory:\n");
			directoryPath = scan.nextLine();
		}
		
		System.out.println(directoryPath + "\n");
		System.out.println("Please enter file name with file extension:\n");
		fileName = scan.nextLine();
		filePath = directoryPath.concat(fileName);
	}
	
	void modify() {
		modifyMenu modify = new modifyMenu();
		modify.Menu();
	}
	
	void viewFiles() {
		System.out.println("Here are all your files in your directory:");
		String directoryPath = "//Users//x//Full Stack Course//";
		File directory = new File(directoryPath);
	    //List of all files and directories
	    String contents[] = directory.list();
	    for(int i=0; i<contents.length; i++) {
	    	String filePath = directoryPath.concat(contents[i]);
	    	File file = new File(filePath);
	    	if (file.isFile()) {
	    		System.out.println(contents[i]);
	    	}
	    }
	}
	
	void add() {
		begin();
		File file = new File(filePath);
		try{
			System.out.println(filePath);
			if(file.createNewFile()) {
				System.out.println("\n" + file.getName() + " Added\n");
			}
			else {
				System.out.println("File already exists.\n");
				
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
		File file = new File(filePath);
	    if (file.delete()) { 
	        System.out.println("\n" + file.getName() + " Deleted.\n");
	      }
	    else {
	        System.out.println("The attempt to delete was unsuccessful\n");
	      } 
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
		    		System.out.println(fileName + " was poes found.\n");
		    		break;
		    	}
		    }
		    if (found) {
		    	System.out.println(fileName + " was found succesfully!\n");
		    }
		    else if (!found){
		    	System.out.println(fileName + " was not found.\n");
		    }
		    
		}

		finally {
			System.out.println("\n");
			modify();
		}
	}
}

