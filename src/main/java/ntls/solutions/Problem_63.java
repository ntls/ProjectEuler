
package ntls.solutions;


import java.math.BigInteger;


/**
 *
 * @author ntls
 * @version 1.0
 * @since 2014-10-10
 */
public class Problem_63 {


    /**
     * @return How many the powerful digit counts are.
    */
    public int solution_1() {
        int count = 0;
        for (int n = 1; n <= 9; n++) {
            for (int k = 1; k <= Integer.MAX_VALUE; k++) {
                if (BigInteger.valueOf(n).pow(k).toString().length() == k) {
                    count++;
                } else { // a^k is not k-digit.
                    break;
                }
            }
        }
        return count;
    }

    
    interface IntegerMath {
        int operation(int a, int b);
    }

    private int operateBinary(int a, int b, IntegerMath op) {
        return op.operation(a, b);
    }
    
    /**
     * The same solution as above but now we are using lambdas.
     * 
     * @return How many the powerful digit counts are.
     */
    public int solution_2() {
        IntegerMath compare = 
                (n, k) -> {
            return (BigInteger.valueOf(n).pow(k).toString().length() == k) ? 1 : 0;
        };
        
        int count = 0;
        for (int n = 1; n <= 9; n++) {
            for (int k = 1; k <= Integer.MAX_VALUE; k++) {
                if (operateBinary(n, k, compare) == 1) {
                    count++;
                } else {
                    break;
                }
            }
        }
        return count;
    }

    public static void main(String... args) {

        Problem_63 pe = new Problem_63();
        System.out.println("function <solution_1> found that are " + pe.solution_1() + " n-digit positive integers which are also an nth power.");
        System.out.println("function <solution_2> found that are " + pe.solution_2() + " n-digit positive integers which are also an nth power.");
    }
    
}
