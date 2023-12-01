public class test02 {
    public static void main(String[] args) {
        int i = 0, j = 0;
        outer: // 標籤 貼在大迴圈上
        while (i <= 3) { // 大迴圈
            i++;
            j = 0;
            while (j <= 5) {// 小迴圈
                j++;
                if (j == 4) {
                    continue outer;
                }
                System.out.println(j);
                // 1
                // 2
                // 3'

                // 1
                // 2
                // 3

                // 1
                // 2
                // 3

                // 1
                // 2
                // 3

            }
        }
    }
}
