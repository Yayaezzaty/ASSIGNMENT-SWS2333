/**
 * Program Purpose:To define the attributes and behaviour of the Flower class
 * Programmer:Faq'rieyah
 * Date: 22 Febuary 2024 
 */

//Import the respective package import javax.swingJOptionPane;

public class Flower
{
    //declaration of the instance variables 
    private String name; //Impiana,Anjung Seri
    private String color;
    private double price;
    private int quantity;
 
    //Contructor without param
    public Flower()
    {
        name = null; //title = "";//empty string
        color = "";
        quantity = 0;
    } //end of constructor
    
    //Constructor with param /normal constructor
    public Flower(String name, String color, double price, int quantity)
    {
        this.name = name;
        this.color = color;
        this.quantity = quantity;
    } //end of constructor
    
    //Accessor/retriever/getter
    public String getName()
    {
        return name;
    } //end of accessor
    
    public String getColor()
    {
        return color;
    } //end of accessor 
    
    
    public int getQuantity()
    {
        return quantity ;
    } //end of accessor
    
    //Mutator for all data members 
    public void setFlower(String name, String color, int quantity)
    {
        this.name = name;
        this.color = color;
        this.quantity = quantity;
        
    } //end of mutator
    
    //calcCost method
    public double calcCost(String color)
    {
         double colorCost = 0.0;
        
        if(color.equalsIgnoreCase("R"))
           colorCost = 80;
           
        else if (color.equalsIgnoreCase("W"))
                 colorCost = 90;
                 
        else 
           System.out.println("Incorrect input! Please choose the correct material!");
           //end of if
           
            double cost = (quantity * colorCost);
           
           return cost;
        }//end of calcCost
        
    //toString method 
    public String toString()
    {
        return ("Flower Name = " +name+ 
                "\nColor =" + color+
                 "\nQuantity =" + quantity +
                 "\nCost of =" + calcCost(color));
    }//end of toString 
  
    
    
}//end of class