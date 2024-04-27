import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.awt.event.ActionListener;
import java.util.*;

/**
 * The Gadget class represents a generic gadget with model, price, weight, and size attributes.
 */
public class Gadget
{

    private String model;
    private double price;
    private int weight;
    private String size;

    /**
     * Constructor to initialize the Gadget with model, price, weight, and size.
     * @param model The model of the gadget.
     * @param price The price of the gadget in pounds.
     * @param weight The weight of the gadget in grams.
     * @param size The size of the gadget in mm (e.g., "71mm x 137mm x 9mm").
     */
    public Gadget(String model, double price, int weight, String size)
    {
       this.model = model;
       this.price = price;
       this.weight = weight;
       this.size = size;
    }
    
    public Gadget()
    {
      
    }
    
    /**
     * Accessor method to retrieve the model of the gadget.
     * @return The model of the gadget.
     */
    public String getModel()
    {
        return model;
    }
    
    /**
     * Accessor method to retrieve the price of the gadget.
     * @return The price of the gadget.
     */
    public double getPrice()
    {
        return price;
    }
    
    /**
     * Accessor method to retrieve the weight of the gadget.
     * @return The weight of the gadget.
     */
    public int getWeight()
    {
        return weight;
    }
    
    /**
     * Accessor method to retrieve the size of the gadget.
     * @return The size of the gadget.
     */
    public String getSize()
    {
        return size;
    }
    
    /**
     * Display method to output the details of the gadget.
     */
    public void display()
    {
        System.out.println("Model: " + model);
        System.out.println("Price: £ " + price);
        System.out.println("Weight: " + weight + "grams");
        System.out.println("Size: " + size);
    }
    
}
