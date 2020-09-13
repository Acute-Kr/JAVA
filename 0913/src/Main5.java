import java.util.Scanner;

public class Main5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("¼ıÀÚ : ");
		int a = sc.nextInt();
		
		sc.close();
		
		for (int i = 0; i < a; i++) {

			for (int j = 0; j < a-i-1 ; j++) {

				System.out.print(" ");
			}
			
			for (int j = 0; j < 1+2*i ; j++) {

				System.out.print("*");
			}
			
			System.out.println();
		}

	}

}
