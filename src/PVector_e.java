import processing.core.PVector;

public class PVector_e {
    private float x;
    private float y;

    public PVector_e(float x_,float y_){
        x = x_;
        y = y_;
    }

    /**
     * This function adds another vector to this vector by
     * combinging the two x&y components.
     * @param v vector to be added
     */
    public void add(PVector_e v){
        y = y + v.y;
        x = x + v.x;
    }
}
