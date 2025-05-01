public class Format02 {
    public static void main(String[] args) {
        System.out.println(String.format("Error is %d%%.", 98));

        System.out.println(String.format("%10s", "hi"));

        System.out.println(String.format("%-10sjane.", "hi"));

        System.out.println(String.format("%.4f", 3.42134234));

        System.out.println(String.format("%10.4f", 3.42134234));

        System.out.printf("I eat %d apples", 3);
    }
}
