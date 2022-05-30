public class Com {
    public static void main(String[] args) {
    class Computer{
        String os;
        String cpu;
        String vga;
        int monitor_count;

        void power() {
            System.out.println("전원 시작");
        }

        void calculate(){
            System.out.println("연산 시작");
        }

        void translate(){
            System.out.println("번역 시작");
        }
    }

    Computer computer = new Computer();

    computer.os = "Windows 10";
    computer.cpu = "AMD Ryzen 3";
    computer.vga = "gtx 1060 Ti";
    computer.monitor_count = 2;

    computer.power();
    computer.calculate();
    computer.translate();

        System.out.println("운영체제 : " + computer.os);
        System.out.println("CPU : " + computer.cpu);
        System.out.println("그래픽카드 : " + computer.vga);
        System.out.println("모니터 개수 : " + computer.monitor_count);
    }
}
