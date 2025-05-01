import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class GenericsSample {
    public static void main(String[] args) {
//        ArrayList<String> pitches = new ArrayList<>();
//        pitches.add("138");
//        pitches.add("129");
//        pitches.add("142");
//        System.out.println(pitches);

//        String[] data = {"138", "129", "142"};
//        ArrayList<String> pitches = new ArrayList<>(Arrays.asList(data));
//        System.out.println(pitches);

//        ArrayList<String> pitches = new ArrayList<>(Arrays.asList("138", "129", "142"));
//        String result = "";
//        for (int i = 0; i < pitches.size(); i++) {
//            result += pitches.get(i);
//            result += ",";
//        }
//        result = result.substring(0, result.length() -1); // 마지막 콤마는 제거
//        System.out.println(result);

//        ArrayList<String> pitches = new ArrayList<>(Arrays.asList("138", "129", "142"));
//        String result = String.join(",", pitches);
//        System.out.println(result);

        ArrayList<String>  pitches = new ArrayList<>(Arrays.asList("138", "129", "142"));
        pitches.sort(Comparator.naturalOrder()); // 오름차순 정렬
        pitches.sort(Comparator.reverseOrder()); // 내림차순 정렬
        System.out.println(pitches);
    }
}
