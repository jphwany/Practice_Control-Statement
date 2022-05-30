package Student_Person;

public class Main_studentPerson {
    public static void main(String[] args) {

          Student student = new Student();
          student.setStudentID("jp");
          student.setAge(28);
          student.setGPA(3.2);
          student.setGrade(2);

          System.out.println(student.getStudentID());
          System.out.println(student.getAge());
          System.out.println(student.getGPA());
          System.out.println(student.getGrade());


//        Student student1 = new Student(
//                "jp", 28, 163, 60, "2019191400",4, 4.2);
//        Student student2 = new Student(
//                "hwany", 26,170, 58, "2020201811", 3, 3.9);
//        student1.show();
//        student2.show();

    }
}
