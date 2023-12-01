public class test {
    public static void main(String[] args) {
        int i = 0;
        int count = 1;
        while (count <= 10) { // Big Loop
            for (i = 10; i > 0; i--) { // Small Loop
                if (i == 8)
                    break;
            }

            if (count == 5)
                break;
            count++;
        }
        System.out.println(count); // 5
        System.out.println(i); // 8
    }
}
