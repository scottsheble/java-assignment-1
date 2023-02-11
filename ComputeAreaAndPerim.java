package q03;

import java.util.Scanner;

public class ComputeAreaAndPerim {

    /**
     * The main program performs the following steps.
     * 1. It asks the user for the type of figure.
     * 2. It asks the user for the characteristics of that figure.
     * 3. It computes the perimeter.
     * 4. It computes the area.
     * 5. It displays the result.
     * @param args The command line arguments -- not used
     */
    public static void main(String[] args) {
        AbstractShape myShape;
        double perimeter;
        double area;

        //Ask for figure type
        myShape = getShape();
        //Read the shape data
        myShape.readShapeData();

        //Compute perimeter
        perimeter = myShape.computePerimeter();
        //Compute the area
        area = myShape.computeArea();
        //Display the result
        displayResult(area, perimeter);
        //Exit the program
        System.exit(0);
    }

    /**
     * Ask the user for the type of figure.
     * @return An instance of the selected shapec
     */
    public static AbstractShape getShape() {
        @SuppressWarnings("resource")
        Scanner in = new Scanner(System.in);

        System.out.println("Enter C for circle");
        System.out.println("Enter R for Rectangle");
        System.out.println("Enter T for Right Triangle");
        String figType = in.next();

        switch (figType) {
            case "C": case "c":
                return new Circle();
            case "R": case "r":
                return new Rectangle();
            //Please open the following comment for testing A01_Q3
            //Select the lines of code, then use "Ctrl"+"/" keys to toggle comments
            case "T": case "t":
	            return new RtTriangle();
            default:
                return null;
        }
    }

    /**
     * Display the result of the computation.
     * @param area The area of the figure
     * @param perim The perimeter of the figures
     */
    private static void displayResult(double area, double perim) {
        System.out.printf("%nThe area is %.2f%nThe perimeter is %.2f%n",
                area, perim);
    }
}

