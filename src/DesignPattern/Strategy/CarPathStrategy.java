package DesignPattern.Strategy;

public class CarPathStrategy implements IPathCalculatorStrategy {
    @Override
    public void findPath(String source, String destination) {
        System.out.println("Traveling from "+source+" to "+destination+" by Car");
    }
}
