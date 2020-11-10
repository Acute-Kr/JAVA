import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		Scanner sc3 = new Scanner(System.in);
		

		String[] s = new String[10];
		String[] a = new String[10];
		String[] b = new String[10];

		for (int i = 0; i < 10; i++) {
			s[i] = "---";
			a[i] = "---";
			b[i] = "---";
		}

		System.out.println("명품콘서트홀 예약 시스템입니다.");

		for (;;) {

			System.out.println("예약" + ":" + "1 " + "조회" + ":" + "2 " + "취소" + ":" + "3 " + "끝내기" + ":" + "4 ");
			int x = sc.nextInt();
			
			if (x == 1) {
				System.out.println("S(1)"+ "A(2)" + "B(3)");
				int y = sc.nextInt();
				if (y == 1) {
					System.out.print("S>> ");
					for (int i = 0; i < s.length; i++) {
						System.out.println(s[i] + " ");
						System.out.println("이름>> ");
						String name = sc3.nextLine();
						System.out.println("번호>> ");
						int z = sc2.nextInt();
						s[z - 1] = name;
					}
				} else if (y == 2) {
					System.out.print("A>> ");
					for (int i = 0; i < s.length; i++) {
						System.out.println(s[i] + " ");
						System.out.println("이름>> ");
						String name = sc3.nextLine();
						System.out.println("번호>> ");
						int z = sc2.nextInt();
						a[z - 1] = name;
					}
				} else if (y == 3) {
					System.out.print("B>> ");
					for (int i = 0; i < s.length; i++) {
						System.out.println(s[i] + " ");
						System.out.println("이름>> ");
						String name = sc3.nextLine();
						System.out.println("번호>> ");
						int z = sc.nextInt();
						b[z - 1] = name;
					}
				}

			}
		

		if (x == 2) {
			System.out.println("S(1)"+ "A(2)" + "B(3)");
			int m = sc2.nextInt();

			if (m == 1) {
				for (int i = 0; i < 10; i++) {
					System.out.print(s[i] + " ");

				}
			}
			if (m == 2) {
				for (int i = 0; i < 10; i++) {
					System.out.print(a[i] + " ");

				}
			}
			if (m == 3) {
				for (int i = 0; i < 10; i++) {
					System.out.print(b[i] + " ");

				}
			}

		}
		if (x == 3) {
			System.out.println("S(1)"+ "A(2)" + "B(3)");
			int m = sc3.nextInt();

			if (m == 1) {
				for (int i = 0; i < 10; i++) {
					System.out.print(s[i] + " ");

				}
			}
			if (m == 2) {
				for (int i = 0; i < 10; i++) {
					System.out.print(a[i] + " ");

				}
			}
			if (m == 3) {
				for (int i = 0; i < 10; i++) {
					System.out.print(b[i] + " ");

				}
			}

			System.out.print("이름 ");
			String name = sc.nextLine();

			for (int i = 0; i < 10; i++) {

				if (s[i] == name) {
					s[i] = "---";
				}
				if (a[i] == name) {
					s[i] = "---";
				}
				if (b[i] == name) {
					s[i] = "---";
				}

			}
		}
		}
	}
}

		

	


