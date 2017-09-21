package europesports;

/**
 * Created by ASUS on 04/01/2017.
 */
public class boltonFC implements football {
    @Override
    public String clubname() {
        String name = "BoltonFC";
        System.out.println( "You are Welcome to " + name);

        return null;
    }

    @Override
    public String pitchname(String club) {
        return null;
    }

    public String pitchname() {

        String Pitch = "Bolt";
        String size = "90MM";
        int goalnet = 2;
        double goalnetsize = 3.0;
        if (goalnetsize<3.0 || goalnetsize>3.0){
        System.out.println("sorry it has to be exact " + goalnetsize);}
        else if (goalnetsize==3.0){
            System.out.println("Welldone " + goalnetsize +" is the correct size");}
        else System.out.println("sorry i cant find the right size for you");


        String bolt = null;
        bolt.toUpperCase();
        System.out.println(bolt);

        return null;
    }

    @Override
    public String address() {
        return null;
    }

    @Override
    public String jesseycolours(String awaywear) {
        return null;
    }

    @Override
    public String typeofstaffs() {
        return null;
    }

    @Override
    public double salary() {
        return 0;
    }

    @Override
    public void allowance() {

    }

    @Override
    public double playersrequirments() {
        return 0;
    }

    @Override
    public boolean fifaregistration() {
        return false;
    }

    @Override
    public boolean healthandsafety() {
        return false;
    }

    @Override
    public String manager() {
        return null;
    }

    @Override
    public int players() {
        return 0;
    }

    @Override
    public int pitchstandardards() {
        return 0;
    }

    @Override
    public long clubaccount() {
        return 0;
    }

    @Override
    public boolean termsandconditions() {
        return false;
    }

    @Override
    public int employfromlocals() {
        return 0;
    }
}
