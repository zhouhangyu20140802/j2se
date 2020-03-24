package animal;

public abstract class Animal {
	protected int legs;
	
	protected Animal(int legs) {
		// TODO Auto-generated constructor stub
		this.legs = legs;
	}
	
	public Animal() {
		// TODO Auto-generated constructor stub
	}
	
	public abstract void eat();
	
	public void walk() {
		// TODO Auto-generated method stub
		System.out.println("this animal use" + this.legs + "legs for walking.");
	}
	
}
