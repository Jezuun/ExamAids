/**
 * A class to calculate Salary and Net Pay for an employee.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Pay {
    
    private int wage;   
    private int hoursWeekly;
    private int salary;
    private int netPay;

    /**
     * Constructor for objects of class Pay.
     * This constructor initializes the wage and hours worked, and calculates salary and net pay.
     */
    public Pay(int wage, int hoursWeekly) {
        this.wage = wage;
        this.hoursWeekly = hoursWeekly;
        
       
    }

    /**
     * Method to calculate salary (wage * hoursWeekly).
     * 
     * @return the calculated salary
     */
    public int getSalary() {
        salary = wage * hoursWeekly;  
        return salary;
    }

    /**
     * Method to calculate net pay (70% of salary assuming 30% tax or deductions).
     * 
     * @return the calculated net pay
     */
    public int getNetPay() {
        
        double netPayDouble = salary * 0.7; 
        return (int) netPayDouble;  
    }

  
    public int getWage() {
        return wage;
    }

    public int getHoursWeekly() {
        return hoursWeekly;
    }

 

  
}


