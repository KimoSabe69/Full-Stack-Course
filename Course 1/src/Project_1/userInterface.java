package Project_1;

class userInterface extends LockedMe{
	
	private String Collection(String any) {
		String val = scan.next();
		return val;
	}
	private int Collection() {
		int val = scan.nextInt();
		return val;
	}
	
	public String getCollection(String any) {
		Collection(any);	
	}
	public int getCollection(int any) {
		Collection(any);	
	}
	
	
}