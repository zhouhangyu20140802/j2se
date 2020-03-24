import java.util.*;
public class ControlFlowSwitchEnum {
	public static void main(String[] args) {
		for (HeroType heroType : HeroType.values()) {
			switch (heroType){
			case TANK:
				System.out.println("坦克");
				break;
			case WIZARD:
				System.out.println("巫师");
				break;
			case ASSASSIN:
				System.out.println("刺客");
				break;
			case WARRIOR:
				System.out.println("战士");
				break;
			case RANGED:
				System.out.println("远程");
				break;
			case PUSH:
				System.out.println("推进");
				break;
			case FARMING:
				System.out.println("打野");
				break;
			}
		}
		
	}
}
