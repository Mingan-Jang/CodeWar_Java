public class Overloading {
    public static double areaMeasure(double radius) {
        System.out.println("double radius");
        return radius * radius * 3.14;
        // return radius * radius * 3.14;
    }

    public static int areaMeasure(int radius) {
        System.out.println("int radius");
        return radius * radius * 3;
    }

    public static double areaMeasure(double width, double height) {
        System.out.println("double rect");
        return width * height;
    }

    public static double areaMeasure(double upper, double bottom, double height) {
        System.out.println("double 梯形");
        return (upper + bottom) * height;
    }

    public static void main(String[] args) {
        int sum4 = areaMeasure(3);
        System.out.println(sum4);

        double i = areaMeasure(2.0d);
        System.out.println(i);

        double j = areaMeasure(5.0d, 3.0d);
        System.out.println(j);

        double k = areaMeasure(2.0d, 4.0d, 3.0d);
        System.out.println(k);

    }

}
