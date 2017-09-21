package Salford.Uni;

import com.sun.glass.ui.Pixels;
import com.sun.org.apache.bcel.internal.generic.RETURN;

import java.io.File;
import java.util.Formatter;
import java.util.Hashtable;
import java.util.Scanner;

/**
 * Created by ASUS on 28/12/2016.
 */
public class old_students {


    public void graduation() {
        Hashtable<String, String> gradutes = new Hashtable<String, String>();
        gradutes.put("science", "Paul");
        gradutes.put("Accounting", "James");
        gradutes.put("Economics", "Laura");
        gradutes.put("Science", "Mary");
        gradutes.put("Art", "Alic");
        gradutes.put("Music", "Nigel");
        gradutes.put("science", "Theresa");
        gradutes.put("IT", "Abbey");
        gradutes.replace("IT", "Abbey");
        gradutes.size();
    }}


