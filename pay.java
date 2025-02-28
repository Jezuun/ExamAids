
/**
 * Write a description of class Salary here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class pay
{
    // instance variables - replace the example below with your own
    private int wage;   
    private int hoursWeekly;
    private int salary;
    private int netPay;

    /**
     * Constructor for objects of class Salary
     */
    // public calculateStart/**need to be put as class name*/(int wage, int hoursWeekly, int salary, int netPay)
    // {
          // this.wage = wage;
          // this.hoursWeekly = hoursWeekly;
          // this.salary = salary;
          // this.netPay = netPay;
        
    // }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int getSalary(int wage, int hoursWeekly)
    {
        // put your code here
     salary = wage * hoursWeekly;
     return salary;
    }
    
    public int getNetPay(int salary, int netPay)
    {
    // netPay = salary * 0,7; //don't know what to do with 0.7 (Maybe set it as tax?)
        return netPay;
        
    }
    }

