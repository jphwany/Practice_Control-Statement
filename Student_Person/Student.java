package Student_Person;

public class Student extends Person {
     private String studentID;
     private int grade;
     private double GPA;

        public String getStudentID() {
            return studentID;
        }

        public void setStudentID(String studentID) {
            this.studentID = studentID;
        }

        public double getGPA(){
            return GPA;
        }

        public void setGPA(double GPA){
            this.GPA = GPA;
        }

        public int getGrade() {
            return grade;
        }

        public void setGrade(int grade) {
            this.grade = grade;
        }

//        public Student(String name, int age, int height, int weight, String studentID, int grade, double GPA) {
//            super(name, age, height, weight); //상위 클래스인 Person이 가지고 있는 생성자를 쓰겠다
//            this.studentID = studentID;
//            this.grade = grade;
//            this.GPA = GPA;
//        }

//        public void show(){
//            System.out.println("학생 이름 : " + getName());
//            System.out.println("학생 나이 : " + getAge());
//            System.out.println("학생 키 : " + getHeight());
//            System.out.println("학생 몸무게 : " + getWeight());
//            System.out.println("학생 ID : " + getStudentID());
//            System.out.println("학생 학년 : " + getGrade());
//            System.out.println("학생 성적 : " + getGPA());
//        }
    }
