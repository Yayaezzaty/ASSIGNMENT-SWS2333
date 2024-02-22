/** 
 * Program Purpose: To demonstrate the implementation of instance variables and methods of the class names Magazine
 * Programmer: Faq'rieyah Ezzaty
 * Date: 22/2/2024
 */

//import the respective package 
import javax.swing.JOptionPane;

//Driver class
public class FlowerShop1
{
    //Driver method
    public static void main(String[]args)
    {
        // Declaration of an array of size 10 name flowerArr
 Flower[]flowerArr = new Flower[10];
 
 //Declaration of all variables 
 String name,color,str;
 int quantity; 
 
 for(int i = 0;i< flowerArr.length; i++) 
 {
     name = JOptionPane.showInputDialog ("Enter the name of the flower" + (i + 1)+":");
     str = JOptionPane.showInputDialog("Enter the quantity of flower:");
     quantity = Integer.parseInt(str); //wrap from string to integer 
     color = JOptionPane.showInputDialog("Choose the color of the flower(Type R= Red or W = White)==>");
     
     //Instantiate each element of the array 
     flowerArr[i]= new Flower(); 
     
     //call the mutator to change change the object state
     flowerArr[i].setFlower(name, color, quantity);
     
     //call the toString method 
     
     System.out.println(flowerArr[i].toString());
     
    }//end of for
    
 int countR = 0, countW = 0;
 
 for(int i = 0; i < flowerArr.length; i++)
 {
     if(flowerArr[i].getColor().equalsIgnoreCase("Red"))
        countR++; //countR + 1
    else if (flowerArr[i].getColor().equalsIgnoreCase("White"))
             countW++; //countW + 1
    else 
         System.out.println("Incorrect color type!");
 
 } //end of for 
 
 JOptionPane.showMessageDialog(null,"Count for Red Flower:" + countR, "OUTPUT", JOptionPane.INFORMATION_MESSAGE);
 JOptionPane.showMessageDialog(null,"Count for White Flower:" + countW, "OUTPUT", JOptionPane.INFORMATION_MESSAGE);
 
        //Search for magazine title named Impiana
 for(int i = 0; i < 10; i++)
 {
     if(flowerArr[i].getColor().equalsIgnoreCase("Rose"))
        flowerArr[i].setFlower("Rose","Red",500);
    else 
         JOptionPane.showMessageDialog(null,"Sorry, the title that you are searching for is not in the array", "OUTPUT", JOptionPane.ERROR_MESSAGE);
        
 } //end of for 

 
 }//end of main
}//end of class
 