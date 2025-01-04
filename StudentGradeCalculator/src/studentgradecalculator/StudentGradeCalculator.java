package studentgradecalculator;

/**
 *
 * @author motsi
 */

import java.util.Scanner;
public class StudentGradeCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scanner = new Scanner(System.in);
        
        // asking for number of subjects from user input
        System.out.print("Please enter the number of subjects completed: ");
        int subjects = scanner.nextInt();
        
        // creating arrays to store the marks for each subject
        int [] subjectMarks = new int [subjects];
        int totalSubjectMarks = 0;
        
         // creating input for user to enter the marks for each subject
        for (int i = 0; i < subjects; i++)
        {
            System.out.print("Please enter the subject mark " + (i + 1) + "out of 100:" );
            subjectMarks[i] = scanner.nextInt();
            
            // Validating if marks are appropiate format
            while (subjectMarks[i] <0 || subjectMarks[i] >100)
            {       
                System.out.println("Marks entered are incorrect. Please enter a mark between 0 and 100.");
                System.out.print("Please enter subject mark "+ (i+1)+ ": ");
                subjectMarks[i] = scanner.nextInt();
            }
            totalSubjectMarks += subjectMarks[i];
        }
            // calculating the average of marks
            double marksAverage = totalSubjectMarks / (double) subjects;
        
             char finalGrade;
        if(marksAverage >=90)
        {
           finalGrade = 'A';
        } else if (marksAverage >=80){
            finalGrade ='B';
        }else if (marksAverage >=60){
            finalGrade ='C';
        }else if (marksAverage >=50){
            finalGrade ='D';
        }else{
            finalGrade ='F';
        }
        
        //display final student average
        System.out.println("\n---- Student Results ----");
        System.out.println("Total of Marks Captured: "+totalSubjectMarks);
        System.out.println("Average grade percentage for student: "+String.format("%.2f", marksAverage) + "%");
        System.out.println("Your grade is: "+ finalGrade);
    
    }
    
}
