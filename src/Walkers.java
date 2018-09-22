import java.util.ArrayList;

public class Walkers {
    ArrayList<Walker> walkers;

    public Walkers(){
        walkers = new ArrayList<Walker>();
    }

    void run(){
        for(Walker w : walkers){
            w.step();
            w.display();
        }
    }

    void addWalker(Walker w){
        walkers.add(w);
    }
}
