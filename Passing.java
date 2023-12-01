public class Passing {
    static void passValue(double value) {
        value = 20.0;
    }

    static void passReference(Pen reference) {
        reference.value = 100;
    }

    public static void main(String[] args) {
        double price = 222;
        passValue(100);
        System.out.println(price);

        Pen myPen = new Pen();
        passReference(myPen);
        System.out.println(myPen.value);

    }

}
