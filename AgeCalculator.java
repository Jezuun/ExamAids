 
/**
 * Write a description of class AgeCalculator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class AgeCalculator
{
    // instance variables - replace the example below with your own
    private int currentYear = 2025;
    private int yrOfBirth;
    private int yearsWait;
    private int yrAge;
    private int legalAge = 16;
    
    // public int setYear(int yrOfBirth) {
        // this.yrOfBirth = yrOfBirth;
        
        // /** forgot to write the return method (return yrOfBirth) */
    // }
    public int getAge (int yrOfBirth, int currentYear, int yrAge)
    {
        yrAge = currentYear - yrOfBirth; /** messed up the written order which
        previously was currentYear - yrOfBirth = yrAge; */
        return yrAge;
    }
    // public int waitTime (int yrAge, int legalAge, int waitTime)/**waitTime not written in original*/
    // {waitTime = legalAge - yrAge; /** missing return value*/
// }

///** Missing semicolon (;) after System.out.println() statements: In Java, each statement needs to end with a semicolon (;). You have missing semicolons after both System.out.println() statements.

//Mismatched braces ({ and }): There's an extra closing brace (}) after the else block that doesn't match up with the opening brace. */

//if (yrAge >= legalAge) {
   // System.out.println("you're legally able to drive")
//}
//else {System.out.println("you're unable to drive for" + waitTime + "years."}
//}
    }

    