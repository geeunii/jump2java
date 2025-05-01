public class TypeCastingSample {
    public static void main(String[] args) {
//        String num = "123";
//        int n = Integer.parseInt(num);
//        System.out.println(n);
//
//        int m = 123;
//        String num1 = "" + m;
//        System.out.println(m);

//        int n = 123;
//        String num1 = String.valueOf(n);
//        String num2 = Integer.toString(n);
//        System.out.println(num1);
//        System.out.println(num2);

        int n1 = 123;
        double d1 = n1; // 정수를 실수로 바꿀때에는 캐스팅이 필요
        System.out.println(d1);

        double d2 = 123.456;
        int n2 = (int) d2; // 실수를 정수로 바꿀때에는 반드시 정수형으로 캐스팅해주어야 함.
        System.out.println(n2);
    }
}
