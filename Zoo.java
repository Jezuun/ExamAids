import java.util.ArrayList;

public class Zoo {
   
    private ArrayList<Bird> zooBirds;

    private int countBlueBirds;

   
    public Zoo() {
        zooBirds = new ArrayList<>();  
        countBlueBirds = 0;           
    }

    // Method to add a bird to the zoo
    public void addBird(Bird bird) {
        zooBirds.add(bird);  
        if (bird.getColor().equals("blue")) {
            countBlueBirds++;  
        }
    }

    public int getBlueBirdCount() {
        return countBlueBirds;  
    }

  
    }


    




