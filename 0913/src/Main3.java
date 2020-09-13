import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("¼ıÀÚ : ");
		int a = sc.nextInt();

		for (int i = 0; i < a; i++) {

			for (int j = i; j > 0; j--) {

				System.out.print("*");
			}

			System.out.println("");
		}

	}

}
