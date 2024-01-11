package Java_Pre_Study.s3control;

import java.util.Scanner;

public class quiz02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("첫 번째 정수를 입력 하세요.");
        System.out.print("두 번째 정수를 입력 하세요.");

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        if (num1 > num2) {
            System.out.println("두 수 중에서 큰 수는 " + num1 + "이다.");
        }else {
            System.out.println("두 수 중에서 큰 수는 " + num2 + "이다.");
        }
        scanner.close();
    }
}
