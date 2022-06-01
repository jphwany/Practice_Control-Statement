public class BasketMain {
    public static void main(String[] args) {

        Basket<String> basket1 = new Basket<>();
// Basket<String> basket1 = new Basket<String>();
// Explicit type argument Integer can be replaced with <> 경고가 뜨는데
// 코드를 간단하게 만들기 위한 것이 목적으로 왼쪽에 정보가 다 있기 때문에
// 오른쪽은 중복이라 볼 수 있어서 오른쪽 다이아몬드 오퍼레이터만 남겨두는게 좋다
        basket1.set("jphwany");
        String str = basket1.get();

        Basket<Integer> basket2 = new Basket<>();
        basket2.set(7);
        int value = basket2.get();

        System.out.println(str);
        System.out.println(value);
        System.out.println(basket1.get());
        System.out.println(basket2.get());
    }
}