class Calculator {
    static int result = 0;

    static  int add(int num) {
        result += num;
        return result;
    }
}

class Calculator1 {
    static int result = 0;

    static int add(int num) {
        result += num;
        return result;
    }
}

class Calculator2 {
    static int result = 0;

    static int add(int num) {
        result += num;
        return result;
    }
}
public class CalculatorSample {
    public static void main(String[] args) {
        System.out.println(Calculator.add(3));
        System.out.println(Calculator.add(4));

        System.out.println(Calculator1.add(3));
        System.out.println(Calculator1.add(6));

        System.out.println(Calculator2.add(3));
        System.out.println(Calculator2.add(7));

        Calculator cal1 = new Calculator();
        Calculator cal2 = new Calculator();

        System.out.println(cal1.add(3));
        System.out.println(cal1.add(4));

        System.out.println(cal2.add(3));
        System.out.println(cal2.add(7));
    }
}
