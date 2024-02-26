package DesignPattern.Strategy;

public class Main {
    public static void main(String[] args) {
        GoogleMap googleMap = new GoogleMap();
        IPathCalculatorStrategy path = googleMap.getPath(PathMode.Walk);
        path.findPath("Sec 143","Google");
    }
}
