package DesignPattern.Builder;

public class Student {
    String name;
    String standard;
    String marks;
    String address;
    int mobile;


    public Student(String name, String standard, String marks, String address, int mobile) {
        this.name = name;
        this.standard = standard;
        this.marks = marks;
        this.address = address;
        this.mobile = mobile;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", standard='" + standard + '\'' +
                ", marks='" + marks + '\'' +
                ", address='" + address + '\'' +
                ", mobile=" + mobile +
                '}';
    }

    static StudentBuilder getStuddentbuilder(){
        return new StudentBuilder();
    }

     static class StudentBuilder{
        String name;
        String standard;
        String marks;
        String address;
        int mobile;

        public StudentBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public StudentBuilder setStandard(String standard) {
            this.standard = standard;
            return this;
        }

        public StudentBuilder setMarks(String marks) {
            this.marks = marks;
            return this;
        }

        public StudentBuilder setAddress(String address) {
            this.address = address;
            return this;
        }

        public StudentBuilder setMobile(int mobile) {
            this.mobile = mobile;
            return this;
        }

        public Student build(){
            return new Student(this.name, this.standard, this.marks, this.address,this.mobile);
        }
    }
}
