import java.util.TreeSet;

public class TreeSetEx {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();

        numbers.add(21);
        numbers.add(15);
        numbers.add(9);
        numbers.add(6);
        numbers.add(3);
        numbers.add(1);


        System.out.println(numbers);  // 9 15 21 오름차순
        System.out.println(numbers.first()); // 1
        System.out.println(numbers.last()); // 21

    }
}
