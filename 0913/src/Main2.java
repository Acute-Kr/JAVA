import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 원의 중심과 반지름 입력 : ");
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		int r1 = sc.nextInt();
		
		System.out.println("두번째 원의 중심과 반지름 입력 : ");
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();
		int r2 = sc.nextInt();
		
		sc.close();
		
		int d = (int) Math.sqrt(((x1-x2)*(x1-x2))+((y1-y2)*(y1-y2)));
		
		if (d<r1+r2) {
			System.out.println("두 원은 서로 겹친다");
		}
		
		
	}

}
