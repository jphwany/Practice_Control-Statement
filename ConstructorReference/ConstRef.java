package ConstructorReference;

import java.util.function.BiFunction;
import java.util.function.Function;

public class ConstRef {
    public static void main(String[] args) {
        Function<String, Worker> function1 = Worker::new;
        Worker worker1 = function1.apply("jphwany");
// Function<String,Worker> 함수형 인터페이스의 Worker apply(String) 메소드를 이용, Worker 객체 생성


        BiFunction<String, String, Worker> function2 = Worker::new;
        Worker worker2 = function2.apply("박재환", "jphwany");
// BiFunction <String, String, Worker> 함수형 인터페이스의 Worker 객체 생성

    }
}
