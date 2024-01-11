package Java_Pre_Study.s3control;

import java.util.Scanner;

public class quiz01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("나이를 입력 하세요.");
        int inputAge = scanner.nextInt();

        if (inputAge >= 18) {
            System.out.print("당신은 성인입니다.");
        }else {
            System.out.print("당신은 미성년자입니다.");
        }
        scanner.close();
    }
}