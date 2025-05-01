import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;

public class Question {
    // Q10
    static void printCoffeePrice(int type) {
        HashMap<Integer, Integer> priceMap = new HashMap<>();
        priceMap.put(1, 3000);
        priceMap.put(2, 4000);
        priceMap.put(3, 5000);
        int price = priceMap.get(type);
        System.out.println(String.format("가격은 %d원 입니다.", price));
    }

    public static void main(String[] args) {
        // Q1. 평균 점수 구하기
//        int a = 80;
//        int b = 75;
//        int c = 55;
//        System.out.println((a+b+c)/3);

        // Q2. 홀수/짝수 판별하기
        int d = 13;
        if (d % 2 == 0) {
            System.out.println(d + " is even");
        } else {
            System.out.println(d + " is odd");
        }

        // Q3. 주민등록번호 나누기
        String pin = "881120-1068234";
        String yyyyMMdd = pin.substring(0, 6);
        String num = pin.substring(7);
        System.out.println(yyyyMMdd);
        System.out.println(num);

        // Q4. 원하는 숫자 추출하기
        char gender = pin.charAt(7);
        System.out.println(gender);

        // Q5. 문자열 바꾸기
        String a = "a:b:c:d";
        String b = a.replaceAll(":", "#");
        System.out.println(b);

        // Q6. 리스트를 역순으로 정렬하기
        ArrayList<Integer> myList = new ArrayList<>(Arrays.asList(1, 3, 5, 4, 2));
        myList.sort(Comparator.reverseOrder());
        System.out.println(myList);

        // Q7. 리스트를 문자열로 만들기
        ArrayList<String> myList02 = new ArrayList<>(Arrays.asList("Life", "is", "too", "short"));
        String result = String.join(" ", myList02);
        System.out.println(result);

        // Q8. 맵에서 값 삭제하기
        HashMap<String, Integer> grade = new HashMap<>();
        grade.put("A", 90);
        grade.put("B", 80);
        grade.put("C", 70);
        int result02 = grade.remove("B");
        System.out.println(result02);
        System.out.println(grade);

        // Q9. 중복 숫자 제거하기
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 1, 1, 2, 2, 3, 3, 3, 4, 4, 5));
        HashSet<Integer> temp = new HashSet<>(numbers);
        ArrayList<Integer> result03 = new ArrayList<>(temp);
        System.out.println(result03);

        // Q10. 매직 넘버 제거하기
        printCoffeePrice(1);
    }
}
