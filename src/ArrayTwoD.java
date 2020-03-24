import java.util.*;
import java.math.*;
public class ArrayTwoD {
	public static void main(String[] args) {
		int ARRAYLENGTH = 5;
		int [][] arrayTwoD = new int [ARRAYLENGTH][ARRAYLENGTH];
		Random randomNumber = new Random();
		int maxNumber = 0;
		for (int i = 0; i < arrayTwoD.length; i++) {
			for (int j = 0; j < arrayTwoD[0].length; j++) {
				arrayTwoD[i][j] = randomNumber.nextInt(100);
				System.out.print(arrayTwoD[i][j] + " ");
				if (maxNumber < arrayTwoD[i][j]){
					maxNumber = arrayTwoD[i][j];
				}
			}
			System.out.println("");
		}
		System.out.println(maxNumber);
		String arrayContent = Arrays.toString(arrayTwoD[0]);
		System.out.println(arrayContent);
	}
	
	
}
