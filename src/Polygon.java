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
     * Creates a Polygon object with sides, length, type, area, and perimeter
     * It also uses the variable check to see which toString to run
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
        perimeter = sides * length;
        return perimeter = Math.round(perimeter*1000)/1000.0;
    }

    /**
     * @return the area of the polygon
     */

    public double getArea() {
        area = (sides * (length * length)) / (4.0 * Math.tan((Math.PI / sides)));
        return area = Math.round(area*1000)/1000.0;
    }


    //mutators



    /**
     * @description Allows the user to change the number of sides on the polygon
     * @param newNumSides
     */

    public void setNumSides(int newNumSides) {
        if(sides <= 3) {
            sides = newNumSides;
        }
    }

    /**
     * @description Allows the user to change the length of the sides on the polygon
     * @param newSideLength
     */

    public void setSideLength(double newSideLength) {
        if(length <= 1.0){
            length = newSideLength;
        }
    }

    /**
     * @description Allows the user to change the name of the polygon
     * @param newShapeType
     */

    public void setShapeName(String newShapeType) {
        if(newShapeType != ("none")){
            type = newShapeType;
        }
    }


    //other methods

    /**
     *
     * @description calculates the perimeter of the polygon
     */

    public double calculatePerimeter() {
        perimeter = sides * length;
        return perimeter = Math.round(perimeter*1000)/1000.0;
    }

    /**
     *
     * @description calculates the area of the polygon
     */

    public double calculateArea() {
        area = (sides * (length * length)) / (4.0 * Math.tan((Math.PI / sides)));
        return area = Math.round(area*1000)/1000.0;
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