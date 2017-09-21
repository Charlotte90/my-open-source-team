package code.packs._3_decisions_concepts;

import java.util.Scanner;

/**
 * Created by dotcom on 22/12/16.
 */
public class ExamGrade {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            double myTestScore = scanner.nextDouble();
            char grade ;

            if (myTestScore >= 90) {
                grade = 'A';
                if(myTestScore >= 95){
                    System.out.println("You won a scholarship");
                }else{
                    System.out.println("You missed the scholarship this term");
                }
            } else if (myTestScore >= 80) {
                grade = 'B';
            } else if (myTestScore >= 70) {
                grade = 'C';
            } else if (myTestScore >= 60) {
                grade = 'D';
            } else {
                grade = 'F';
            }
            System.out.println("Grade = " + grade);
        }

}
