import java.util.StringTokenizer;

public class practice_stringmethod {
    public static void main(String[] args) {
        String str = "This is a string example using StringTokenizer";
        StringTokenizer tokenizer = new StringTokenizer(str);

        System.out.println(str);
        System.out.println();

        System.out.println("total tokens : " + tokenizer.countTokens());

        System.out.println();

        while (tokenizer.hasMoreTokens()) {
            System.out.println(tokenizer.nextToken());
        }
        System.out.println();

        System.out.println("total tokens: " + tokenizer.countTokens());
    }
}


