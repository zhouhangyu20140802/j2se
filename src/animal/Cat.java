package animal;

public class Cat extends Animal implements Pet{
	String name;
	
	public Cat(String name) {
		// TODO Auto-generated constructor stub
		super.legs = 4;
		this.name = name;
	}
	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}
	
	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("The cat is playing");
	}
	
	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		this.name = name;
	}
	
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("The cat is eating");
	}
}
