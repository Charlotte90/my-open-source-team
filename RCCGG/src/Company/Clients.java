package Company;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ASUS on 24/12/2016.
 */
public class Clients {

    private List <String>clientsname;

    public void Myclietslist(){
        List <String>clientsname = new ArrayList<String>();
        clientsname.add("Natwest");
        clientsname.add("Lloyds");
        clientsname.add("Satanda");
        clientsname.add("Halifax");
        clientsname.add("Backlays");
        clientsname.add("United Nation");
        System.out.println(clientsname.size());
        clientsname.remove((2));
            }





    public void getclients() {
        for (int A = 0; A < clientsname.size(); A++){
            System.out.println(clientsname.get(A));
        }}



public void Pra(){
    int a = 0;
    while (a<10) {
    System.out.println(a); a++;

}}}
