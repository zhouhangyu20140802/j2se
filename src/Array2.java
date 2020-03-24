import java.util.*;
import java.math.*;
public class Array2 {
	public static void main(String[] args) {
		int[] testArray;
		testArray = new int[5];
		Random r = new Random();
		for (int i = 0; i < testArray.length; i++) {
			testArray[i] = r.nextInt(100);
			System.out.print(testArray[i] + " ");
		}
		int tempNumber = 0;
		int testArrayLength = testArray.length;
		for (int i = 0; i <= (testArray.length/2); i++) {
			
				tempNumber = testArray[i];
				testArray[i] = testArray[testArrayLength-1];
				testArray[testArrayLength-1] = tempNumber; 
				testArrayLength--;
			
		}
		System.out.println("");
		for (int i = 0; i < testArray.length; i++) {
			System.out.print(testArray[i]+" ");
		}
		
		int maxNumber = testArray[0];
		for (int i : testArray) {
			if (i>maxNumber) {
				maxNumber = i;
			}
		}
		System.out.println("");
		System.out.println(maxNumber);
	}
}
