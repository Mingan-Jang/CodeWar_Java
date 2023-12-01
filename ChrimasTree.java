public class ChrimasTree {
    public static void main(String[] args) {
        int layers = 10;
        for (int i = 1; i <= layers; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
        System.out.print("\n");

        for (int j = layers; j > 0; j--) {
            for (int i = 1; i <= j; i++) {
                System.out.print("*");
            }
            System.out.print('\n');

        }

    }
}
