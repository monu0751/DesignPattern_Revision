package DesignPattern.Builder;

public class Main {
    public static void main(String[] args) {
        Student nisha = Student.getStuddentbuilder()
                .setName("Nisha")
                .setAddress("Chandra Nagar")
                .setMarks("100")
                .setStandard("Msc")
                .setMobile(20297777)
                .build();

        System.out.println(nisha.toString());
    }
}
