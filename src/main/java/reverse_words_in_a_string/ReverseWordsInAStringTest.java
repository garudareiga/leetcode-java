package reverse_words_in_a_string;

import org.junit.Test;

public class ReverseWordsInAStringTest {

    @Test
    public void test1() {
        ReverseWordsInAString sol = new ReverseWordsInAString();
        System.out.println(sol.reverseWords("the sky is blue"));
    }
    
    @Test
    public void test2() {
        ReverseWordsInAString sol = new ReverseWordsInAString();
        char[] sentence = (new String("the sky is blue")).toCharArray();
        sol.reverseWords(sentence);
        System.out.println(new String(sentence));
    }
    
    @Test
    public void test3() {
        ReverseWordsInAString sol = new ReverseWordsInAString();
        char[] sentence = (new String(" the   sky is blue  ")).toCharArray();
        sol.reverseWords(sentence);
        System.out.println(new String(sentence));
    }

}
