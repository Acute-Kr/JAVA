import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("ù��° ���� �߽ɰ� ������ �Է� : ");
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		int r1 = sc.nextInt();
		
		System.out.println("�ι�° ���� �߽ɰ� ������ �Է� : ");
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();
		int r2 = sc.nextInt();
		
		sc.close();
		
		int d = (int) Math.sqrt(((x1-x2)*(x1-x2))+((y1-y2)*(y1-y2)));
		
		if (d<r1+r2) {
			System.out.println("�� ���� ���� ��ģ��");
		}
		
		
	}

}
