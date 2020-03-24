import java.util.*;
public class ControlFlowFor {
	public static void main(String[] args) {
		System.out.println("请输入乞丐乞讨天数：");
		Scanner userInput = new Scanner(System.in);
		int userInt = userInput.nextInt();
		long money = 1;
		for (int i = 1; i < userInt; i++) {
			money *= 2;
		}
		System.out.println("共乞讨得到的钱数是："+money);
	}
}
