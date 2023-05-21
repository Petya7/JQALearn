package Homework2;

public class Task05 {
    public static void main(String[] args) {
        int[] arr = {10, 12, 1, 8, 4};
        int[] arr2 = new int[arr.length];
        System.arraycopy(arr, 0, arr2, 0, 5);
    }
}
