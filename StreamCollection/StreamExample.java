package StreamCollection;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {


    List<String> list1 = Arrays.asList("Monday", "화요일", "수요일", "목요일");
    List<String> list2 = Arrays.asList("금요일", "토요일", "Sunday", "Monday");
    Stream<String> stream1 = list1.stream();
    Stream<String> stream2 = list2.stream();

    Stream<String> stream3 = Stream.concat(stream1, stream2);
    // stream1, 2 합치기

    stream3.distinct()
           .filter(n -> n.startsWith("M"))
           .forEach(n -> System.out.println(n));
    // distinct()는 중복제거, filter()는 매개 값으로 조건이 주어지고 그게 참이 되는 요소만 필터링
    // forEach() 최종 연산 메소드, 파이프라인 마지막에 사용, 값 출력, 리턴 값 없어도 쓰임
  }
}