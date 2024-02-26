package DesignPattern.Factory;

public class WebDeveloperFactory extends IDeveloperFactory{
    @Override
    public IDeveloper createDeveloper() {
        return new WebDeveloper();
    }
}
