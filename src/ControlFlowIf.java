import java.util.*;
public class ControlFlowIf {
	public static void main(String[] args) {
		System.out.print("请输入身高(m)：");
		Scanner height = new Scanner(System.in);
		float userHeight = height.nextFloat();
		System.out.print("请输入体重(kg)：");
		Scanner weight = new Scanner(System.in);
		float userWeight = weight.nextFloat();
		float BMI = userWeight/(userHeight*userHeight);
		System.out.println("当前的BMI是：" + BMI);
		String healthStatus = "";
		if (BMI<18.5){
			healthStatus = "体重过轻";
		}
		else if(BMI<24){
			healthStatus = "正常范围";
		}
		else if(BMI<27){
			healthStatus = "体重过重";
		}
		else if(BMI<30){
			healthStatus = "轻度肥胖";
		}
		else if(BMI<35){
			healthStatus = "中度肥胖";
		}
		else{
			healthStatus = "重度肥胖";
		}
		System.out.println("身体状态是："+healthStatus);
	}
}
