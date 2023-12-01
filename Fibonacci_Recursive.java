public class Fibonacci_Recursive {
    public static void main(String[] args) throws Exception {
        int n = 2;
        System.out.print(fs(n));

    }

    public static int fs(int n) {
        if (n <= 1)
            return n;

        return (fs(n - 1) + fs(n - 2));

    }
}
