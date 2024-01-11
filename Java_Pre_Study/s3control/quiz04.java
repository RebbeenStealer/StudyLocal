package Java_Pre_Study.s3control;

import java.util.Scanner;
public class quiz04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("이름을 입력하세요: ");

        String name = scanner.nextLine();

        if (name == "admin") {
            System.out.println("관리자님, 안녕하세요");
        }else {
            System.out.println("Hello " + name + "!");
        }

    }
}
