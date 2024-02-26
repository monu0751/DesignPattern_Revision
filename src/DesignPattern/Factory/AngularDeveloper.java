package DesignPattern.Factory;

public class AngularDeveloper implements IDeveloper{
    @Override
    public int Salary() {
        return 1000000;
    }

    @Override
    public void PrintDescription() {
        System.out.println("I am Angular");
    }
}
