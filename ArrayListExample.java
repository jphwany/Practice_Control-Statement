import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
//      List<String> list = new ArrayList<String>();
//      Explicit type argument String can be replaced with <>
//      중복되니까 생략해도 된다 String
        List<String> list = new ArrayList<>();
        list.add("jp");  //String 객체 저장/추가
        list.add("hwany");
        list.add("dev");
        list.add("abcdefg");
        list.add("qwertyasdfg");

        int ls_size = list.size();  // 총 저장 객체 수 얻기
        String skill = list.get(0); // 0번 인덱스 객체 얻기

        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            System.out.println(i + " : " + str);
        } // 저장된 총 객체 수 만큼 조회, 출력
    }
}

