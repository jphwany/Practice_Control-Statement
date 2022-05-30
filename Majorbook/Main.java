package Majorbook;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        MajorBook majorBook;


        do {Scanner scanner = new Scanner(System.in);
            System.out.printf("전공책 조회 :  ");
            String input = scanner.nextLine();

            if (Objects.equals(input, "데이터베이스")) {
                majorBook = new DataBase();
                majorBook.show();
            } else if (Objects.equals(input, "자료구조")) {
                majorBook = new DataStructure();
                majorBook.show();
            } else if (Objects.equals(input, "네트워크")) {
                majorBook = new Network();
                majorBook.show();
            } else if (Objects.equals(input, "리눅스")) {
                majorBook = new Linux();
                majorBook.show();
            } else if (Objects.equals(input, "운영체제")) {
                majorBook = new Os();
                majorBook.show();
            }
            else {
                System.out.println("올바른 입력 값이 아닙니다, 종료합니다");
                break;
            }
        }while(true);

    }
}
