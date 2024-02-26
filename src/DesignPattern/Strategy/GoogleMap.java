package DesignPattern.Strategy;

public class GoogleMap {

    public IPathCalculatorStrategy getPath(PathMode pathMode){
        return PathCalculatorFactory.getPath(pathMode);
    }

}
