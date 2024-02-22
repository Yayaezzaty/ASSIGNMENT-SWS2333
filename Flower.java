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
    
    //declaration of a constant variable 
    final double PRICE_PLAIN_PAPER = 0.08;
    
    //Contructor without param
    public Flower()
    {
        name = null; //title = "";//empty string
        color = null;
        price = 0;
        quantity = 0;
    } //end of constructor
    
    //Constructor with param /normal constructor
    public Flower(String name, String color, double price, int quantity)
    {
        this.name = name;
        this.color = color;
        this.price = price;
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
    
    public double getPrice()
    {
        return price ;
    } //end of accessor
    
    public int getQuantity()
    {
        return quantity ;
    } //end of accessor
    
    //Mutator for all data members 
    public void setFlower(String name, String color, double price, int quantity)
    {
        this.name = name;
        this.color = color;
        this.price = price;
        this.quantity = quantity;
        
    } //end of mutator
        
    //toString method 
    public String toString()
    {
        return ("Flower Name = " +name+ 
                "\nColor =" + color+
                 "\nPrice =" + price+
                 "\nQuantity =" + quantity );
    }//end of toString 
  
    
    
}//end of class