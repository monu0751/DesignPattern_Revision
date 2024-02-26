package DesignPattern.Decorator;

public class ChoclateScoop implements IDecorator{
    IDecorator decorator;

    public ChoclateScoop(IDecorator decorator) {
        this.decorator = decorator;
    }

    @Override
    public int getAmount() {
        if(this.decorator == null){
            return 10;
        }else {
            return this.decorator.getAmount() + 10;
        }
    }

    @Override
    public String getDescription() {
        if(this.decorator == null){
            return "Choclate Scoop";
        }else{
            return this.decorator+", Choclate Scoop";
        }
    }
}
