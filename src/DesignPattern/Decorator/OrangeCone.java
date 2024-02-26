package DesignPattern.Decorator;

public class OrangeCone implements IDecorator{
    IDecorator decorator = null;

    OrangeCone(){

    }

    public OrangeCone(IDecorator decorator) {
        this.decorator = decorator;
    }

    @Override
    public int getAmount() {
        if(this.decorator == null){
            return 5;
        }else {
            return this.decorator.getAmount() + 5;
        }
    }

    @Override
    public String getDescription() {
        if(this.decorator == null){
            return "Orange Cone";
        }else{
            return this.getDescription()+", Orange Cone";
        }
    }
}
