package DesignPattern.Factory;

public class WebDeveloper implements IDeveloper{
    @Override
    public int Salary() {
        return 2000000;
    }

    @Override
    public void PrintDescription() {
        System.out.println("I am Web developer");
    }
}
