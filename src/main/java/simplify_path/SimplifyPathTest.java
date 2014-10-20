package simplify_path;

import static org.junit.Assert.*;

import org.junit.Test;

public class SimplifyPathTest {

	@Test
	public void test1() {
		String path = "/a/./b/../../c/";
		SimplifyPath sol = new SimplifyPath();
		String abspath = sol.simplifyPath(path);
		System.out.println(abspath);
		assertEquals("/c", abspath);
	}
	
	@Test
	public void test2() {
		String path = "/../";
		SimplifyPath sol = new SimplifyPath();
		String abspath = sol.simplifyPath(path);
		System.out.println(abspath);
		assertEquals("/", abspath);
	}

}
