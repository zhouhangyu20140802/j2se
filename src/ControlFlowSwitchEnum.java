import java.util.*;
public class ControlFlowSwitchEnum {
	public static void main(String[] args) {
		for (HeroType heroType : HeroType.values()) {
			switch (heroType){
			case TANK:
				System.out.println("̹��");
				break;
			case WIZARD:
				System.out.println("��ʦ");
				break;
			case ASSASSIN:
				System.out.println("�̿�");
				break;
			case WARRIOR:
				System.out.println("սʿ");
				break;
			case RANGED:
				System.out.println("Զ��");
				break;
			case PUSH:
				System.out.println("�ƽ�");
				break;
			case FARMING:
				System.out.println("��Ұ");
				break;
			}
		}
		
	}
}
