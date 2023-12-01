public class Fibonacci_Loop {
    public static void main(String[] args) {
        for (int n = 1; n < 10; n++) {
            System.out.println(fs(n));
        }
    }

    public static int fs(int n) {
        if (n <= 1)
            return n;
        int prev = 0;
        int fid = 1;
        for (int i = 2; i <= n; i++) {
            int tmp = fid;
            fid += prev;
            prev = tmp;
        }
        return fid;

    }
}
