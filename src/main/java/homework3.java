public class homework3 {
    public static void main(String[] args) {
        exercise3();
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
