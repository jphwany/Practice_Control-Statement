

public class ElectronicTest {
    public static void main(String[] args) {
        MainComputer mainComputer = new MainComputer();
        SamsungPhone samsungPhone = new SamsungPhone();

        ElectronicObject electronicObject = (ElectronicObject) mainComputer;
        //상위 클래스인 ElectronicObject로 변환. 괄호 생략 가능
        MainComputer mainComputer1 = (MainComputer) electronicObject;
        //하위 클래스인 MainComputer로 변환. 괄호 생략 불가능, 괄호 명시해줘야 함


//      SamsungPhone samsungPhone = (SamsungPhone) MainComputer;
//      서로 상속 관계가 아니기 때문에 타입 변환 불가능
    }

}


class ElectronicObject{
    String name;
    String purpose;
    int serialNum;

    void power(){
        System.out.println("전원 on");
    }
}

class MainComputer extends ElectronicObject{

    void coding(){
        System.out.println("프로그래밍");
    }
}

class SamsungPhone extends ElectronicObject{
    void calling(){
        System.out.println("전화 기능");
    }
}