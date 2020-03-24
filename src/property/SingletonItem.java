package property;

public class SingletonItem {
	//private constructor
	private SingletonItem() {
		// TODO Auto-generated constructor stub
		System.out.println("construct a new instance.");
	}	
	private static SingletonItem singletonItem = new SingletonItem();
	
	public static SingletonItem getInstance() {
		return singletonItem;
	}
	public static void main(String[] args) {
		SingletonItem s1 = new SingletonItem();
		
	}
}
