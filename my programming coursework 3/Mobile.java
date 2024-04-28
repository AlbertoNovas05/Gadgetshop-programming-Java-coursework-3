import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;
  /**
 * The Mobile class represents a mobile phone, which is a subclass of Gadget.
 */
public class Mobile extends Gadget
{
    private int callingCredit; // Decleare an additional attribute to store a numeric value
    
    /**
     * Constructor to initialize the Mobile with model, price, weight, size, and calling credit.
     * @param model The model of the mobile phone.
     * @param price The price of the mobile phone in pounds.
     * @param weight The weight of the mobile phone in grams.
     * @param size The size of the mobile phone in mm (e.g., "71mm x 137mm x 9mm").
     * @param callingCredit The initial calling credit of the mobile phone.
     */
    public Mobile(String model, double price, int weight, String size, int callingCredit)
    {
        super(model, price, weight, size);
        this.callingCredit = callingCredit;
    }
    
    /**
     * Accessor method to retrieve the calling credit of the mobile phone.
     * @return The calling credit of the mobile phone.
     */
    public int getCallingCredit()
    {
        return callingCredit;
    }
    
    /**
     * Method to add calling credit to the mobile phone.
     * @param creditToAdd The amount of credit to add.
     */
    public void addCallingCredit(int creditToAdd)
    {
        if (creditToAdd>0)// Check if credit to add is positive
        {
            this.callingCredit += creditToAdd;//Add credit
        }
        else
        {
            System.out.println("Please enter a positive amount for calling credit."); // Prompt user for positive amount
        }
    }
    
    /**
     * Method to make a phone call.
     * @param phoneNumber The phone number to call.
     * @param durationMinutes The duration of the call in minutes.
     */
    public void makeCall(String phoneNumber, int durationMinutes)
    {
        if (callingCredit >= durationMinutes) // Check if enough credit for the call
        {
            System.out.println("Calling " + phoneNumber + " for " + durationMinutes + " minutes."); // If is true make the call
        }
        else
        {
            System.out.println("Insufficient credit to make the call.");// If is false display insufficient credit message
        }
    }
    
     /**
     * Display method to output the details of the mobile phone.
     */
    public void display()
    {
        super.display();// Call display method of superclass to output gadget details
        System.out.println("Calling credit: " + callingCredit + " minutes: ");// Output calling credit
    }

}
