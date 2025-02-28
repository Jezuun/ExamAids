 
/**
 * Write a description of class AgeCalculator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class AgeCalculator
{
    // Instance variables
    private int currentYear = 2025;  
    private int yrOfBirth;           
    private int yearsWait;           
    private int yrAge;             
    private int legalAge = 16;       

 
    public int setYear(int yrOfBirth) {
        this.yrOfBirth = yrOfBirth;
        return yrOfBirth; 
    }

    public int getAge() {
        yrAge = currentYear - yrOfBirth;  
        return yrAge;                     
    }

    public int waitTime() {
        yearsWait = legalAge - yrAge;    
        return yearsWait;                
    }

    public static void main(String[] args) {
       
        AgeCalculator calculator = new AgeCalculator();

        
        calculator.setYear(2010);

        int age = calculator.getAge();

        
        if (age >= calculator.legalAge) {
            System.out.println("You're legally able to drive.");
        } else {
 
            int waitTime = calculator.waitTime();
            System.out.println("You're unable to drive for " + waitTime + " years.");
        }
    }
}
