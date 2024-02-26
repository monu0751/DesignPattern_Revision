package DesignPattern.Observer;
/*
* Here Subscriber means observer
* */
public class Subscriber {
    String name;
    Channel channel;

    public Subscriber(String name) {
        this.name = name;
    }

    void subscribeChannel(Channel channel){
        this.channel = channel;
    }
    public void sendMail() {
        System.out.println("Hey "+this.name+", New vedio "+this.channel.getVedio_name()+" has been uploaded");
    }
}
