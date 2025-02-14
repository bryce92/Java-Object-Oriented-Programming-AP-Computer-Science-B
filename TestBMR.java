import java.util.Scanner;

/**
 * Write a description of class TestBMR here.
 * 
 * @author (Eric) 
 * @version (V1 01/09/2016)
 */
public class TestBMR
{
       public static void main(String []args){
        //input
        Scanner input = new Scanner(System.in);
        //User Input
        System.out.print("Enter your name (First Last): ");
        String name = input.nextLine();
        System.out.print("Gender (M/F): ");
        char gender = input.nextLine().charAt(0);
        System.out.print("Enter your age: ");
        int age = input.nextInt(); 
        System.out.print("Height in inches: ");
        int height = input.nextInt();
        System.out.print("Weight in pounds: ");
        int weight = input.nextInt();
        
        BMR b = new BMR(name, gender, age, height, weight); 

        //print
        System.out.println("Basal Metabolic Rate Calculation");
        System.out.println("Name: " + b.getName());
        System.out.println("Gender: " + b.getGender()); 
        System.out.println("Age: " + b.getAge()); 
        // System.out.println("Weight (kg): "+weight1); 
        System.out.print("Weight (kg): ");        
        System.out.printf("%6.1f", b.getWeight());
        System.out.println(); 
        //System.out.println("Height (m): " + height1);
        System.out.print("Height  (m): ");
        System.out.printf("%6.1f", b.getHeight());
        System.out.println(); 
        System.out.println(); 
        
        // BMR output
        System.out.print("Basal Metabolic Rate: ");  
        System.out.printf("%6.1f", b.getBMR());
        System.out.println(" calories per day. (Harris-Benedict Equation)"); 
        System.out.print("Basal Metabolic Rate: ");  
        System.out.printf("%6.1f", b.getBMRRounded());
        System.out.println(" calories per day. (Rounded Harris-Benedict Equation)"); 
        System.out.println(); 
    }
}
