import java.util.*;
import java.math.*;
public class ArrayCopy {
	public static void main(String[] args) {
			Random randomLength = new Random();
			Random randomNumber = new Random();
			int arrayOneLength = randomLength.nextInt(5)+5;
			int arrayTwoLength = randomLength.nextInt(5)+5;
			int[] arrayOne = new int[arrayOneLength];
			int[] arrayTwo = new int[arrayTwoLength];
			for (int i = 0; i < arrayOneLength; i++) {
				arrayOne[i] = randomNumber.nextInt(100);
				System.out.print(arrayOne[i]+" ");
			}
			System.out.println("");
			for (int i = 0; i < arrayTwoLength; i++) {
				arrayTwo[i] = randomNumber.nextInt(100);
				System.out.print(arrayTwo[i]+" ");
			}
			System.out.println("");
			int arrayMergeLength = arrayOneLength + arrayTwoLength;
			int arrayMerge[] = new int [arrayMergeLength];
			System.arraycopy(arrayOne, 0, arrayMerge, 0, arrayOneLength);
			System.arraycopy(arrayTwo, 0, arrayMerge, arrayOneLength, arrayTwoLength);
			for (int i = 0; i < arrayMerge.length; i++) {
				System.out.print(arrayMerge[i]+" ");
			}
			
	}
}
