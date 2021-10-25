public class homework3 {
    public static void main(String[] args) {
        exercise5_6(10,5);
    }
    public static int exercise5_6 (int len, int initialValue) {
        int []a = new int[len];
        int s = 0;
        int j = 0;
        for (int i = 0; i < len; i++) {
            a[i] = initialValue;
            System.out.println(a[i]);
            s = s + a[i];
            j = a[i] - s;
        }
        System.out.print("Максимальный элемент массива равен " + s);
        System.out.println();
        System.out.println("Минимальный элемент массива равен " + j);
        return a[initialValue];


    }
    public static void exercise4() {
        int[][] a = new int[9][9];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                a[i][j] = 0;
                if (i == j || 8 - i == j) {
                    a[i][j] = 1;
                }
                System.out.print(a[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
    public static void exercise3() {
        int[] a = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        for (int i =0;i < a.length; i++) {
            if (a[i] < 6) {
                a[i] *= 2;
            }System.out.println(a[i]);
        }
    }
    public static void exercise2() {
        int[] a = new int[100];
        for (int i = 0; i < a.length; i++) {
            a[i]= i + 1;
            System.out.println(a[i]);
        }
    }
    public static void exercise1() {
        int[] a = {1, 0, 1, 0, 1, 0, 1, 0, 0, 0, 1, 1, 1};
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 1) {
                a[i] = 0;
            } else if (a[i] == 0) {
                a[i] = 1;
            }
            System.out.println(a[i]);
        }
    }
}
