package FunctionalInterface;

public class FunctionalInterfaceExample2 {
    public static void main(String[] args) {
        FunctionalInterface2 example2;  //인터페이스 추상메소드를 참조변수 example2에 담음
        example2 = (x) -> {     // 람다식 선언 (매개변수 있는)
            int result = x * 2;   // int형 result 에 x * 2 담고
            System.out.println(result); // 프린트 출력
        };
        example2.accept2(2);
// 람다식 대입된 인터페이스 참조변수 example2 로 accept2() 호출
// accept2()는 매개변수 int형 x 가진 추상 메소드


        example2 = x -> System.out.println(x * 3);
        // 실행문이 1개라서 중괄호 { } 생략, 매개변수도 1개라서 소괄호 () 생략
        example2.accept2(2);
    }
}
// output
// 4
// 6
