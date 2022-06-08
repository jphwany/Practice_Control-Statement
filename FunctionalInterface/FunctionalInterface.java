package FunctionalInterface;

@java.lang.FunctionalInterface
// 추상 메소드가 하나라면 굳이 안써줘도 되는데
// 실수로라도 2개 이상의 추상 메소드를 선언하는 것을 방지하고자 붙이는게 좋다
public interface FunctionalInterface {
    public void accept();
 // 인터페이스의 모든 메소드는 암시적으로 public, abstract이다 (final은 아님)
 // 인터페이스의 모든 필드는 암시적으로 public이자 static 및 fianl이다
 // 그래서 생략해도 상관이 없다 실제로 public을 썼지만 활성화가 되어 있지 않은 모습이다
 // public void otheraccept(); 추상메소드가 2개 이상이 되어버리면 애너테이션 선언부에 에러가 난다
}
