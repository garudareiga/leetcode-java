package simplify_path;

import java.util.*;

/**
 * 
 * @author raychen
 * 
 * Problem:
 * Given an absolute path for a file (Unix-style), simplify it.
 * 
 * For example,
	path = "/home/", => "/home"
	path = "/a/./b/../../c/", => "/c"

 * click to show corner cases.
 * Corner Cases:
 * Did you consider the case where path = "/../"?
 * In this case, you should return "/".
 * Another corner case is the path might contain multiple slashes '/' together, 
 * such as "/home//foo/".
 * In this case, you should ignore redundant slashes and return "/home/foo".
 */

public class SimplifyPath {
    public String simplifyPath(String path) {
    	String[] dirs = path.split("/");
    	Stack<String> abspath = new Stack<String>();
    	for (String dir : dirs) {
    		if ("".equals(dir) == true || ".".equals(dir) == true)
    			continue;
    		if ("..".equals(dir) == true) {
    			if (abspath.size() > 0) 
    				abspath.pop();
    			continue;
    		}
    		abspath.push(dir);
    	}
    	StringBuilder sb = new StringBuilder();
    	if (abspath.isEmpty()) {
    		sb.append("/");
    	} else {
    		for (String dir : abspath)
    			sb.append("/" + dir);
    	}
    	return sb.toString();
    }
}
