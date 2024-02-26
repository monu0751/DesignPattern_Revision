package DesignPattern.Observer;

public class Main {
    public static void main(String[] args) {

        Subscriber s1 = new Subscriber("Abhinav");
        Subscriber s2 = new Subscriber("Nisha");
        Subscriber s3 = new Subscriber("Shelu");
        Subscriber s4 = new Subscriber("Shiva");
        Subscriber s5 = new Subscriber("Golu");

        Channel tutorial = new Channel("channel tutorial");
        tutorial.subscribe(s1);
        tutorial.subscribe(s2);
        tutorial.subscribe(s3);
        tutorial.subscribe(s4);
        tutorial.subscribe(s5);

        s1.subscribeChannel(tutorial);
        s2.subscribeChannel(tutorial);
        s3.subscribeChannel(tutorial);
        s4.subscribeChannel(tutorial);
        s5.subscribeChannel(tutorial);

        tutorial.uploadVedio("Design Pattern");

        tutorial.unSuscribe(s5);

        tutorial.uploadVedio("Oops");



    }
}
