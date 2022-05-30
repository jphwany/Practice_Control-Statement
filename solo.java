import java.util.Scanner;


public class solo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("점수를 입력하세요 : ");
        int i = scanner.nextInt(); // 점수 입력


        String grade = "";
        switch(i/10) {
            case 10:
            case 9:
                grade="A";
                break;
            case 8:
                grade="B";
                break;
            case 7:
                grade="C";
                break;
            case 6:
                grade="D";
                break;
            default :
                grade="F";
                break;
        }
        System.out.println("당신은 "+grade+"학점 입니다.");
    }
}
