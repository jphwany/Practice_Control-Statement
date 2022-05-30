abstract class Fruit {
    // 메소드 바디가 없다. 과일 속성을 데이터 타입과 함께 적어줬었던 것과 다르게..
    public abstract void flavor();
    // flavor() 추상 메소드 선언, 이 부분을 포함하는 Fruit 클래스 또한 abstract 추상클래스화
    public void color(){
        System.out.println("빨간 색");
    }
}

class Apple extends Fruit{
    public void flavor(){
        // flavor() 메소드오버라이딩 구현부 완성
        System.out.println("사과 맛");
    }
}


class Main_Fruit{
    public static void main(String[] args) {

        Fruit apple = new Apple();
        apple.color();
        apple.flavor();
    }
}
