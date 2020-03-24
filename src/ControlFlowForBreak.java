import java.util.*;
import java.math.*;
public class ControlFlowForBreak {
	public static void main(String[] args) {
		System.out.println("请输入本金：");
		Scanner userCapital = new Scanner(System.in);
		float Capital = userCapital.nextFloat();
		System.out.println("请输入年利率：");
		Scanner userProfit = new Scanner(System.in);
		float Profit = userProfit.nextFloat();
		System.out.println("请输储蓄时间（年）：");
		Scanner userYear = new Scanner(System.in);
		int Year = userYear.nextInt();
		float finalCapital = Capital;
		for (int i = 0; i < Year; i++) {
			finalCapital *= (1 + Profit);
		}
		System.out.println(Year + "年的复利收入是" + finalCapital);
		}
}
