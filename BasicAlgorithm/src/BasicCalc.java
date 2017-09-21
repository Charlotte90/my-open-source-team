/**
 * Created by retro20 on 1/12/17.
 */
public class BasicCalc {
    private double z;
    private double y;

    public BasicCalc(double z, double y) {
        this.z = z;
        this.y = y;
    }

    public double add(){
        System.out.println("Added two numbers");
        return z + y;
    }

    public double multiply() {
        System.out.println("Multiplied two numbers");
        return z * y;
    }

    public double divide(){
        System.out.println("Divided two numbers");
        return z / y;
    }
}
