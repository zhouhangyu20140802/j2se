import java.util.*;
public class ControlFlowWhile {
	public static void main(String[] args) {
		System.out.println("������һ��������");
		Scanner userInput = new Scanner(System.in);
		int userInt = userInput.nextInt();
		long multiNumber = 1;
		while(userInt>0){
			multiNumber *= userInt ;
			userInt--;			
		}
		System.out.println("�׳��ǣ�"+multiNumber);
	}
}
