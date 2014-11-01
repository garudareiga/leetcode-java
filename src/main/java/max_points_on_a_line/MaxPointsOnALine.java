package max_points_on_a_line;

/**
 * 
 * @author raychen
 * 
 * Problem:
 * Given n points on a 2D plane, find the maximum number of points that 
 * lie on the same straight line.
 */

/**
 * Definition for a point.
 */

import java.util.*;

public class MaxPointsOnALine {
    static public class Point {
        int x;
        int y;
        Point() { x = 0; y = 0; }
        Point(int a, int b) { x = a; y = b; }
    }
    
    public int maxPoints(Point[] points) {
    	int N = points.length;
    	if (N == 0) return 0;
    	
    	int result = 0;
    	HashMap<Double, Integer> slope_count = new HashMap<Double, Integer>();
    	for (int i = 0; i < N; i++) {
    		int numDup = 0, numInf = 0;
    		for (int j = i + 1; j < N; j++) {
    			Point pa = points[i], pb = points[j];
    			if (pa.x == pb.x && pa.y == pb.y) 
    				numDup++;
    			else if (pa.x == pb.x)
    				numInf++;
    			else {
    				double slope = pb.y == pa.y ? 0.0 : (double)(pb.y - pa.y)/(pb.x - pa.x);
    				if (slope_count.containsKey(slope)) 
    					slope_count.put(slope, slope_count.get(slope) + 1);
    				else
    					slope_count.put(slope, 1);
    			}
    		}
    		for (int count : slope_count.values()) result = Math.max(result, count + numDup + 1);
    		result = Math.max(numInf + 1 + numDup, result);
    		slope_count.clear();
    	}
    	return result;
    }
}
