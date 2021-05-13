package student.gpa;
import java.util.Scanner;

public class StudentGPA {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double totalPoints = 0;
        double totalCredits = 0;
        
        System.out.println("Enter number of subjects:");
        int sub = s.nextInt();
        if(sub>0){
            while(sub!=0){
            sub--;
            System.out.println("Enter name of subject:");
            String name = s.next();
            System.out.println("Enter value of credit:");
            double valueCredit = s.nextDouble();
            int gradeValue = 0 ;
            if(valueCredit>0){
                
                System.out.println("Enter value of points(A,B,C,D,F)");
                String valuePoint = s.next();
                
                switch (valuePoint){
                    case "A":
                        gradeValue=4;
                        break;
                    case "B":
                        gradeValue=3;
                        break;
                    case "C":
                        gradeValue=2;
                        break;
                    case "D":
                        gradeValue=1;
                        break;
                    case "F":
                        gradeValue=0;
                        break;
                    default:
                        System.out.println("Incorrect a valid grade.");
                        break;
                }
                System.out.println("Point of "+name+": "+valuePoint);
                System.out.println("Credit:"+name+": "+valueCredit);
            }
            double points = gradeValue * valueCredit;
            totalPoints += points;
            totalCredits += valueCredit;
        }
        }
        else{
            System.out.println("Incorrect name");
        }
        System.out.println("\n\n");
        System.out.println("Total Points:"+totalPoints);
        System.out.println("Total Credits:"+totalCredits);
        System.out.println("GPA:"+totalPoints/totalCredits);
    }
}
