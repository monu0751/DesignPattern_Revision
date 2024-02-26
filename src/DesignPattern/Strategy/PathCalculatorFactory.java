package DesignPattern.Strategy;

public class PathCalculatorFactory {
    public static IPathCalculatorStrategy getPath(PathMode pathMode){
        return switch (pathMode){
            case Car -> new CarPathStrategy();
            case Bike -> new BikePathStrategy();
            case Walk -> new WalkPathStrategy();
        };
    }
}
