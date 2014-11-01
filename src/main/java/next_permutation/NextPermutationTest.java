package next_permutation;

import org.junit.Test;

public class NextPermutationTest {
    NextPermutation sol = new NextPermutation();

    @Test
    public void test() {
        int[] A = {6, 8, 7, 4, 3, 2};
        System.out.println("Before Permutation:");
        for (int a : A) System.out.print(a + " ");
        System.out.println();
        
        sol.nextPermutation(A);
        
        System.out.println("Next Permutation:");
        for (int a : A) System.out.print(a + " ");
        System.out.println();
    }

}
