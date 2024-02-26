package DesignPattern.PrototypeRegistery;

public class Main {
    public static void main(String[] args) throws Exception {
        Student aug23 = new Student(0,"","aug23","DSA","0","2023","Sandeep");
        Student sep23 = new Student(0,"","sep23","LLD","0","2023","Sandeep");
        Student nov23 = new Student(0,"","nov23","HLD","0","2023","Sandeep");

        StudentRegistory registry = new StudentRegistory();
        registry.addStudentRegistory(aug23);
        registry.addStudentRegistory(sep23);
        registry.addStudentRegistory(nov23);

        Student s1 = registry.getStudentRegistory("aug23").clone();
        s1.setId(1);
        s1.setName("Abhi");

        Student s2 = registry.getStudentRegistory("nov23").clone();
        s2.setId(2);
        s2.setName("Raka");

        System.out.println(s1);
        System.out.println(s2);
    }
}
