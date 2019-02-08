package fi.iki.kimmoh;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Triangle {

    private Point p1;
    private Point p2;
    private Point p3;
    
    public static Triangle of(String ...  description) {
        if(description != null && description.length == 3) {
            
            Triangle triangle = new Triangle();
            
            triangle.p1 = Point.of(description[0]);
            triangle.p2 = Point.of(description[1]);
            triangle.p3 = Point.of(description[2]);
            
            return triangle;
            
        } else {
            throw new IllegalArgumentException("Description");
        }
    }

    public Point getP1() {
        return p1;
    }

    public Point getP2() {
        return p2;
    }

    public Point getP3() {
        return p3;
    }

    @Override
    public String toString() {
        return "Triangle [p1=" + p1 + ", p2=" + p2 + ", p3=" + p3 + "]";
    }
    
    
}
