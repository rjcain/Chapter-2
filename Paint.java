//***************************************************************
//File: Paint.java
//
//Purpose: Determine how much paint is needed to paint the walls
//of a room given its length, width, and height
//***************************************************************
 
public class Paint
{ 
        public static void main(String[] args)
        {
            final int COVERAGE = 350;  //paint covers 350 sq ft/gal
            //declare integers length, width, and height;
            int length;
            int width;
            int height;
            //declare double totalSqFt;
            double totalSqFt;
            //declare double paintNeeded;
            double paintNeeded;
            //Declare and initialize the length of the room
            length = 15;
            //Declare and initialize the width of the room
            width = 11;
            //Declare and initialize the height of the room
            height = 8;
            //Compute the total square feet to be painted--think
            //about the dimensions of each wall
            totalSqFt = (length*width*height);
            //Compute the amount of paint needed
            paintNeeded = (int) (totalSqFt/350);
            //Print the length, width, and height of the room and the
            //number of gallons of paint needed.
            System.out.println("Length of room: " + length);
            System.out.println("Width of room: " + width);
            System.out.println("Height of room: " + height);
            System.out.println("Gallons of paint required: " + paintNeeded);
        }
}