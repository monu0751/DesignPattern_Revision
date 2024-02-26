package DesignPattern.Decorator;

public class ButterScotchScoop implements IDecorator{
    IDecorator decorator;

    public ButterScotchScoop(IDecorator decorator) {
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
            return "Butter scotch scoop";
        }else{
            return this.getDescription()+", Butter scotch scoop";
        }
    }
}
