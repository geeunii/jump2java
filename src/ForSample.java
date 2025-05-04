public class ForSample {
    public static void main(String[] args) {
//        String[] numbers = {"one", "two", "three"};
//        for (int i = 0; i < numbers.length; i++) {
//            System.out.println(numbers[i]);

        int[] marks = {90, 25, 67, 45, 80};
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] >= 60) {
                System.out.println((i+1)+"번 학생은 합격 입니다.");
            } else {
                System.out.println((i+1)+"번 학생은 불합격 입니다.");
            }
        }
    }
}
