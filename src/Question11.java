public class Question11 {
    public static void main(String[] args) {
        int n = 5; // 피라미드의 높이 (줄 수)

        // 줄 수만큼 반복
        for (int i = 0; i < n; i++) {
            // 공백 출력 (n-i-1개의 공백)
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            // 별 출력 (2*i+1개의 별)
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }

            // 줄바꿈
            System.out.println();
        }
    }
}