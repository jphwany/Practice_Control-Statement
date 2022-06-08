package FunctionalInterface;

import static java.lang.Integer.sum;

public class FunctionalInterfaceExample3 {
    public static void main(String[] args) {
        FunctionalInterface3 example3;
        example3 = (x, y) -> {     // 람다식 생성, 매개변수 2개라서 소괄호 생략불가
            int answer = x + y;
            return answer;
        };
        int answer2 = example3.accept3(3, 7);
        System.out.println(answer2); // 10

        example3 = (x, y) -> {return x + y;};
        int answer3 = example3.accept3(3,7);
        System.out.println(answer3); // 10
        // int answer에  x+y 할당하지 않고도
        // 그냥 x+y 자체 값이 리턴 가능한 값이니까
        // 불필요한 변수 선언 과정을 생략

        example3 = (x, y) -> x + y;
        int answer4 = example3.accept3(3,7);
        System.out.println(answer4); // 10
        // 리턴문만 존재하니까 return을 생략하고
        // 실행문이 1개니까 중괄호도 생략

        example3 = (x, y) -> sum(x, y);
        int answer5 = example3.accept3(3,7); // 10
        System.out.println(answer5); // 10
        // x+y 를 sum 메소드를 사용해서 sum(x, y)로 표현 가능하다

//      example3 = (x, y) -> x + y;
        example3 = Integer::sum;
// 메소드 레퍼런스, 람다식과 마찬가지로 인터페이스의 익명 구현 객체로 생성되기 때문에
// 타겟 타입인 인터페이스의 추상 메소드가 어떤 매개 변수를 가지고 리턴 타입이 뭔지에 따라 달라진다
        int answer6 = example3.accept3(3,7);
        System.out.println(answer6); // 10

        // 지금 전부 같은 값을 출력한다
        // 얼마든지 이렇게 다르게 표현이 가능하다


    }
}
