package DesignPattern.Factory;

public class AngularFactory extends IDeveloperFactory{
    @Override
    public IDeveloper createDeveloper() {
        return new AngularDeveloper();
    }

}
