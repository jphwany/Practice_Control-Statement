import java.util.HashMap;
import java.util.Map;

public class HashMap_ {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        map.put("가", 10);
        map.put("나", 15);
        map.put("다", 20);
        map.put("라", 25);
        map.put("라", 30);
        // Key가 중복되면 이전 키 값을 새롭게 집어넣은 것으로 업데이트한다

        System.out.println(map);
// 출력  {가=10, 다=20, 나=15, 라=30}
        System.out.print(map.get("가"));
        System.out.print(map.get("나"));
        System.out.print(map.get("다"));
        System.out.print(map.get("라"));
        // Key에 해당하는 값을 출력

    }

}
