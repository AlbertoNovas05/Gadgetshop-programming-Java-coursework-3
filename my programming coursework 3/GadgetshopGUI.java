import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;

/**
 * GadgetshopGUI class represents a graphical user interface for a gadget shop.
 * It extends Gadget class and implements ActionListener interface.
 */
public class GadgetshopGUI  implements ActionListener
 {
    // Text fields for user input
    private JTextField modelTextField;
    private JTextField priceTextField;
    private JTextField weightTextField;
    private JTextField sizeTextField;
    private JTextField availableMemoryTextField;
    

    private JFrame frame; // Frame for the GUI
    
    // Labels for different fields
    private JLabel modelLabel;
    private JLabel priceLabel;
    private JLabel weightLabel;
    private JLabel sizeLabel;
    private JLabel displayNumberLabel;
    private JLabel phoneNumberLabel;
    private JLabel durationLabel;
    private JLabel creditLabel;
    private JLabel availableMemoryLabel;
    
    // Buttons for different actions
    private JButton addMobileButton;
    private JButton makeCall;
    private JButton viewAll;
    private JButton DownloadMusic;
    private JButton clear;
    
    // Additional text fields for user input
    private JTextField modelTextbox;
    private JTextField priceTextbox;
    private JTextField weightTextbox;
    private JTextField sizeTextbox;
    private JTextField creditTextbox;
    private JTextField availableMemoryTextbox;
    private JTextField phoneNumberTextbox;
    private JTextField durationMinutesTextbox;
    private JTextField downloadSizeTextbox;
    private JTextField displayNumberTextbox;
    
    /**
     *ArrayList to store gadget items.
    */
    ArrayList<Gadget> item= new ArrayList<Gadget>();
    
    /**
     * Main method to start the application.
     * Creates an instance of GadgetshopGUI.
     * @param arg Command-line arguments (not used).
     */
    public static void main(String arg[]) 
    {
        GadgetshopGUI aGadgetshopGUI = new GadgetshopGUI();
    }
    
    /**
     * Constructor for the GadgetshopGUI class.
     * Initializes the GadgetshopGUI by creating the frame.
    */
    public GadgetshopGUI() 
    {
        makeFrame();// Create the frame
    }
    
    /**
     * Method to create and configure the frame for the GadgetShop GUI.
     */
    private void makeFrame() 
    {
        // Create a new frame with title "GadgetShop"
        frame = new JFrame("Alberto's GadgetShop");
        Container contentPane = frame.getContentPane();
        
        // Initialize labels and text fields for various gadget attributes
        modelLabel = new JLabel("Model:");
        modelTextbox = new JTextField(10);

        priceLabel = new JLabel("Price (£):");
        priceTextbox = new JTextField(10);

        weightLabel = new JLabel("Weight (grams):");
        weightTextbox = new JTextField(10);

        sizeLabel = new JLabel("Size:");
        sizeTextbox = new JTextField(10);

        creditLabel = new JLabel("Credit (mins):");
        creditTextbox = new JTextField(10);

        availableMemoryLabel = new JLabel("Initial Memory (MB):");
        availableMemoryTextbox = new JTextField(10);

        phoneNumberLabel = new JLabel("Phone Number:");
        phoneNumberTextbox = new JTextField(10);

        durationLabel = new JLabel("Duration (mins):");
        durationMinutesTextbox = new JTextField(10);

        JLabel downloadSizeLabel = new JLabel("Download Size (MB):");
        downloadSizeTextbox = new JTextField(10);

        displayNumberLabel = new JLabel("Display Number:");
        displayNumberTextbox = new JTextField(10);
        
        // Initialize buttons for various actions and add action listeners
        addMobileButton = new JButton("Add Mobile");
        addMobileButton.addActionListener(this);

        JButton addMP3Button = new JButton("Add MP3");
        addMP3Button.addActionListener(this);

        JButton MakeCallButton = new JButton("Make A Call");
        MakeCallButton.addActionListener(this);

        JButton ViewAllButton = new JButton("View All");
        ViewAllButton.addActionListener(this);
        
        JButton DownloadMusicButton = new JButton("Download Music");
        DownloadMusicButton.addActionListener(this);

        JButton addClearButton = new JButton("Clear");
        addClearButton.addActionListener(this);
        
        // Set layout and add components to the content pane
        contentPane.setLayout(new GridLayout(5,8));

        contentPane.add(modelLabel);
        contentPane.add(modelTextbox);
        
        contentPane.add(priceLabel);
        contentPane.add(priceTextbox);
        contentPane.add(weightLabel);
        contentPane.add(weightTextbox);
        contentPane.add(sizeLabel);
        contentPane.add(sizeTextbox);
        contentPane.add(creditLabel);
        contentPane.add(creditTextbox);
        contentPane.add(availableMemoryLabel);
        contentPane.add(availableMemoryTextbox);
        contentPane.add(displayNumberLabel);
        contentPane.add(displayNumberTextbox);
        contentPane.add(phoneNumberLabel);
        contentPane.add(phoneNumberTextbox);
        contentPane.add(durationLabel);
        contentPane.add(durationMinutesTextbox);
        contentPane.add(addMobileButton);
        contentPane.add(addMP3Button);
        contentPane.add(MakeCallButton);
        contentPane.add(DownloadMusicButton);
        contentPane.add(ViewAllButton);
        contentPane.add(addClearButton);
        
        contentPane.add (Box.createHorizontalGlue());
        contentPane.add (Box.createHorizontalGlue());
        contentPane.add (Box.createHorizontalGlue());
        contentPane.add (Box.createHorizontalGlue());
        contentPane.add (Box.createHorizontalGlue());
        
        frame.pack();// Pack components in the frame
        frame.setVisible(true);// Make frame visible

    }
    
    /**
     * ActionListener method to handle action events.
     * @param event The ActionEvent object representing the action performed.
     */
    public void actionPerformed(ActionEvent event)
    {
        // Get the action command from the event
        String command = event.getActionCommand();
        if(command.equals("Add Mobile")) // Perform actions based on the command
        {
            addMobile();// Call the addMobile method
        }

        if(command.equals("Add MP3")) 
        {
            addMP3();// Call the addMP3 method
        }

        if(command.equals("Make A Call"))
        {
            makeCall();// Call the makeCall method
        }

        if(command.equals("View All"))
        {
            viewAll();// Call the viewAll method
        }

        if(command.equals("Clear"))
        {
            clear();// Call the clear method
        }
    }
    
    /**
     * Method to add a new mobile gadget to the list of items.
     */
    public void addMobile()
    
    {   
        // Create a new Mobile object with the provided attributes
        Mobile newMobile = new Mobile(getaModel(),getprice(),getweight(),getsize(), getCredit());
        item.add(newMobile);// Add the new mobile gadget to the list of items
        // Display a success message
        JOptionPane.showMessageDialog(frame, "A new mobile has been successfully added.");
    }
    
    /**
     * Method to add a new MP3 gadget to the list of items.
     */
    public void addMP3() 
    {
        // Create a new MP3 object with the provided attributes
        MP3 newMP3 = new MP3(getaModel(), getprice(), getweight(), getsize(),getAvailableMemory());
        item.add(newMP3);// Add the new MP3 gadget to the list of items
        // Display a success message
        JOptionPane.showMessageDialog(frame, "A new MP3 has been successfully added.");
    }
    
    /**
     * Method to initiate a call using a mobile gadget.
     * Retrieves the gadget based on the display number and checks if it is a Mobile.
     * If it is a Mobile, initiates a call with the provided phone number and duration.
     * Displays an error message if the gadget is not a Mobile.
     */
    public void makeCall() 
    {
        Gadget gadget = item.get(getDisplayNumber());// Retrieve the gadget based on the display number
        
        // Check if the display number is valid and the gadget is a Mobile
        if(getDisplayNumber() != -1 && gadget instanceof Mobile)
        {
            Mobile mobile = (Mobile)item.get(getDisplayNumber());// Cast the gadget to a Mobile object
            mobile.makeCall(getPhoneNumber(), getDurationMinutes());// Make a call using the Mobile object
        } 
        else 
        {
            // Display an error message if the gadget is not a Mobile
            JOptionPane.showMessageDialog(frame, "ERROR!, This is not a mobile");
        }
    }
    
    /**
     * Method to view all gadgets in the list.
     * Iterates through the list of items and displays each gadget.
     */
    public void viewAll()
    {
           
        for(Gadget list:item)// Iterate through the list of items
        {
            // Display the index of the gadget in the list
           System.out.print(item.indexOf(list) + 1 + "\n");
            list.display();// Call the display method of the gadget
        }
    }
    
    /**
     * Method to clear all text fields in the GUI.
     */
    public void clear() 
    {
        // Set the text of all text fields to null
        modelTextbox.setText(null);
        priceTextbox.setText(null);
        weightTextbox.setText(null);
        sizeTextbox.setText(null);
        displayNumberTextbox.setText(null);
        phoneNumberTextbox.setText(null);
        durationMinutesTextbox.setText(null);
        availableMemoryTextbox.setText(null);
        creditTextbox.setText(null);
    }
    
    /**
     * Method to retrieve the calling credit from the credit text box.
     * Parses the integer value from the credit text box and returns it.
     * @return The calling credit retrieved from the credit text box.
     */
    public int getCredit()
    {
        int callingCredit = Integer.parseInt(creditTextbox.getText());// Parse the integer value from the credit text box
        return callingCredit;// Return the calling credit
    }
    
    /**
     * Private method to retrieve the price from the price text box.
     * Parses the double value from the price text box and returns it.
     * @return The price retrieved from the price text box.
     */
    private double getprice() 
    {
       double aPrice = Double.parseDouble(priceTextbox.getText());// Parse the double value from the price text box
        return aPrice;// Return the price
    }
    
    /**
     * Private method to retrieve the weight from the weight text box.
     * Parses the integer value from the weight text box and returns it.
     * @return The weight retrieved from the weight text box.
     */
    private int getweight()
    {
        int aWeight = Integer.parseInt(weightTextbox.getText());// Parse the integer value from the weight text box
        return aWeight;// Return the weight
    }
    
    /**
     * Private method to retrieve the size from the size text box.
     * Returns the text entered in the size text box.
     * @return The size retrieved from the size text box.
     */
    private String getsize() 
    {
        String aSize = sizeTextbox.getText();// Retrieve the text entered in the size text box
        return sizeTextbox.getText();// Return the size
    }
    
    /**
     * Method to retrieve the model from the model text box.
     * Returns the text entered in the model text box.
     * @return The model retrieved from the model text box.
     */
    public String getaModel() 
    {
        String aModel = modelTextbox.getText();// Retrieve the text entered in the model text box
        return aModel;// Return the model
    }
    
    
    /**
     * Method to retrieve the available memory from the AvailableMemory text box.
     * Parses the integer value from the text box and returns it.
     * @return The available memory retrieved from the AvailableMemory text box.
     */
    public int getAvailableMemory()
    {
        int AvailableMemory = Integer.parseInt(availableMemoryTextbox.getText());// Parse the integer value from the AvailableMemory text box
        return AvailableMemory;// Return the available memory
    }
    
    /**
     * Method to retrieve the display number from the displayNumber text box.
     * Parses the integer value from the text box and returns it.
     * @return The display number retrieved from the displayNumber text box.
     */
    public int getDisplayNumber() 
    {
        int displayNumber = -1; // Initialize the display number
    try 
    {
        displayNumber = Integer.parseInt(displayNumberTextbox.getText()); // Parse the integer value from the displayNumber text box
    } 
    catch (NumberFormatException e)
    {
        // Handle the case where the text is not a valid integer
        e.printStackTrace(); // You can log the error or handle it as needed
    }
    return displayNumber; // Return the display number
    }
    
    
    /**
     * Method to retrieve the duration in minutes from the durationMinutes text box.
     * Parses the integer value from the text box and returns it.
     * @return The duration in minutes retrieved from the durationMinutes text box.
     */
    public int getDurationMinutes() 
    {
        int DurationMinutes = Integer.parseInt(durationMinutesTextbox.getText());// Parse the integer value from the durationMinutes text box
        return DurationMinutes;// Return the duration in minutes
    }
    
    /**
     * Method to retrieve the phone number from the phoneNumber text box.
     * Returns the text entered in the phoneNumber text box.
     * @return The phone number retrieved from the phoneNumber text box.
     */
    public String getPhoneNumber()
    {
        String PhoneNumber = phoneNumberTextbox.getText();// Retrieve the text entered in the phoneNumber text box
        return PhoneNumber;// Return the phone number
    }
}

