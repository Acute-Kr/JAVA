import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("���� �߽ɰ� ������ �Է� : ");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double r = sc.nextDouble();
		
		System.out.println("�� �Է� : ");
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		
		sc.close();
		
		double result = ((a-x)*(a-x)) + ((b-y)*(b-y));
		
		if(Math.sqrt(result)<r)
		{
			System.out.println("��" + "(" + x + "," + y + ")" +"�� ���ȿ��ִ�");
		}
		
		
		
	}

}
