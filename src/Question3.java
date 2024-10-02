import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number=0;

        while (true) {
            System.out.print("1 이상의 숫자를 입력하세요: ");
            number = scanner.nextInt();

            if (number >= 1) {
                System.out.println("입력한 값: " + number);
                break; // 1 이상의 숫자가 입력되면 반복 종료
            } else {
                System.out.println("잘못된 입력입니다. 다시 시도하세요.");
            }
        }

        scanner.close();
    }
}
