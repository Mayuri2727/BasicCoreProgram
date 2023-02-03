package BasicCorePro;
import java.util.Arrays;

public class SumOfThreeAddsZero {
    public static void main(String[] args) {
        int[] arr = {0, -1, 2, -3, 1};
        int n = arr.length;
        int count = 0;
        System.out.println("Distinct triplets that add up to zero:");
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (arr[i] + arr[j] + arr[k] == 0) {
                        System.out.println(arr[i] + " + " + arr[j] + " + " + arr[k] + " = 0");
                        count++;
                    }
                }
            }
        }
        System.out.println("Number of distinct triplets: " + count);
    }

    }
