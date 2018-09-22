import processing.core.PApplet;
import processing.opengl.*;
public class MainBall extends PApplet{
    Bouncer b = new Bouncer();
    public static PApplet pa;
    public static void main(String[] args){
        PApplet.main("MainBall",args);
    }

    public void setup(){
        background(255);
        pa = this;
    }

    public void settings(){
        size(600,600,pa.P3D);
    }

    public void draw(){
        background(255);

        b.location.add(b.velocity);


        if((b.location.x > width )||(b.location.x < 0)){
            b.velocity.x = b.velocity.x * -1;
        }
        if((b.location.y > height)||(b.location.y < 0)){
            b.velocity.y = b.velocity.y * -1;
        }
        stroke(0);
        fill(175);
        ellipse(b.location.x,b.location.y,16,16);
    }
}