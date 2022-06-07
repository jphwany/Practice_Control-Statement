public class AnnoymousClass {
    public static void main(String[] args) {
        Numbering numbering = new Numbering() {
            @Override
            public void getNum() {
                System.out.println("내 학번은 " + num);
            }
        };
        numbering.getNum();
    }
}
