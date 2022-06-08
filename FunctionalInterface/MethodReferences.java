package FunctionalInterface;

public class MethodReferences {
    public static void main(String[] args) {
        CalculatorInterface operator;

        //static method
        operator = Calculator_SI::staticMethod;
        System.out.println("정적 메소드 결과 : " + operator.applyAsInt(3, 5));

        //instance method
        Calculator_SI calculator_si = new Calculator_SI();
        operator = calculator_si::instanceMethod;
        // 참조변수 calculator_si를 만들고 :: 기호뒤에 메소드
        System.out.println("인스턴스 메소드 결과 : " + operator.applyAsInt(3,5));



    }
}
// output
// 정적 메소드 결과 : 8
// 인스턴스 메소드 결과 : 15