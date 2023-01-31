public class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{10, 20, 30, 40};
        printSumOfElements(arr);

        printSumOfElementsUsingVarArgs(30,20,30,40);
    }

    public static void printSumOfElementsUsingVarArgs(int... arr ) {
        int sum = 0;
        for (int i: arr) {
            sum = sum + i;
        }
        System.out.println(sum);
    }

    public static void printSumOfElements(int[] arr) {
        int sum = 0;

        for (int i : arr) {
            sum = sum+i;
        }
        System.out.println(sum);
    }
}