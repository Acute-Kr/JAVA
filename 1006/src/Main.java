import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner num = new Scanner(System.in);
		Scanner str = new Scanner(System.in);

		String[] s = new String[10];
		String[] a = new String[10];
		String[] b = new String[10];

		for (int i = 0; i < 10; i++) {
			s[i] = "---";
			a[i] = "---";
			b[i] = "---";

		}

		System.out.println("명품콘서트홀 예약 시스템입니다.");
		
		while(true) {
		System.out.println("예약:1, " + "조회:2, " + "취소:3, " + "끝내기:4>> ");
		int x = num.nextInt();
		
		if(x==1) {
		System.out.println("좌석구분 S(1), A(2), B(3)>>");
		int y = num.nextInt();
			if(y==1) {
			for (int i = 0; i < 10; i++) {
			System.out.print(s[i] +" ") ;}
			System.out.println();
			System.out.println("이름>> ");
			String name = str.next();
			System.out.println("번호>>  ");
			int z = num.nextInt();
			s[z-1] = name;
			System.out.println();
			
		}
			else if(y==2) {
				for (int i = 0; i < 10; i++) {
					System.out.print(a[i] + " ");
					}	
				System.out.println();
				System.out.println("이름>> ");
				String name = str.next();
				System.out.println("번호>>  ");
				int z = num.nextInt();
				a[z-1] = name;
			}
			else if(y==3) {
				for (int i = 0; i < 10; i++) {
					System.out.print(b[i] + " ");
					}
				System.out.println();
				System.out.println("이름>> ");
				String name = str.next();
				System.out.println("번호>>  ");
				int z = num.nextInt();
				b[z-1] = name;
				System.out.println();
			}
			
		
		}
		
		else if(x==2) {
			for(int i =0; i<10 ; i++) { 
			System.out.print(s[i] + " ");
			}
			System.out.println();
			for(int i =0; i<10 ; i++) { 
				System.out.print(a[i] + " ");
				}
			System.out.println();
			for(int i =0; i<10 ; i++) { 
				System.out.print(b[i] + " ");
				}
			System.out.println();
			System.out.println("조회가 완료되었습니다");
			System.out.println();
		}
		
		else if(x==3) {
			System.out.println("좌석구분 S(1), A(2), B(3)>>");
			int seat = num.nextInt();
			
			System.out.println("이름>> ");
			String name = str.next();
			
			if(seat==1) {
				for(int i = 0; i <s.length; i++) {
					if(s[i].equals(name)) {
						s[i]="---";
					}
				}
			}
			else if(seat==2) {
				for(int i = 0; i <s.length; i++) {
					if(a[i].equals(name)) {
						a[i]="---";
					}
				}
			}
			else if(seat==3) {
				for(int i = 0; i <s.length; i++) {
					if(b[i].equals(name)) {
						b[i]="---";
					}
				}
			}
		}
			
		else if(x==4) {
			break;
		}
		
		}
	}
}
