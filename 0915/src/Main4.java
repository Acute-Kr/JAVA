import java.util.Scanner;

public class Main4 {

    public static void main(String[] args) {

        String str[] = { "����", "����", "��" };

        Scanner sc = new Scanner(System.in);

        String user = "";

        while (true) {

            System.out.print("������ ���ǰǰ��� > ");
            user = sc.next();
            String computer = str[(int) (Math.random() * 3)];

            if (user.equals("�׸�")) {
                System.out.println("������ �����մϴ�.");
                break;
            }

            if ((user.equals("����") && computer.equals("��")) || (user.equals("��") && computer.equals("����"))
                    || (user.equals("����") && computer.equals("����"))) {
                print(user, computer);
                System.out.println("�̰���ϴ�.");
            }

            if (user.equals(computer)) {
                print(user, computer);
                System.out.println("�����ϴ�");
            }

            if ((user.equals("����") && computer.equals("����")) || (user.equals("��") && computer.equals("����"))
                    || (user.equals("����") && computer.equals("��"))) {
                print(user, computer);
                System.out.println("�����ϴ�.");
            }

        }

    }

    private static void print(String user, String computer) {
        System.out.println("user : " + user);
        System.out.println("computer : " + computer);
    }

}