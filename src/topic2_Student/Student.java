package topic2_Student;


import topic1_Person.Person;

public class Student extends Person {
    private String studentId;

    public Student(String name, int age, String studentId) {
        super(name, age);
        this.studentId = studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentId() {
        return studentId;
    }

    @Override
    public void displayInfo() {
        System.out.println("Name: " + this.getName() + ", Age: " + this.getAge() + ", Student ID: " + studentId);
    }
}
