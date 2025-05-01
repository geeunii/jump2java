import java.util.Arrays;
import java.util.HashSet;


public class HashSetSample {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>(Arrays.asList("H", "e", "l", "l", "o"));
        System.out.println(set);
        // 집합 자료형의 2가지 특징
        // 중복 허용 X / 순서가 없음.

        // 교집합, 합집합, 차집합 구하기
        HashSet<Integer> s1 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6));
        HashSet<Integer> s2 = new HashSet<>(Arrays.asList(4, 5, 6, 7, 8, 9));

        HashSet<Integer> intersection = new HashSet<>(s1); // s1으로 intersection 생성
        intersection.retainAll(s2); // 교집합 수행
        System.out.println(intersection);

        HashSet<Integer> union = new HashSet<>(s1); // s1으로 union 생성
        union.addAll(s2); // 합집합 수행
        System.out.println(union);

        HashSet<Integer> substract = new HashSet<>(s1); // s1으로 substract 생성
        substract.removeAll(s2); // 차집합 수행
        System.out.println(substract);
    }
}
