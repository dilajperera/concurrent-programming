package diningPhilosopySolution;


public class Philosopher implements Runnable {

    private String name;
    private TokenHandler tokenHandler;
    private Token token;
    private ChopstickHandler chopstickHandler;
    private Chopstick leftChopstick;
    private Chopstick rightChopstick;

    public Philosopher(String name, TokenHandler tokenHandler, ChopstickHandler chopstickHandler) {
        this.name = name;
        this.tokenHandler = tokenHandler;
        this.chopstickHandler = chopstickHandler;
    }

    private void eat() {
        System.out.println(name +" : I am eating..");
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(name + " : I am done..");
        chopstickHandler.releaseChopstick(leftChopstick);
        chopstickHandler.releaseChopstick(rightChopstick);
        tokenHandler.releaseToken(token);
    }

    @Override
    public void run() {
        while (true){
                token = tokenHandler.acquireToken();
                if(token != null){
                    leftChopstick = chopstickHandler.acquireChopstick();
                    rightChopstick = chopstickHandler.acquireChopstick();
                    if(leftChopstick == null && rightChopstick != null){
                        chopstickHandler.releaseChopstick(rightChopstick);
                    }else if(leftChopstick != null && rightChopstick == null){
                        chopstickHandler.releaseChopstick(leftChopstick);
                    } else{
                        eat();
                    }
                }
        }
    }
}
