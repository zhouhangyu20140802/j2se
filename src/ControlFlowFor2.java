import java.util.*;
public class ControlFlowFor2 {
	public static void main(String[] args) {
		int printNumber = 100;
		for (int i = 1; i <= printNumber; i++) {
			if ((i%3!=0) && (i%5!=0)){
				System.out.println(i);
			}
		}
	}
}
