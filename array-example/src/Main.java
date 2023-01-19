public class Main {
    public static void main(String[] args) {
        int[] evenNum = {0,2,4,6,8};

        System.out.println("3rd element of Array: " + evenNum[2]);
        evenNum[4]=20;
        for (int i : evenNum) {
            System.out.println(i);
        }
    }
}