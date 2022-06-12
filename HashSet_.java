import java.util.HashSet;
import java.util.Iterator;

public class HashSet_ {
    public static void main(String[] args) {
        HashSet set = new HashSet();


        // HashSet은 객체 저장하기 전, 기존에 같은게 있는지 확인한다
        // 없으면 저장, 중복이 있으면 저장 X
        set.add("가나다");
        set.add("가나다");

        set.add("jphwany");
        set.add("dev 95");
        set.add("Back-End");

        Iterator it = set.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}