public class pair{
    public static void main(String[] args) {
        int num = 0, sum = 0;
        while(num <= 10) {
            sum += num; //sum = sum + num과 똑같은 식. 복합 대입 연산자 "+="를 사용한 표현
            num++;
        }
        System.out.println(sum);
    }
}