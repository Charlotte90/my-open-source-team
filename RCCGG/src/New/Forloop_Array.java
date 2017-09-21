package New;

import java.io.File;
import java.io.IOException;

/**
 * Created by ASUS on 20/12/2016.
 */
public class Forloop_Array {
public void fayal () throws IOException {
        File fil = new File("myfile.text");
         fil.createNewFile();{
        System.out.println("continue");
    }

}


public void forlooparray() {

    System.out.println("Name \t Surname");
    int student[] = {23, 45, 43, 23, 54, 67, 64, 66, 4, 54, 33,};
    for (int A = 0; A < student.length; A++) {
        System.out.println(A + "\t" + student[A]);
    }
}}