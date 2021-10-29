package Project_1;

import java.io.File; 
import java.io.IOException; 
import java.io.RandomAccessFile; 
import java.lang.NumberFormatException;
import java.util.Scanner;

public class LockedMe {
	Scanner scan = new Scanner(System.in);
	static boolean welcome = true;

	static void Welcome() {
		if(welcome) {
			System.out.println("Welcome to LockedMe.com! ~ Kimon Savvas\n");
			welcome = false;
		}
	}
	
	public static void main(String[] args) {
		homeMenu home = new homeMenu();
		Welcome();
		home.Menu();
		LockedMe restart = new LockedMe();
		restart.main(null);

	}

}

class exitProgramme {
	void leave() {
		System.exit(1);
	}
}
