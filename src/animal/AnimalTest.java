package animal;

public class AnimalTest {
	public static void main(String[] args) {
		Spider s1= new Spider();
		System.out.println(s1.legs);
		s1.eat();
		Cat c1 = new Cat("mimi");
		System.out.println(c1.getName());
		c1.setName("miaomiao");
		System.out.println(c1.getName());
		System.out.println(c1.legs);
		Fish f1= new Fish();
		f1.setName("big brother");
		System.out.println(f1.getName());
		f1.play();
		f1.eat();
		f1.walk();
		
	}
}
