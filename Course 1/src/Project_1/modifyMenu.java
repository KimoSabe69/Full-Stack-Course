package Project_1;

class modifyMenu extends homeMenu {
	int option;
	void Menu() {
		System.out.println("What would you like to do?\n1 - Add A New File\n2 - Delete An Existing File\n3 - Search For An Existing File\n4 - Return to the Main Menu");
		option = scan.nextInt();
		fileHandler modifier = new fileHandler();

		if (option == 1) {
			modifier.add();
		}
		else if (option == 2) {
			modifier.delete();
		}
		else if (option == 3) {
			modifier.search();
		}
		else if (option == 4) {
		}
		
		else {
			System.out.println("Invalid selection.\nPlease choose option 1, 2, 3 or 4\nand enter the approptiate number.\n");
			modifyMenu remenu = new modifyMenu();
			remenu.Menu();
		}
		
	}
}