import processing.core.PApplet;

public class MainNoise extends PApplet {
    float t;
    public static void main(String[] args){
        PApplet.main("MainNoise",args);
    }
    public void setup(){
        t = 0;
    }

    public void settings(){
        size(600,600);
    }

    public void draw(){
        float n = noise(t);
        float x = map(n,0,1,0,width);
        ellipse(x,180,16,16);
        t += .01;
    }
}
