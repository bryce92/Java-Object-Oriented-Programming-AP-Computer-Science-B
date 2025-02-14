
/**
 * Write a description of class BMR here.
 * This program is to take a person's age, weight, height, gender to calculate 
 * his/her BMR rate for daily calories allowance
 * 
 * Based on the information on web-page: 
 *   http://www.bmi-calculator.net/bmr-calculator/bmr-formula.php
 *   
 * Original Harris-Benedict Equation:
 *   pMan  = (13.7516*m +  5.0033*h - 6.7550*a + 66.4730) kcal/day
 *   pWomen = (9.5634*m +  1.8496*h - 4.6756*a + 655.0955) kcal/day
 *   
 * @author (Eric Y. Chou) 
 * @version (V1, 01/09/15)
 */
public class BMR
{
    //Calculations
    private String name; 
    private char gender; 
    private int age; 
    private double height;        // height1 in cm
    private double weight;        // weight1 in kg
    private double bmr=0.0;             // BMR in calories Original Harris-Benedict Equation
    private double bmrRounded = 0.0;      // BMR rounded to 1 decimal digit in calories Original Harris-Benedict Equation (optional)
    
    public BMR(String name, char gender, int age, int height, int weight){
        this.name = name; 
        this.gender = gender; 
        this.age = age; 
        this.height = height*2.54;
        this.weight = weight*0.454; 
    }
    
    public String getName(){
        return name; 
    }
    
    public int getAge(){
        return age; 
    }
    
    public char getGender(){
        return gender; 
    }
    
    public double getHeight(){
        return height; 
    }
    
    public double getWeight(){
       return weight; 
    }
    
    public void setName(String name){
        this.name = name; 
    }
    
    public void setAge(int age){
        this.age = age; 
    }
    
    public void setGender(char gender){
        this.gender=gender; 
    }
    
    public void setHeight(double height){
        this.height = height; 
    }
    
    public void setWeight(double weight){
       this.weight = weight; 
    }
    
    private double rounded(double dd){
     double roundedDD = Math.round(dd*10.0)/10.0;   // To get a double number with 1 digit decimal point
     return roundedDD;
    }
    
    public double getBMR(){
        if (gender == 'M') {
           bmr = 13.7516*weight +  5.0033*height - 6.7550*age + 66.4730;
        }
        else if (gender == 'F'){
           bmr = 9.5634*weight +  1.8496*height - 4.6756*age + 655.0955; 
        }
        return bmr; 
    }
    
    public double getBMRRounded(){
        if (gender == 'M') {
           bmrRounded = rounded(13.7516)*weight +  rounded(5.0033)*height - rounded(6.7550)*age + rounded(66.4730); 
        }
        else if (gender == 'F'){
           bmrRounded = rounded(9.5634)*weight +  rounded(1.8496)*height - rounded(4.6756)*age + rounded(655.0955); 
        }
        return bmrRounded; 
    }
}
