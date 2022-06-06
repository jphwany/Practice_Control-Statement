enum Day { SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY}

public class EnumExample {
    public static void main(String[] args) {
        Day favoriteDay = Day.FRIDAY;  // favoriteDay에 할당
        System.out.println(favoriteDay); // FRIDAY 출력
        System.out.println(Day.FRIDAY); // 똑같이 FRIDAY 출력
    }  // Day.FRIDAY  열거형이름.상수명 으로 참조할 수 있다
       // static 변수 참조하는 것과 유사한 형태
}