package Majorbook;

public class MajorBook {

    String bookName;
    String publisher;
    String subject;
    int yearOfPublication;


    public void show() {
        System.out.println("책 이름 : " + bookName);
        System.out.println("출판사 : " + publisher);
        System.out.println("과목 : " + subject);
        System.out.println("출판년도 : " + yearOfPublication);
    }
}