package Salford.Uni;

/**
 * Created by ASUS on 11/01/2017.
 */
public class Hospital {

    private int x;
    private int y;
    private int z;




    public Hospital(int x, int y, int z) {
        this.x= x;
        this.y=y;
        this.z=z;
    }



    public int getx() {

        return x + y+ z;
    }


    public int getY() {
        return y * x;
    }


    public int getZ() {
        return z-y;
    }
}
