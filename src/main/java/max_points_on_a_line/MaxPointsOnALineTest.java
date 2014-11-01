package max_points_on_a_line;

import static org.junit.Assert.*;

import org.junit.Test;
import max_points_on_a_line.MaxPointsOnALine.Point;

public class MaxPointsOnALineTest {

    @Test
    public void test1() {
        Point firstPt = new Point(0, 0);
        Point secondPt = new Point(0, 0);
        Point[] points = {firstPt, secondPt};
        
        MaxPointsOnALine sol = new MaxPointsOnALine();
        assertEquals(2, sol.maxPoints(points));
    }

    @Test
    public void test2() {
        Point[] points = {
            new Point(84,250),
            new Point(0,0),
            new Point(1,0),
            new Point(0,-70),
            new Point(0,-70),
            new Point(1,-1),
            new Point(21,10),
            new Point(42,90),
            new Point(-42,-230)
        };
        
        MaxPointsOnALine sol = new MaxPointsOnALine();
        assertEquals(6, sol.maxPoints(points));
    }
    
    @Test
    public void test3() {
        Point[] points = {
            new Point(2,3),
            new Point(3,3),
            new Point(-5,3)
        };
        
        MaxPointsOnALine sol = new MaxPointsOnALine();
        assertEquals(3, sol.maxPoints(points));
    }
    
    @Test
    public void test4() {
        Point[] points = {
            new Point(4,0),
            new Point(4,-1),
            new Point(4,5)
        };
        
        MaxPointsOnALine sol = new MaxPointsOnALine();
        assertEquals(3, sol.maxPoints(points));
    }
    
    @Test
    public void test5() {
        Point[] points = {
            new Point(0,0),
            new Point(-1,-1),
            new Point(2,2)
        };
        
        MaxPointsOnALine sol = new MaxPointsOnALine();
        assertEquals(3, sol.maxPoints(points));
    }
}
