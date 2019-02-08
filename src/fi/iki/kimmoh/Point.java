package fi.iki.kimmoh;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Point {

    private BigDecimal x;
    private BigDecimal y;
    private BigDecimal z;
    
    
    private final static Pattern DESCRIPTION = Pattern.compile("\\W*\\[\\W*(\\d+(\\.\\d+)?)\\W*,\\W*(\\d+(\\.\\d+)?)\\W*,\\W*(\\d+(\\.\\d+)?)\\W*\\]\\W*");
    
    public static Point of(long x, long y, long z) {
    	Point point = new Point();
    	point.x = BigDecimal.valueOf(x);
    	point.y = BigDecimal.valueOf(y);
    	point.z = BigDecimal.valueOf(z);
    	
    	return point;
    }
    
    public static Point of(String description) {
        
        Matcher matcher = DESCRIPTION.matcher(description);
        
        if(matcher.matches()) {
            Point point = new Point();
            point.x = new BigDecimal(matcher.group(1));
            point.y = new BigDecimal(matcher.group(3));
            point.z = new BigDecimal(matcher.group(5));
            return point;
        } else {
            throw new IllegalArgumentException("Point");
        }
    }
    
    public static Point findOrigin(Collection<Point> points) {
        
        Iterator<Point> itr = points.iterator();

        Point min = new Point();
        
        while(itr.hasNext()) {
            Point ref = itr.next();

            min.x = (min.x != null && min.x.compareTo(ref.x) < 0 ) ? min.x : ref.x;
            min.y = (min.y != null && min.y.compareTo(ref.y) < 0 ) ? min.y : ref.y;
            min.z = (min.z != null && min.z.compareTo(ref.z) < 0 ) ? min.z : ref.z;
        }
        
        return min;
    }
    
    public static Point minus(Point p1, Point p2) {

        Point min = new Point();
        min.x = p1.x.subtract(p2.x);
        min.y = p1.y.subtract(p2.y);
        min.z = p1.z.subtract(p2.z);
        
        return min;

    }

    public BigDecimal getX() {
        return x;
    }

    public BigDecimal getY() {
        return y;
    }

    public BigDecimal getZ() {
        return z;
    }

    @Override
    public String toString() {
        return "Point [x=" + x + ", y=" + y + ", z=" + z + "]";
    }
}
