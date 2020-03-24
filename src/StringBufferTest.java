import java.util.*;
public class StringBufferTest {
	
	public static String randomString(int STRINGLENGTH) {
		Random ascii = new Random();
		char[] randomCharArray = new char[STRINGLENGTH];
		for (int i = 0; i < STRINGLENGTH; i++) {
			int asciiNumber  = ascii.nextInt(93)+33;
			randomCharArray[i] = (char)asciiNumber;
			//System.out.println(randomCharArray[i]);
		}
		String randomString = new String(randomCharArray); 
		return randomString;
	}

	public static void main(String[] args) {

		String randomString = randomString(20); 
		System.out.println(randomString);
	}


}
