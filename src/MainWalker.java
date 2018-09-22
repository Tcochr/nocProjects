import processing.core.PApplet;

import java.util.ArrayList;

public class MainWalker extends PApplet {
    Walker w;
    public static PApplet P;
    Walkers walkers;
    public static void main(String[] args){
        PApplet.main("MainWalker",args);
    }
    public void setup(){
        P=this;
        w = new Walker();
        walkers = new Walkers();

        for(int i = 0; i < 2000; i++){
            Walker walker = new Walker();
            walkers.addWalker(walker);
        }

        background(255);
        frameRate(999999999);
    }

    public void settings(){
        size(1600,1600);
    }

    public void draw(){
        stroke(155);
        walkers.run();
//        w.step();
//        w.display();
    }
}
