import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        // LinkedList list = new LinkedList();
        // 타입 미설정 Object로 선언
        // LinkedList는 ArrayList와 선언이 같지만
        // 초기의 크기를 미리 생성할 수 없다
        // 위와 같이 선언하고 내부에 임의 값을 넣어 사용할 수 있지만
        // 이럴 경우 내부 값 사용할 때 캐스팅을 해야하고
        // 잘못된 타입으로 캐스팅이라도 하는 날에는 에러가 발생하게된다
        // 그래서 제네릭 요소를 사용을 한다

        // LinkedList<Student> list = new LinkedList<>();
        // <> 안에 다른 컬렉션 객체를 가져올 수도 있다

        LinkedList<Integer> list = new LinkedList<>();
        // Integer 타입의 LinkedList list 선언

        list.add(0);  // 0 추가
        list.add(1,5); // 1번째 인덱스 뒤 5 추가
        System.out.println(list);
        // [0, 5]  출력

        list.addFirst(-1); // 노드 맨 앞에 -1 추가
        list.addLast(7); // 노드 맨 마지막에 7 추가
        System.out.println(list);
        // [-1, 0, 5, 7] 출력

        list.remove();  // 맨 앞 노드 삭제
        System.out.println(list);
        // [0, 5, 7] 출력

        list.remove(1); // 1번째 인덱스 노드 삭제
        System.out.println(list);
        // [0, 7] 출력,   1번째 인덱스인 5를 삭제했기 때문

        list.removeFirst(); // 맨 앞 노드 삭제
        System.out.println(list);
        // [7] 출력,  맨 앞 0을 삭제했기 때문

        list.removeLast(); // 맨 뒤 노드 삭제
        System.out.println(list);
        // []  출력, 남아있는게 7 밖에 없지만 아무튼 맨 뒤 노드 삭제하니까 빈배열 출력
    }
}
