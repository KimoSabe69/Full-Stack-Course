package Project_1;

class homeMenu extends LockedMe{ //extends LockedMe to inherit scan methods
	private int option;
	
	public int getOption() {
		return option;
	}
	public void setOption(int newOption) {
		option = newOption;
	}
	void Menu() {
		System.out.println("\nPlease select an option by entering the appropriate number:\n");
		System.out.println("1 - View all files.");
		System.out.println("2 - Add, delete or search for an existing file.");
		System.out.println("3 - Exit Programme.\n");
		int primary = scan.nextInt();
		setOption(primary);
		System.out.println("you chose:" + getOption() + "\n");
		
		if (option == 1) {
			fileHandler lister = new fileHandler();
			lister.viewFiles();
		}
		else if (option == 2) {
			modifyMenu modify = new modifyMenu();
			modify.Menu();
		}
		else if (option == 3) {
			System.out.println("Thanks for coming!");
			System.exit(1);
		}
		else {
			System.out.println("Invalid selection.\nPlease choose option 1, 2, or 3\nand enter the approptiate number.\n");
			Menu();
		}
	}
}