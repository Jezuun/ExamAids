
/**
 * Write a description of class Bird here.
 *
 * @author (Jesse)
 * @version (a version number or a date)
 */
public class Bird
{
    // instance variables - replace the example below with your own
    private String color;
    private String breed;
    private int age;

    public Bird(String color, String breed, int age){
    this.color = color;
    this.breed = breed;
    this.age = age;
    
    }
      public String getColor() {
        return color;
    }
    /**
     * Constructor for objects of class Bird
     */
    public void sing()
    {
        // initialise instance variables
        System.out.println("Bird_vocalization_in_action...");
    }

}