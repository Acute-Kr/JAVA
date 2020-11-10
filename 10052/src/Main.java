import java.util.List;
import java.util.Scanner;

public class Main {

	/**
	 * Scanner 3개
	 */
	private static Scanner sc = new Scanner(System.in);
	private static Scanner scForName = new Scanner(System.in);
	private static Scanner scForSeatNum = new Scanner(System.in);
	/**
	 * seat 객체 선언 및 초기화
	 */
	private static Seat seat = new Seat();

	public static void main(String[] args) {

		System.out.println("명품콘서트홀 예약 시스템입니다.");

		while (true) {

			System.out.print("예약:1, 조회:2, 취소:3, 끝내기:4>>");
			int menu = sc.nextInt();

			if (menu == 1) {
				예약(seat);
			} else if (menu == 2) {
				조회(seat);
			} else if (menu == 3) {
				취소(seat);
			} else if (menu == 4) {
				System.out.println("<<--안녕히 가십시오.-->>");
				break;
			} else {
				System.out.println("잘못 입력하셨습니다.");
			}
		}
	}

	private static void 예약(Seat seat) {

		System.out.print("좌석구분 S(1), A(2), B(3)>>");
		int num = sc.nextInt();

		if (num == 1) {
			System.out.println("S>> " + seat.getS().toString());
		} else if (num == 2) {
			System.out.println("A>> " + seat.getA().toString());
		} else if (num == 3) {
			System.out.println("B>> " + seat.getB().toString());
		} else {
			System.out.println("잘못 입력하셨습니다.");
		}

		System.out.print("이름>>");
		String name = scForName.nextLine();
		System.out.print("번호>>");
		int seatNum = scForSeatNum.nextInt();

		if (num == 1) {
			seat.getS().set(seatNum - 1, name);
		} else if (num == 2) {
			seat.getA().set(seatNum - 1, name);
		} else if (num == 3) {
			seat.getB().set(seatNum - 1, name);
		} else {
			System.out.println("잘못 입력하셨습니다.");
		}

	}

	private static void 조회(Seat seat) {
		System.out.println("S>> " + seat.getS().toString());
		System.out.println("A>> " + seat.getA().toString());
		System.out.println("B>> " + seat.getB().toString());
	}

	private static void 취소(Seat seat) {
		System.out.print("좌석구분 S(1), A(2), B(3)>>");
		int num = sc.nextInt();
		if (num == 1) {
			List<String> Slist = seat.getS();
			System.out.println("S>> " + Slist.toString());
			System.out.print("이름 >> ");
			String name = scForName.nextLine();
			for (int i = 0; i < Slist.size(); i++) {
				if (Slist.get(i).equals(name)) {
					Slist.set(i, "---");
				}
			}
		} else if (num == 2) {
			List<String> Alist = seat.getA();
			System.out.println("A>> " + Alist.toString());
			System.out.print("이름 >> ");
			String name = scForName.nextLine();
			for (int i = 0; i < Alist.size(); i++) {
				if (Alist.get(i).equals(name)) {
					Alist.set(i, "---");
				}
			}
		} else if (num == 3) {
			List<String> Blist = seat.getB();
			System.out.println("B>> " + Blist.toString());
			System.out.print("이름 >> ");
			String name = scForName.nextLine();
			for (int i = 0; i < Blist.size(); i++) {
				if (Blist.get(i).equals(name)) {
					Blist.set(i, "---");
				}
			}
		} else {
			System.out.println("잘못 입력하셨습니다.");
		}
	}

}
