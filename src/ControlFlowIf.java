import java.util.*;
public class ControlFlowIf {
	public static void main(String[] args) {
		System.out.print("���������(m)��");
		Scanner height = new Scanner(System.in);
		float userHeight = height.nextFloat();
		System.out.print("����������(kg)��");
		Scanner weight = new Scanner(System.in);
		float userWeight = weight.nextFloat();
		float BMI = userWeight/(userHeight*userHeight);
		System.out.println("��ǰ��BMI�ǣ�" + BMI);
		String healthStatus = "";
		if (BMI<18.5){
			healthStatus = "���ع���";
		}
		else if(BMI<24){
			healthStatus = "������Χ";
		}
		else if(BMI<27){
			healthStatus = "���ع���";
		}
		else if(BMI<30){
			healthStatus = "��ȷ���";
		}
		else if(BMI<35){
			healthStatus = "�жȷ���";
		}
		else{
			healthStatus = "�ضȷ���";
		}
		System.out.println("����״̬�ǣ�"+healthStatus);
	}
}
