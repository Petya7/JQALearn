package Homework2;

public class Task04 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

//        for(int i=0; i < arr.length; i++) {
//            System.out.println("Array using for loop " + arr[i]);
//        }
        int i = 0;
        while(i < arr.length) {
            System.out.println("Array using while loop " + arr[i]);
            i++;
        }
    }
}
