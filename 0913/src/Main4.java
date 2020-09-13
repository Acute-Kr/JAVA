import java.util.Scanner;

public class Main4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("입력하세요");

        int a = sc.nextInt();

        for (int i = 0; i < a; i++) {

            for (int j = 0; j < a; j++) {
                System.out.print("(" + i + ", " + j + ") ");

            }
            System.out.println();
        }

    }

}