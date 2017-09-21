package europesports;

import java.util.*;

/**
 * Created by ASUS on 03/01/2017.
 */
public class mancityFC implements football {


    @Override
    public String clubname() {

        String clubname = "Manchester City FC";
        if (clubname.equalsIgnoreCase("Manchester City FC")) {
            return clubname;
        }
        return null;
    }

    @Override
    public String pitchname(String club) {

        String pitchname = "etihad";
        pitchname.isEmpty();
        System.out.println("Sorry pithname name needs to be available before proceeding");
        return null;
    }

    @Override
    public String address() {
        System.out.println(clubname() + "Address is N0 12, bbb road Manchester. M38 34T");
        return null;
    }

    @Override
    public String jesseycolours(String awaywear) {

        System.out.println("Hi, Please specify either 'Home' match or away 'match'");
        Scanner scanner = new Scanner(System.in);
        boolean jersey = scanner.nextBoolean();
        if (jersey == true) {
            System.out.println("Away match is Yellow jersey");
        } else System.out.println("Home is Blue Jersey");


        return null;
    }

    @Override
    public String typeofstaffs() {

        List<String> staffs = new ArrayList<String>();

        staffs.add("Doctor");
        staffs.add("Engineer");
        staffs.add("Cleaner");
        staffs.add("Horticulturist");
        staffs.add("Developers");
        staffs.add("Accountant");
        staffs.add("Auditors");
        staffs.add("Media Rep");
        staffs.add("Phisioteraphist");
        staffs.add("Consultant");
        staffs.add("Test Engineers");
        staffs.remove(3);
        System.out.println(staffs);
        return null;
    }

    @Override
    public double salary() {
        Hashtable<String, Double> salary = new Hashtable<String, Double>();

        int Experience = 5;
        salary.put("<5 Years Experience", 30000.00);
        salary.put("5 Years Experience", 40000.00);
        salary.put(">5 but <7years Experience", 50000.00);
        salary.put(" 7 Years Experience", 60000.00);
        salary.put(">7 Years Experience", 70000.00);
        if (Experience < 5) {
            System.out.println("your salary is 30000");
        } else if (Experience == 5) {
            System.out.println("Your salary is 400000");
        } else if (Experience > 5 && Experience < 7) {
            System.out.println("Your salary is 500000");
        } else if (Experience == 7) {
            System.out.println("Your salary is 600000");
        } else System.out.println("sorry i don't know your salary");

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


        System.out.println(clubname() + "is 2125584");
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

