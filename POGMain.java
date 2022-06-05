public class POGMain {
    public static void main(String[] args) {

        PartOfGeneric partOfGeneric = new PartOfGeneric();

        int num1 = partOfGeneric.<Integer>accept(123);
        int num2 = partOfGeneric.<Integer>accept(321);
        // 입력 매개변수 값으로 제네릭 타입을 유추할 수 있다면 제네릭 타입 지정 생략 가능
        System.out.println(num1);
        System.out.println(num2);

//         partOfGeneric.<Integer,String>getPrint(77, "jp");
        // Explicit type arguments can be inferred
        // getPrint 메소드가 타입 매개변수와 함께 선언되었기 때문에
        // 다이아몬드 오퍼레이터 <>로 다시 만들어주지 않아도 됨. 생략 가능

        partOfGeneric.getPrint(77, "jp");
        partOfGeneric.getPrint("hwany",3);
    }
}
