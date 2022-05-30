public class Com_const {
    public static void main(String[] args) {

        Comconst comconst = new Comconst(
                "AMD Ryzen 3", "Windows 10", "gtx 1060 ti");

        System.out.println(
       "내 컴퓨터는 " + comconst.getCPUName() + " 라는 CPU를 사용하고 "
       + "운영체제는 " + comconst.getOsName() + ", " + comconst.getVgaName()
               + " 이라는 그래픽 카드를 장착하고 있다");

    }
}

class Comconst{
    public String CPUName;
    public String os;
    public String vga;


    public Comconst(String CPUName, String os, String vga){
        this.CPUName = CPUName;
        this.os = os;
        this.vga = vga;
    // 인스턴스 변수로 CPUName, os, vga 가 선언되어 있고
    // 생성자 매개변수로도 똑같은 이름으로 선언되어 있다
    // 이러면 구분하기 어려워지기 때문에 구분하는 용도로 this를 써서 구분한다
    // 그런거 없이 os = os 이래버리면 둘 다 지역변수로 간주된다
    // this는 인스턴스 자신을 가리키고 참조변수를 통해 인스턴스 멤버에 접근할 수 있었던 것 처럼
    // this를 통해 인스턴스 자신의 변수에 접근할 수 있는 것
    // 참고로 static 메소드에서는 this를 사용할 수 없다
    // static 메소드에는 참조할 인스턴스가 없기 때문이다

    }

    public Comconst(String CPUName){
        this("default CPU", "default OS", "default VGA");
    }


    public String getCPUName(){
        return CPUName;
    }


    public String getOsName(){
        return os;
    }

    public String getVgaName(){
        return vga;
    }
}