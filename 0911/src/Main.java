import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("x1 = ");
		int x1 = sc.nextInt();
		System.out.print("x2 = ");
		int x2 = sc.nextInt();
		System.out.print("y1 = ");
		int y1 = sc.nextInt();
		System.out.print("y2 = ");
		int y2 = sc.nextInt();
		
		boolean result = inRect(x1, y1, x2, y2, 100, 100, 200, 200);
		String resultStr="";
		
		if (result == true) {
			resultStr = "겹침";
		} else {
			resultStr = "겹치지 않음";
		}

		System.out.println("결과는 : " + resultStr);

		sc.close();
		
		
		
	}

	public static boolean inRect(int x1, int y1, int x2, int y2, int rectx1, int recty1, int rectx2, int recty2) {
		
		if (((x1 < rectx1) && (x2<rectx2)) || ((x1>rectx1) && (x2>rectx2))) {
		return false;}
		
		if ((y1<recty1 && y2<recty2) || (y1 > recty1 && y2 > recty2)) {
			return false;
		}

		return true;
	}
}
