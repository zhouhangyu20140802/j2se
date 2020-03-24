package property;

public abstract class Item {
	public String name;
	public int price;
	
	public void effect() {
		// TODO Auto-generated method stub
		System.out.println("use the item, have an effect.");
	}
	
	public abstract boolean disposable();
}
