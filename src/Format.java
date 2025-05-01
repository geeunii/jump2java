public class Format {
    public static void main(String[] args) {
        System.out.println(String.format("I eat %d apples", 3));
        System.out.println(String.format("I eat %s apples", "five"));

        int number = 3;
        System.out.println(String.format("I eat %d apples", number));

        int number2 = 10;
        String day = "three";
        System.out.println(String.format("I ate %d apples in %s days", number2, day));

    }
}
