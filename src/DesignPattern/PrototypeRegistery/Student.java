package DesignPattern.PrototypeRegistery;

public class Student implements Cloneable{
    int id;
    String name;
    String batch;
    String module;

    String batchPsp;
    String joiningYear;
    String instructor;

    public Student(int id, String name, String batch, String module, String batchPsp, String joiningYear, String instructor) {
        this.id = id;
        this.name = name;
        this.batch = batch;
        this.module = module;
        this.batchPsp = batchPsp;
        this.joiningYear = joiningYear;
        this.instructor = instructor;
    }

    public int getId() {
        return id;
    }

    public String getBatchPsp() {
        return batchPsp;
    }

    public void setBatchPsp(String batchPsp) {
        this.batchPsp = batchPsp;
    }

    public String getJoiningYear() {
        return joiningYear;
    }

    public void setJoiningYear(String joiningYear) {
        this.joiningYear = joiningYear;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public String getModule() {
        return module;
    }

    public void setModule(String module) {
        this.module = module;
    }


    @Override
    protected Student clone() throws CloneNotSupportedException {
        Student s = new Student(this.id,this.name,this.batch,this.module,this.batchPsp,this.joiningYear,this.instructor);
        return s;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", batch='" + batch + '\'' +
                ", module='" + module + '\'' +
                ", batchPsp='" + batchPsp + '\'' +
                ", joiningYear='" + joiningYear + '\'' +
                ", instructor='" + instructor + '\'' +
                '}';
    }
}
