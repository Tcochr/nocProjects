public class Walker {
    private float x;
    private float y;
    private float tx,ty;
    private int dx = 1;

    public Walker(){

//       this.x = (int)MainWalker.P.random(MainWalker.P.width);
//       this.y = (int)MainWalker.P.random(MainWalker.P.height);

        tx=0;
        ty = 10000;
        this.x = MainWalker.P.width/2;
        this.y = MainWalker.P.height/2;
    }

    public void display(){
        MainWalker.P.stroke(MainWalker.P.random(0,255),MainWalker.P.random(0,255),MainWalker.P.random(0,255));
        MainWalker.P.point(x,y);
    }

    public void step(){
//        x = MainWalker.P.noise(tx);
//        y = MainWalker.P.noise(ty);
//        tx++;
//        ty++;
////
//        tx += 0.01;
//        ty += 0.01;

        float r = MainWalker.P.random(1);
        if(r < .39){
            x++;
        }else if(r < .45){
            x--;
        }else if(r < .47){
            y++;
        }else{
            y--;
        }

//        float targetX = MainWalker.P.mouseX;
//        float targetY = MainWalker.P.mouseY;
//        float dy = targetY-y;
//        float dx = targetX-x;
//        float easing = (float) 0.0005;
//
//        float r = MainWalker.P.random(1);
//        if(r < .5){
//            x += dx*easing;
//            y += dy*easing;
//        }else if(r < .6){
//            x--;
//        }else if(r < .7){
//            y++;
//        }else{
//            y--;
//        }

//        float stepx = MainWalker.P.random(-1,1);
//        float stepy = MainWalker.P.random(-1,1);
//        x+=stepx;
//        y+=stepy;

//        int choice = (int)(MainWalker.P.random(4)); //Pick 0,1,2 or 3
//        if(choice == 0){
//            this.x+=dx;
//        }else if(choice == 1){
//            this.x-=dx;
//        }else if(choice ==2){
//            this.y+=dx;
//        }else{
//            this.y-=dx;
//        }
    }
}
