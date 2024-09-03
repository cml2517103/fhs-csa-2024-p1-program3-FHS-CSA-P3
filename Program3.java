//Program 3
//Extension of program 2 that now asks for user input when assigning the length and width of the sides
import java.util.Scanner; //This imports the console scanner that reads user input

public class Program3{
    public static void main(String[] args){
        Scanner squareSeer = new Scanner(System.in); //establishes Scanner
        System.out.print("Enter the length: ");
        int len = squareSeer.nextInt(); //requests and records length
        //nextLine automatically adds a new line
        System.out.print("Enter the width: ");
        int wid = squareSeer.nextInt(); //requests and records width
        System.out.println(); //extra line to separate input and output
        
        int area = len * wid;
        int perimeter = len + len + wid + wid; //calculates area and perimeter
        
        System.out.println("The length is " + len);
        System.out.println("The width is " + wid);
        System.out.println("The area is " + area);
        System.out.println("The perimeter is " + perimeter); //prints the entered and calculated values
    }
}
