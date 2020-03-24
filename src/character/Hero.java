package character;
import property.*;

public class Hero {
	String name;
	int hp;
	int mp;
	int moveSpeed;
	Armor armor;
	
	public Hero(String name, int hp){
		this.name = name;
		this.hp = hp;
		//System.out.println("这是一个两参数构造方法！");
	}
	
	public Hero(String name, int hp, int mp, int moveSpeed){
		this(name,hp);
		this.mp = mp;
		this.moveSpeed = moveSpeed;
		//System.out.println("这是一个四参数构造方法！");
	}
	
	public void equipArmor(Armor am) {
		// TODO Auto-generated method stub
		this.armor = am;
	}
	
	public static void battleWin() {
		// TODO Auto-generated method stub
		System.out.println("We have win the battle.");
	}
	
	private void selfHeal(int bottle) {
		// TODO Auto-generated method stub
		hp = hp + bottle;
		bottle = 0;
	}
	 public void revive(Hero h){
	        h = new Hero("提莫",383);
	    }
	 public void kill(Mortal m) {
		m.die();
	}
	 
	public static void main(String[] args) {
	Hero garen = new Hero("garen", 2000);
	ADHero h1 = new ADHero("h1", 300);
	APHero h2 = new APHero("h2", 500, 50);
	garen.kill(h1);
	garen.kill(h2);
	}
}
