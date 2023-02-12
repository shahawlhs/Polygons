import java.text.DecimalFormat;

/**
 * @file Polygon Java
 * @date 2/2/23
 * @author Ajay Shah
 *
 * @description Creates a polygon with a user determined number of sides, side length, and shape type.
 */

public class Polygon {
    //instance variables
    private int sides;
    private double length;
    private String type;
    private double area;
    private double perimeter;
    private boolean check;

    //default constructor
    public Polygon() {
        sides = 3;
        length = 1.0;
        perimeter = 3.0;
        area = 0.433;
        type = "Triangle";
    }


    //overload constructor

    /**
     * Creates a Polygon object with sides, length, and type
     *
     * @param s number of sides the polygon has
     * @param l length of each side
     * @param t type of polygon
     */

    public Polygon(int s, double l, String t) {
        if (s < 2 || l < 0.0) { //evaluates t
            sides = 3;
            length = 1.0;
            perimeter = 3.0;
            area = 0.433;
            type = "Triangle";
            check = false;
        } else {
            sides = s;
            length = l;
            type = t;
            calculateArea();
            calculatePerimeter();
            check = true;
        }
    }


    //accessors

    /**
     * @return the number of sides on the polygon
     */

    public int getNumSides() {
        return sides;
    }

    /**
     * @return the length of each side of the polygon
     */

    public double getSideLength() {
        return length;
    }

    /**
     * @return the type of polygon
     */

    public String getShapeType() {
        return type;
    }

    /**
     * @return the perimeter of the polygon
     */

    public double getPerimeter() {
        return perimeter;
    }

    /**
     * @return the area of the polygon
     */

    public double getArea() {
        return area;
    }


    //mutators

    public void setNumSides(int newNumSides) {
        sides = newNumSides;
    }

    public void setSideLength(double newSideLength) {
        length = newSideLength;
    }

    public void setShapeName(String newShapeType) {
        type = newShapeType;
    }


    //other methods

    public double calculatePerimeter() {
        perimeter = sides * length;
        return perimeter;
    }

    public double calculateArea() {
        area = (sides * (length * length)) / (4.0 * Math.tan((Math.PI / sides)));
        return area;
    }

    //toString method

    /**
     * @return Prints the type of polygon with the number of sides and the length of each side
     */

    public String toString() {
        DecimalFormat df = new DecimalFormat("#.###");
        if (check == false) {
            return "Not a valid polygon. Your polygon was given a default of " + sides + ", was named " + type + ", and each side has a length of " + length + " units.";
        }
        else {
            return "Your shape is a " + type + " and it has " + sides + " sides. It has a side length of " +
                    df.format(length) + ". The perimeter of your shape is " + df.format(perimeter) + ". The area of your shape is " + df.format(area) + " units squared.";
        }
    }
}