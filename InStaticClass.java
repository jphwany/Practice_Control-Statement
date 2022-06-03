class Outside { //외부 클래스
    private int number = 3; //내부 클래스의 인스턴스 변수
    private static int staticNumber = 7; //

    void getPrint() {
        System.out.println("인스턴스 메소드");
    }

    static void getPrintStatic() {
        System.out.println("스태틱 메소드");
    }

    static class StaticInClass { // 정적 내부 클래스
        void test() {
            System.out.println("Outside number = " + staticNumber + " (외부 클래스의 정적 변수)");
            getPrintStatic();
            // number, getPrint() 는 정적 멤버가 아니라 사용 불가.
        }
    }
}

public class InStaticClass {
    public static void main(String[] args) {
        Outside.StaticInClass si_test = new Outside.StaticInClass();
        //정적 이너 클래스의 객체 생성
        si_test.test(); // StaticInClass 정적 내부 클래스 void 메소드 호출
    }
}
