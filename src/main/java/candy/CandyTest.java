package candy;

import static org.junit.Assert.*;

import org.junit.Test;

public class CandyTest {

    @Test
    public void test() {
        int ratings[] = {2, 1};
        Candy sol = new Candy();
        assertEquals(3, sol.candy(ratings));
    }

}
