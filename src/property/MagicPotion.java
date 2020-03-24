package property;

public class MagicPotion extends Item{
	@Override
	public void effect() {
		// TODO Auto-generated method stub
		//super.effect();
		System.out.println("user a magic potion. recover magic point.");
	}
	
	@Override
	public boolean disposable() {
		// TODO Auto-generated method stub
		return true;
	}
}
