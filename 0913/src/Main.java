import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("원의 중심과 반지름 입력 : ");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double r = sc.nextDouble();
		
		System.out.println("점 입력 : ");
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		
		sc.close();
		
		double result = ((a-x)*(a-x)) + ((b-y)*(b-y));
		
		if(Math.sqrt(result)<r)
		{
			System.out.println("점" + "(" + x + "," + y + ")" +"는 원안에있다");
		}
		
		
		
	}

}
