package homework.lesson14;

public class main {
    public static void main(String[] args) {
    Student s1 = new Student(1,"Abylay", "Sydykbek", 3.0);
    Student s2 = new Student(1,"Nurda", "Batyr", 3.1);
    Student s3 = new Student(1,"Iza", "Eke", 3.0);

    Student allStudents[] = {s1,s2,s3};

        for (Student allStudent : allStudents) {
            System.out.println(allStudent.getStudentDate());
        }
    }
}
