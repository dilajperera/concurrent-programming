package diningPhilosopySolution;

import java.util.LinkedList;
import java.util.List;


public class ChopstickHandler {

    private List<Chopstick> chopsticks;

    public ChopstickHandler(int numOfTokens) {
        this.chopsticks = new LinkedList<>();
        for(int i = 0 ; i < numOfTokens; i++){
            this.chopsticks.add(new Chopstick("_id_"+i));
        }
    }

    public synchronized Chopstick acquireChopstick(){
        return !chopsticks.isEmpty() ? chopsticks.remove(0) : null;
    }

    public synchronized void releaseChopstick(Chopstick chopstick){
        chopsticks.add(chopstick);
    }

}

