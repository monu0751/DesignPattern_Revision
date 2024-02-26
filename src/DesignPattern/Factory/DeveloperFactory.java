package DesignPattern.Factory;

public class DeveloperFactory {
    public static IDeveloper getDeveloper(DevType devType){
        IDeveloperFactory dev;
       if(devType == DevType.Web){
           dev = new WebDeveloperFactory();
           return dev.createDeveloper();
       } else {
           dev = new AngularFactory();
           return dev.createDeveloper();
       }
    }


}
