import java.util.*;
import java.math.*;
public class Array {
	public static void main(String[] args) {
		int[] testArray;
		testArray = new int[5];
		for (int i = 0; i < testArray.length; i++) {
			testArray[i] = (int) (Math.random()*100);
			System.out.println(testArray[i]);
		}
		int minNumber = testArray[0];
		for (int i = 0; i < testArray.length; i++) {
			if (minNumber >= testArray[i]){
				minNumber = testArray[i];
			}
		}
		System.out.println(minNumber);
	}
}
