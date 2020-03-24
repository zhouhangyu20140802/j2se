package property;
public class Armor extends Item{
	int ac;
//	public static void main(String[] args) {
//		Armor clothArmor = new Armor();
//		clothArmor.ac = 15;
//		clothArmor.price = 300;
//		Armor chainMail = new Armor();
//		chainMail.ac = 40;
//		chainMail.price = 500;
//	}
	public String toString() {
		return (this.name+this.price);
	}
	
	public void finalize() {
		System.out.println("current objetc has been recycled.");
	}
	
	public boolean equals(Object o) {
		return (o instanceof Item);
	}
	
	@Override
	public boolean disposable() {
		// TODO Auto-generated method stub
		return false;
	}
}
