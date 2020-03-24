import character.*;
import property.*;
public class Test {
	public static void main(String[] args) {
//	//SingletonItem s1 = new SingletonItem();
//	SingletonItem s1 = SingletonItem.getInstance();
//	SingletonItem s2 = SingletonItem.getInstance();
//	SingletonItem s3 = SingletonItem.getInstance();
//	System.out.println(s1==s2);
//	System.out.println(s2==s3);
		ADHero warrior = new ADHero("warrior", 500);
		APHero wizard = new APHero("wizard", 300, 100);
		warrior.attack();
		wizard.attack();
		System.out.println(warrior instanceof ADHero);
		System.out.println(wizard instanceof APHero);
		MagicPotion m1 = new MagicPotion();
		m1.effect();		
		Hero h1 = new Hero("black widow",20);
		Hero h2 = new Hero("black widow",20);
		System.out.println(h2.equals(h2));
	
	}
}
