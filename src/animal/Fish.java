package animal;

public class Fish extends Animal implements Pet{
	private String name;
	
	public Fish() {
		// TODO Auto-generated constructor stub
		this.legs = 0;
	}
	
	@Override
	public void walk() {
		// TODO Auto-generated method stub
		System.out.println("Fish cannot walk cause it has" + this.legs + "legs.");
	}
	
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Fish is eating");
	}
	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}
	
	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		this.name = name;
	}
	
	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Fish is playing!");
	}
	
}
