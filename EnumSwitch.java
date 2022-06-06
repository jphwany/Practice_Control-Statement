public class EnumSwitch {
    public static void main(String[] args) {
        Day day = Day.MONDAY;



            switch (day) {
                case MONDAY:
                    System.out.println("월요일 싫어");
                    break;
                case THURSDAY:
                    System.out.println("목요일은 치킨마요");
                    break;
                case SATURDAY:
                    System.out.println("토요일 좋아");
                    break;
                case SUNDAY:
                    System.out.println("일요일은 짜파게티");
                    break;
            }
        }
    }

    // day에 MONDAY를 할당한 상태인데 이 할당된 값으로 case를 나누고
    // 이렇게 case로 나눔에 따라 콘솔에 출력되는 값이 달라진다
    // 열거 타입이 7개로 한정된 값을 사용하는 데이터 타입이기 때문에
    // 경우를 나눠야 할 때 위의 예시처럼 활용한다