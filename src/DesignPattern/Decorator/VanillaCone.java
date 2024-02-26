package DesignPattern.Decorator;

public class VanillaCone implements IDecorator{
    IDecorator decorator = null;

    VanillaCone(){

    }

    public VanillaCone(IDecorator decorator) {
        this.decorator = decorator;
    }

    @Override
    public int getAmount() {
        if(this.decorator == null){
            return 7;
        }else {
            return this.decorator.getAmount() + 7;
        }
    }

    @Override
    public String getDescription() {
        if(this.decorator == null){
            return "Vanilla Cone";
        }else{
            return this.decorator+", Vanilla Cone";
        }
    }
}
