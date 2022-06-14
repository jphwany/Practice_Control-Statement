import java.util.*;

public class IteratorEx {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<Integer>();
        // 정수 값만 다루는 제네릭 벡터 생성
        v.add(5);
        v.add(4);
        v.add(-1);
        v.add(2, 100);
        // 2번째 인덱스에 100 삽입
        // 0번째 : 5
        // 1번째 : 4
        // 2번째 : 100
        // 3번째 : -1

        Iterator<Integer> it = v.iterator(); // Iterator 객체 얻기


        // Iterator를 이용, 모든 정수 출력
        while(it.hasNext()) {
            int n = it.next();
            System.out.println(n);
        }


        // Iterator를 이용, 모든 정수 합
        int sum = 0;
        it = v.iterator(); // Iterator 객체 얻기
        while(it.hasNext()) {
            int n = it.next();
            sum += n;
        }

        System.out.println("벡터에 있는 정수 합 :  " + sum);
    }
}