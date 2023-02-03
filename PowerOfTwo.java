package BasicCorePro;
import java.math.BigInteger;

public class PowerOfTwo {
    public static void main(String[] args) {
            int N = Integer.parseInt(args[0]);
            BigInteger result = BigInteger.valueOf(1);
            System.out.println("Powers of 2 that are less than or equal to 2^" + N + ":");
            for (int i = 0; i <= N; i++) {
                System.out.println("2^" + i + " = " + result);
                result = result.multiply(BigInteger.valueOf(2));
            }
        }
 }