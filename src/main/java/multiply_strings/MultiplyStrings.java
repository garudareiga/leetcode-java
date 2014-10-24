package multiply_strings;

/**
 * 
 * @author raychen
 * 
 * Problem:
 * Given two numbers represented as strings, return multiplication of the numbers as a string.
 * Note: The numbers can be arbitrarily large and are non-negative.
 */

public class MultiplyStrings {
    public String multiply(String num1, String num2) {
    	if (num1.isEmpty() || num2.isEmpty() || "0".equals(num1) || "0".equals(num2)) return "0";
    	num1 = (new StringBuilder(num1)).reverse().toString();
    	num2 = (new StringBuilder(num2)).reverse().toString();
    	int[] result = new int[num1.length() + num2.length()];
    	for (int i = 0; i < num1.length(); i++) {
    		int v1 = Character.getNumericValue(num1.charAt(i));
    		for (int j = 0; j < num2.length(); j++) {
    			int v2 = Character.getNumericValue(num2.charAt(j));
    			result[i + j] += v1*v2;
    		}
    	}
    	
    	StringBuilder sb = new StringBuilder();
    	for (int i = 0; i < result.length - 1; i++) {
    		result[i + 1] += result[i]/10;
    		result[i] %= 10;
    		sb.append(result[i]);
    	}
    	if (result[result.length - 1] != 0) sb.append(result[result.length - 1]);
    	return sb.reverse().toString();
    }
}
