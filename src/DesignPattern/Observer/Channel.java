package DesignPattern.Observer;

import java.util.ArrayList;
import java.util.List;
/*
* Here Channel means Observal
* */
public class Channel {
    List<Subscriber> subscriberList = new ArrayList<>();
    String vedio_name;
    String name;

    public Channel(String name) {
        this.name = name;
    }

    public List<Subscriber> getSubscriberList() {
        return subscriberList;
    }

    public void setSubscriberList(List<Subscriber> subscriberList) {
        this.subscriberList = subscriberList;
    }

    public String getVedio_name() {
        return vedio_name;
    }

    public void setVedio_name(String vedio_name) {
        this.vedio_name = vedio_name;
    }

    void subscribe(Subscriber subscriber){
        this.getSubscriberList().add(subscriber);
    }

    void unSuscribe(Subscriber subscriber){
        this.getSubscriberList().remove(subscriber);
    }

    void notifySubscriber(){
        for(Subscriber subscriber : this.getSubscriberList()){
            subscriber.sendMail();
        }
    }

    void uploadVedio(String vedio_name){
        this.setVedio_name(vedio_name);
        System.out.println("New Vedio: "+this.vedio_name+" has been uploaded.");
        this.notifySubscriber();
    }
}
