import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {

		String str[] = {"����", "����", "��"};
		
		Scanner sc = new Scanner(System.in);
	
		String user =" ";
		
		for(;;) {
			System.out.println("������ ���ǰǰ���! : ");
			user = sc.next();
			String computer = str[(int)Math.random()*3];
			
			if(user.equals("����")) {
				if(computer.equals("����")) {
				System.out.print("��ǻ�� : " + computer + " ");
				System.out.print("����� : " + user + " ");
				System.out.println("�����ϴ�.");
				}
				else if(computer.equals("����")) {
					System.out.print("��ǻ�� : " + computer + " ");
					System.out.print("����� : " + user + " ");
					System.out.println("�����ϴ� �Ф�");
					}
				else if(computer.equals("��")) {
					System.out.print("��ǻ�� : " + computer + " ");
					System.out.print("����� : " + user + " ");
					System.out.println("�̰���ϴ�!");
					}
			}
			else if(user.equals("����")) {
				if(computer.equals("����")) {
					System.out.print("��ǻ�� : " + computer + " ");
					System.out.print("����� : " + user + " ");
					System.out.println("�̰���ϴ�!");
					}
					else if(computer.equals("����")) {
						System.out.print("��ǻ�� : " + computer + " ");
						System.out.print("����� : " + user + " ");
						System.out.println("�����ϴ�.");
						}
					else if(computer.equals("��")) {
						System.out.print("��ǻ�� : " + computer + " ");
						System.out.print("����� : " + user + " ");
						System.out.println("�����ϴ� �Ф�");
						}
				}
			else if(user.equals("��")) {
				if(computer.equals("����")) {
					System.out.print("��ǻ�� : " + computer + " ");
					System.out.print("����� : " + user + " ");
					System.out.println("�����ϴ� �Ф�");
					}
					else if(computer.equals("����")) {
						System.out.print("��ǻ�� : " + computer + " ");
						System.out.print("����� : " + user + " ");
						System.out.println("�̰���ϴ�!");
						}
					else if(computer.equals("��")) {
						System.out.print("��ǻ�� : " + computer + " ");
						System.out.print("����� : " + user + " ");
						System.out.println("�����ϴ�.");
						}
			}
			else if(user.equals("�׸�")) {
				System.out.println("������ �����մϴ�.");
				break;
			}
			
			
		}

	}

}
