
package rectanglearea;

import java.util.*;

public class RectangleArea {
   
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double length= getLength(sc);
        double width= getWidth(sc);
        double area= getArea(length,width);
        displayData(length,width,area);
    }
    
    //Get length input from user
    public static double getLength(Scanner sc){
        System.out.println("Enter the length of the rectangle: ");
        return sc.nextDouble();
    }
    
    //Get width input from user
    public static double getWidth(Scanner sc){
        System.out.println("Enter the width of the rectangle: ");
        return sc.nextDouble();
    }
    
    //Calculate area of the rectangle
    public static double getArea(double length,double width){
       double area = length * width;
       return area;
    }
    
    //Display the area of the rectangle
    public static void displayData(double length,double width,double area){
       System.out.println(length +" x "+ width +" = "+area+"\nThe area of the rectangle is "+ area);
    }
    
}
