public class homework3 {
    public static void main(String[] args) {
        exercise2();
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
