import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {

		String str[] = {"가위", "바위", "보"};
		
		Scanner sc = new Scanner(System.in);
	
		String user =" ";
		
		for(;;) {
			System.out.println("무엇을 내실건가요! : ");
			user = sc.next();
			String computer = str[(int)Math.random()*3];
			
			if(user.equals("가위")) {
				if(computer.equals("가위")) {
				System.out.print("컴퓨터 : " + computer + " ");
				System.out.print("사용자 : " + user + " ");
				System.out.println("비겼습니다.");
				}
				else if(computer.equals("바위")) {
					System.out.print("컴퓨터 : " + computer + " ");
					System.out.print("사용자 : " + user + " ");
					System.out.println("졌습니다 ㅠㅠ");
					}
				else if(computer.equals("보")) {
					System.out.print("컴퓨터 : " + computer + " ");
					System.out.print("사용자 : " + user + " ");
					System.out.println("이겼습니다!");
					}
			}
			else if(user.equals("바위")) {
				if(computer.equals("가위")) {
					System.out.print("컴퓨터 : " + computer + " ");
					System.out.print("사용자 : " + user + " ");
					System.out.println("이겼습니다!");
					}
					else if(computer.equals("바위")) {
						System.out.print("컴퓨터 : " + computer + " ");
						System.out.print("사용자 : " + user + " ");
						System.out.println("비겼습니다.");
						}
					else if(computer.equals("보")) {
						System.out.print("컴퓨터 : " + computer + " ");
						System.out.print("사용자 : " + user + " ");
						System.out.println("졌습니다 ㅠㅠ");
						}
				}
			else if(user.equals("보")) {
				if(computer.equals("가위")) {
					System.out.print("컴퓨터 : " + computer + " ");
					System.out.print("사용자 : " + user + " ");
					System.out.println("졌습니다 ㅠㅠ");
					}
					else if(computer.equals("바위")) {
						System.out.print("컴퓨터 : " + computer + " ");
						System.out.print("사용자 : " + user + " ");
						System.out.println("이겼습니다!");
						}
					else if(computer.equals("보")) {
						System.out.print("컴퓨터 : " + computer + " ");
						System.out.print("사용자 : " + user + " ");
						System.out.println("비겼습니다.");
						}
			}
			else if(user.equals("그만")) {
				System.out.println("게임을 종료합니다.");
				break;
			}
			
			
		}

	}

}
