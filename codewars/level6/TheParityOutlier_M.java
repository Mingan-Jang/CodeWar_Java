package codewars.level6;

public class TheParityOutlier_M {
    class FindOutlier {
        static int find(int[] integers) {
            int intEven = 0;
            int intOdd = 0;
            for (int i = 0; i < 3; i++) {
                if (Math.abs(integers[i]) % 2 == 0) {
                    intEven++;
                } else {
                    intOdd++;
                }
            }
            int remain = intEven > intOdd ? 0 : 1;
            int count = 0;
            int outliner = integers[count];

            while (count < integers.length && (remain == Math.abs(integers[count]) % 2)) {
                outliner = integers[++count];
            }
            return outliner;
        }
    }
}
