import java.util.Scanner;

public class Main4 {

    public static void main(String[] args) {

        String str[] = { "가위", "바위", "보" };

        Scanner sc = new Scanner(System.in);

        String user = "";

        while (true) {

            System.out.print("무엇을 내실건가요 > ");
            user = sc.next();
            String computer = str[(int) (Math.random() * 3)];

            if (user.equals("그만")) {
                System.out.println("게임을 종료합니다.");
                break;
            }

            if ((user.equals("가위") && computer.equals("보")) || (user.equals("보") && computer.equals("바위"))
                    || (user.equals("바위") && computer.equals("가위"))) {
                print(user, computer);
                System.out.println("이겼습니다.");
            }

            if (user.equals(computer)) {
                print(user, computer);
                System.out.println("비겼습니다");
            }

            if ((user.equals("가위") && computer.equals("바위")) || (user.equals("보") && computer.equals("가위"))
                    || (user.equals("바위") && computer.equals("보"))) {
                print(user, computer);
                System.out.println("졌습니다.");
            }

        }

    }

    private static void print(String user, String computer) {
        System.out.println("user : " + user);
        System.out.println("computer : " + computer);
    }

}