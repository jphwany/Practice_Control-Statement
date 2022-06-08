package FunctionalInterface;

public class FunctionalInterfaceExample {
    public static void main(String[] args) {
        FunctionalInterface example;  // 인터페이스 추상메소드를 참조변수 example에 담고
        example = () -> {                    // 람다식 선언
            String str = "메소드 호출, 첫번째" ;
            System.out.println(str); // 실행문 1개
        };
        example.accept(); // 람다식 대입된 인터페이스 참조변수 example 로 accept() 호출

        example = () -> System.out.println("메소드 호출, 두번째");
        // 실행문이 1개라서 중괄호 { } 생략 가능한 것
        example.accept(); // 람다식 대입된 인터페이스 참조변수로 accept() 호출

    }
}
