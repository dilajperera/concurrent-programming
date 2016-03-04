package diningPhilosopySolution;

public class Main {

    public static void main(String[] args){
        TokenHandler tokenHandler = new TokenHandler(4);
        ChopstickHandler chopstickHandler = new ChopstickHandler(5);

        Thread p1 = new Thread(new Philosopher("P1",tokenHandler,chopstickHandler));
        Thread p2 = new Thread(new Philosopher("P2",tokenHandler,chopstickHandler));
        Thread p3 = new Thread(new Philosopher("P3",tokenHandler,chopstickHandler));
        Thread p4 = new Thread(new Philosopher("P4",tokenHandler,chopstickHandler));
        Thread p5 = new Thread(new Philosopher("P5",tokenHandler,chopstickHandler));

        p1.start();
        p2.start();
        p3.start();
        p4.start();
        p5.start();

    }
}
