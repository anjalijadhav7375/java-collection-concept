import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] evenNum = {0, 2, 4, 6, 8};

        int[] oddNum = new int[3];
        oddNum[0] = 1;
        oddNum[1] = 3;
        oddNum[2] = 5;

        int[] firstFivePrimeNum = new int[]{1, 3, 5, 7, 11};

        System.out.print("3rd element of Array: " + evenNum[2]);
        evenNum[4] = 20;
        Arrays.sort(evenNum);

        System.out.println("\nEven number in array:");
        for (int i : evenNum) {
            System.out.print(" " + i);
        }
        System.out.println("\nOdd number in array:");
        for (int j : oddNum) {
            System.out.print(" " + j);
        }
        System.out.println("\nFirst five prime numbers:");
        for (int k : firstFivePrimeNum) {
            System.out.print(" " + k);
        }
    }
}