public interface Fruit_interface {
    public void flavor(); // 메소드 바디가 없다
    public void color();
}

class Melon implements Fruit_interface{
    public void flavor(){
        System.out.println("메론 맛");
    }

    public void color() {
        System.out.println("초록 색");
    }
}

class Main{
    public static void main(String[] args) {
        Melon melon = new Melon();
        melon.color();
        melon.flavor();
    }
}