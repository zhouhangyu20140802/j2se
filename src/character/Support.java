package character;
public class Support extends Hero implements Healer{
	public Support(String name,int hp) {
		// TODO Auto-generated constructor stub
		super(name,hp);
	}
	
	public void heal() {
		System.out.println("��Ӣ�۽���������");
	}
	public static void main(String[] args) {
		Support littleChick = new Support("littleChink", 200);
		littleChick.heal();
	}
	
}
