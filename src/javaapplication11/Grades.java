
package javaapplication11;

import java.util.Scanner;


public class Grades {
    public void getGrade(){
        
        Scanner input = new Scanner(System.in);
        
        String name;
        int math, sci, eng, com;
     
        System.out.print("Enter your full name: ");  
        name = input.nextLine();
        System.out.print("Enter Marks in:\n");
        System.out.print("Math: ");
        math = input.nextInt();
        System.out.print("Science: ");
        sci = input.nextInt();
        System.out.print("English: ");
        eng = input.nextInt();
        System.out.print("Computer: ");
        com = input.nextInt();
       
        int totalMarks = math + sci + eng + com;
        double averageMarks = totalMarks / 4;
        
        System.out.println("-------------------");
        System.out.println("Grade Detail");
        System.out.println("-------------------");
       
        System.out.println("Name: " + name);
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Total Average: " + averageMarks);
        System.out.println("-------------------");
    }
}
    

