package q03;
import java.util.Scanner;
import java.lang.Math;

public class RtTriangle extends AbstractShape {
    private double base;
    private double height;
    /**
     * Initializes the shapeName.
     *
     * //@param shapeName the kind of shape
     */
    public RtTriangle() {
        super("RtTriangle");
    }

    public RtTriangle(double base, double height) {
        super("RtTriangle");
        this.base = base;
        this.height = height;
    }

    @Override
    public double computeArea() {
        return (base * height) / 2.0;
    }

    @Override
    public double computePerimeter() {
        double hypotTemp = Math.sqrt(Math.pow(base, 2) + Math.pow(height, 2));
        return hypotTemp + base + height;
    }

    @Override
    public void readShapeData() {
        Scanner in = null;

        try {
            in = new Scanner(System.in);

            System.out.println("Enter the base of the Rt Triangle");
            base = in.nextDouble();
            System.out.println("Enter the height of the Rt Triangle");
            height = in.nextDouble();
        }
        finally {
            if (in != null)
                in.close();
        }

    }

    public double setHeight(double height) {
        return this.height;
    }

    public double setWidth(double base) {
        return this.base;
    }

    @Override
    public double getWidth() {
        return base;
    }

    @Override
    public double getHeight() {
        return height;
    }
}
