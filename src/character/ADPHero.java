package character;

public class ADPHero extends Hero implements AD,AP{
	public ADPHero(String name, int hp,int mp) {
		// TODO Auto-generated constructor stub
		super(name,hp);
	}
	
	public void attack() {
		System.out.println("a magical attack!");
	}
	
	public void die() {
		System.out.println("APHero die!");
	}

}
