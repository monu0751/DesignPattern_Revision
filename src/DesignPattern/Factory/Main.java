package DesignPattern.Factory;

public class Main {
    public static void main(String[] args) {
        IDeveloper iDeveloper = DeveloperFactory.getDeveloper(DevType.Web);
        iDeveloper.PrintDescription();
        System.out.println("Salary: "+ iDeveloper.Salary());
    }
}
