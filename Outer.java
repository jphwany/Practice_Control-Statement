public class Outer {


    private int num = 1; //외부 클래스 private 변수
    private static int sNum = 2; // 외부 클래스 정적 변수

    private innerClass innerClass; // 내부 클래스 자료형 변수 선언

    public Outer() {
         innerClass = new innerClass(); //외부 클래스 생성자
    }

    class innerClass { //인스턴스 내부 클래스
        int inNum = 10; //내부 클래스의 인스턴스 변수
//      static int asd = 2;  인스턴스 내부 클래스엔 static 메소드가 들어갈 수 없다
//    Static declarations in inner classes are not supported at language level '11'
        void Test() {
            System.out.println("Outer num = " + num + "(외부 클래스의 인스턴스 변수)");
            System.out.println("Outer sNum = " + sNum + "(외부 클래스의 정적 변수)");
        }
    }
    public void testClass() {
        innerClass.Test();
    }
}

class OuterTest {
    public static void main(String[] args) {
        Outer outer = new Outer();
        System.out.println("외부 클래스 사용하여 내부 클래스 기능 호출");
        outer.testClass(); // 내부 클래스 기능 호출
    }
}
