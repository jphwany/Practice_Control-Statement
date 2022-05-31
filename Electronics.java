
class Electronic_device{
    double consumption;
    int serialNumber;

    void power(){
        System.out.println(true);
    }
}

class Electric_fan extends Electronic_device{
    String fanName ;

    void airVolumeControl(){
        System.out.println("바람 세기 조절");
    }

    void windDirectionControl(){
        System.out.println("풍향 조절");
    }

    void timer(){
        System.out.println("타이머 설정");
    }
}

class Phone extends Electronic_device{
    String phoneName;

    void calling(){
        System.out.println("전화 기능");
    }

    void connectInternet(){
        System.out.println("인터넷 접속");
    }
}

public class Electronics{
    public static void main(String[] args) {

        Electronic_device e = new Electronic_device();
        e.power();
        e.consumption = 9826;
        System.out.println("평균 소비 전력은 " + e.consumption + "W 입니다");

        System.out.println("-----------------------------");

        Electric_fan f = new Electric_fan();
        f.power();  // 메소드 오버라이딩
        f.fanName = "Comax";
        System.out.println("제조회사 : " + f.fanName);
        f.serialNumber = 1003054334;
        System.out.println("일련번호 : " + f.serialNumber);
        f.consumption = 300;
        System.out.println("선풍기 소비전력은 " + f.consumption + "W 입니다");
        f.airVolumeControl();
        f.windDirectionControl();
        f.timer();

        System.out.println("-----------------------------");

        Phone p = new Phone();
        p.power();  // 메소드 오버라이딩
        p.phoneName = "삼성 갤럭시 A90";
        System.out.println("휴대폰 이름 : " + p.phoneName);
        p.serialNumber = 1110021002;
        System.out.println("일련번호 : " + p.serialNumber);
        p.calling();
        p.connectInternet();
    }
}
