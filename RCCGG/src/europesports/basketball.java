package europesports;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by ASUS on 07/01/2017.
 */
public abstract class basketball {

    public void training(boolean school) {

        int minimumtraining = 4;
        String name = "Londonteam";
        System.out.println(name + "trains" + minimumtraining + "in a week");
    }


    abstract double salary();

    {
        double sal = 34000.00;
        System.out.println("Weekly salary is " + sal);
    }

   abstract String time();{
        Date date= new Date();
        SimpleDateFormat simpleDateForm = new SimpleDateFormat("E dd:mm:yyyy 'at' hh:mm:ss");
        String night= simpleDateForm.format(date);
        System.out.println(date);

        }


    abstract void allowance();
        }