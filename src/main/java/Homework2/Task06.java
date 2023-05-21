package Homework2;

public class Task06 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int[] b = {1, 2, 3};
        if(equals(a, b)) {
            System.out.println("Same");
        } else
            System.out.println("Different");

    }

    public static boolean equals(int[] a, int[] b) {
        if (a.length != b.length)
            return false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i])
                return false;
        }
        return true;
    }

}