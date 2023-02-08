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

    //default constructor
    public Polygon(){
        sides = 3;
        length = 1.0;
        type = "triangle";
    }


    //overload constructor

    /**
     * Creates a Polygon object with sides, length, and type
     *
     * @param s number of sides the polygon has
     * @param l length of each side
     * @param t type of polygon
     */

    public Polygon(int s, double l, String t){
        if (s < 2 || l < 0.0){ //evaluates t
            sides = 3;
            length = 1.0;
            type = "triangle";
        }
        else {
            sides = s;
            length = l;
            type = t;

        }
    }


    //accessors

    /**
     *
     * @return the number of sides on the polygon
     */

    public int getNumSides(){
        return sides;
    }

    /**
     *
     * @return the length of each side of the polygon
     */

    public double getSideLength(){
        return length;
    }

    /**
     *
     * @return the type of polygon
     */

    public String getShapeType(){
        return type;
    }

    //toString method

    /**
     *
     * @return Prints the type of polygon with the number of sides and the length of each side
     */

    public String toString(){
        DecimalFormat df = new DecimalFormat("#.##");
        return "Your shape is a " + type + " with " + sides + " sides and a length of " + df.format(length) + ".";
    }
}