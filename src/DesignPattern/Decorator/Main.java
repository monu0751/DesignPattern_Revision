package DesignPattern.Decorator;

public class Main {
    public static void main(String[] args) {
        IDecorator cone = new ChoclateScoop(
                new ButterScotchScoop(
                        new VanillaCone(
                            new OrangeCone()
                        )
                )
        );
        System.out.println("Your selected cones are "+cone.getDescription());
        System.out.println("Cost of your selected cone is: "+ cone.getAmount());
    }
}
