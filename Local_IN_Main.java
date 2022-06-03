class Outside_ {  // 외부 클래스
    int num = 2;  //외부 클래스 int num 인스턴스 값 2
    void _test() { // _test() 메소드 생성
        int num1 = 4;
        class LocalInClass { //지역 내부 클래스, 메소드 내부에서 정의된 클래스
            void getPrint(){
                System.out.println(num);
                System.out.println(num1);
            }
        }
        LocalInClass localInClass = new LocalInClass();
        localInClass.getPrint();
    }
}

public class Local_IN_Main {
    public static void main(String[] args) {
        Outside_ outside_ = new Outside_();
        outside_._test();
    }
}
