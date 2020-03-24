package character;

public class ADHero extends Hero implements AttackMethod,Mortal{
	public ADHero(String name,int hp) {
		// TODO Auto-generated constructor stub
		super(name,hp);
	}
	
	public void attack() {
		System.out.println("a physical attack!");
	}
	public void die() {
		System.out.println("ADHero die!");
	}
	
	public static void battleWin() {
		System.out.println("ADheroes have win the battle!");
	}
}
