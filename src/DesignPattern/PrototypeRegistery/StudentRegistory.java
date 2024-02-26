package DesignPattern.PrototypeRegistery;

import java.util.HashMap;
import java.util.Map;

public class StudentRegistory {
    Map<String,Student> studentPrototypeMap;

    public StudentRegistory() {
        studentPrototypeMap = new HashMap<>();
    }

    public Map<String, Student> getStudentPrototypeMap() {
        return studentPrototypeMap;
    }

    public void setStudentPrototypeMap(Map<String, Student> studentPrototypeMap) {
        this.studentPrototypeMap = studentPrototypeMap;
    }

    public void addStudentRegistory(Student student) throws Exception {
        if(this.getStudentPrototypeMap().containsKey(student.getBatch())){
            throw new Exception("Protoype already exists");
        }else{
            this.getStudentPrototypeMap().put(student.getBatch(),student);
        }
    }

    public Student getStudentRegistory(String batch) throws Exception {
        if(!this.getStudentPrototypeMap().containsKey(batch)){
            throw new Exception("Protoype not exists");
        }else{
            return this.getStudentPrototypeMap().get(batch);
        }
    }
}
