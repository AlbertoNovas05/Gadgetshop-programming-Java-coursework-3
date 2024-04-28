/**
 * The MP3 class represents a MP3 archive, which is a subclass of Gadget.
 */
public class MP3 extends Gadget
{
    private double availableMemory = 0; // Declear an additional attribute
    
    
    /**
 * Constructor to initialize the MP3 player with model, price, weight, size, and available memory.
 * @param model The model of the MP3 player.
 * @param price The price of the MP3 player in pounds.
 * @param weight The weight of the MP3 player in grams.
 * @param size The size of the MP3 player in mm (e.g., "71mm x 137mm x 9mm").
 * @param availableMemory The available memory of the MP3 player in megabytes.
 */
    public MP3(String model, double price, int weight, String size, double availableMemory)
    {
        // Calling the superclass constructor with the provided model, price, weight, and size
        super(model, price, weight, size);
        
        // Assigning the available memory of the MP3 player with the provided value.
        this.availableMemory = availableMemory;
    }
    
    /**
 * Accessor method to retrieve the available memory of the MP3 player.
 * @return The available memory of the MP3 player in megabytes.
 */
    public double getAvailableMemory()
    {
        return availableMemory;// Return the available memory of the MP3 player.
    }
    
    /**
 * Method to download music onto the MP3 player.
 * @param memoryUsed The amount of memory (in megabytes) required to download the music.
 */
    public void downloadMusic(double memoryUsed)
    {
        if (memoryUsed>0)// Check if there is enough available memory to download the music.
        {
        availableMemory -= memoryUsed;// If there is enough memory, reduce the memory used for the downloaded music.
            
        // Display a message indicating successful download and the remaining available memory.
         System.out.println("Music download successfuly! Available memory: " + availableMemory + "MB");
        }
        else
        {
             // If there is not enough memory, display an error message.
            System.out.println("Sorry, there is not enough memory to download the music.");
        }
    }
    
   /**
 * Method to delete music from the MP3 player.
 * @param memoryFreed The amount of memory (in megabytes) freed by deleting the music.
 */
    public void deleteMusic(int memoryFreed)
    {
        availableMemory += memoryFreed;// Increase the available memory by the memory freed from deleting the music.
        
        // Display a message indicating successful deletting proccess and the updated available memory.
        System.out.println("Music successfuly deleted! Available memory: " + availableMemory + "MB");
    }


    /**
 * Overrides the display method to include additional information about available memory.
 */
    @Override
    public void display()
    {
        super.display();// Call the superclass display method to display basic information.
        
        // Display the available memory of the MP3 player.
        System.out.println("available Memory: " +availableMemory+ "MB: ");
    }
}


