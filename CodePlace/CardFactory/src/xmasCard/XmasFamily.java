package xmasCard;

import java.util.Scanner;

public class XmasFamily {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

        System.out.println("Please enter your team league point");
        Scanner scanner = new Scanner(System.in);
                int leaguePoint = scanner .nextInt();
        /*String clubName = scanner .nextLine();*/

        if (leaguePoint >= 0 && leaguePoint <= 10){
            System.out.println("Your team may be relegated to a lower league ");
        }else if (leaguePoint >= 11 && leaguePoint <= 20){
            System.out.println("Your team can do better" );
        }else if (leaguePoint >= 21 && leaguePoint <= 30){
            System.out.println("Your team had a good season so far" );
        }else if (leaguePoint >= 31 && leaguePoint <= 40){
            System.out.println("We welcome your team to Champions league" );
        }if (leaguePoint >= 37 && leaguePoint <= 40){
            System.out.println("Congratulations on your EPL Victory" );
        }

    }

	
}




