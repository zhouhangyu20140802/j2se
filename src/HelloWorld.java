import java.util.Scanner;
public class HelloWorld {
	String name = "";
	protected int age = 5;
	String gender = "Male";
	int j = 20;
	private void pv(final int j) {
		// TODO Auto-generated method stub
		System.out.println(age);
		{
			//j = 19;
			System.out.println(j);
			
		}
		System.out.println(j);
	}
	public static void main(String[] args){
//		System.out.println("hello world!");	
//		int i = 20;
//		byte b = 1;
//		long l = 300;
//		i = b;
		//System.out.println(age);
		HelloWorld jerry = new HelloWorld();
		jerry.age = 10;
		System.out.println(jerry.age);
		jerry.pv(90);
//		Scanner scannerFirst = new Scanner(System.in);
//		int firstInt = scannerFirst.nextInt();
//		System.out.println("第一个整数："+ firstInt);		
//		Scanner scannerSecond = new Scanner(System.in);
//		int secondInt = scannerFirst.nextInt();
//		System.out.println("第二个整数："+secondInt);
//		//String firstString = scanner.next();
//		//String secondString = scanner.next();
//		boolean resultMore = (firstInt > secondInt);
//		boolean resultMoreEql = (firstInt >= secondInt);
//		boolean resultLess = (firstInt < secondInt);
//		boolean resultLessEql = (firstInt <= secondInt);
//		boolean resultEql = (firstInt == secondInt);
//		boolean resultNotEql = (firstInt != secondInt);
//		System.out.println("比较"+firstInt+">"+secondInt+":"+resultMore);
//		System.out.println("比较"+firstInt+">="+secondInt+":"+resultMoreEql);
//		System.out.println("比较"+firstInt+"<"+secondInt+":"+resultLess);
//		System.out.println("比较"+firstInt+"<="+secondInt+":"+resultLessEql);
//		System.out.println("比较"+firstInt+"=="+secondInt+":"+resultEql);
//		System.out.println("比较"+firstInt+"!="+secondInt+":"+resultNotEql);
		//System.out.println(secondString);
		int i = 1;
		i+=++i;
		System.out.println(i);
		boolean b = !(i++ == 3) ^ (i++ ==2) && (i++==3);
		System.out.println(b);
		System.out.println(i);
	}
}
