package character;

public class APHero extends Hero implements AttackMethod,Mortal{
	public APHero(String name, int hp,int mp) {
		// TODO Auto-generated constructor stub
		super(name,hp);
	}
	
	public void attack() {
		System.out.println("a magical attack!");
	}
	
	public void die() {
		System.out.println("APHero die!");
	}
	public static void battleWin() {
		System.out.println("APheroes have win the battle!");
	}
	
	public void finalize(){
        System.out.println("这个英雄正在被回收");
    }
}
