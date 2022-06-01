public class Basket<T> {
    private T t;
    public T get() {
        return t;
    }
    public void set(T t) {
        this.t = t;
    }
    // 제네릭 타입을 설정, 필드와 메소드 리턴 값을 T로 설정
}


