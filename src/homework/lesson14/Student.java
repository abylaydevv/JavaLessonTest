package homework.lesson14;

public class Student {
    String name;
    String surname;
    double gpa;

    public Student(){
    }

    public Student(int id,String name, String surname, double gpa) {
        this.name = name;
        this.surname = surname;
        this.gpa = gpa;
    }
    String getStudentDate(){
        return "Name: "+name+" Surname: "+ surname+"GPA: "+gpa;
    }
}
