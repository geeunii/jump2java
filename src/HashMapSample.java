import java.util.HashMap;

public class HashMapSample {
    public static void main(String[] args) {

        //put
//        HashMap<String, String> map = new HashMap<>();
//        map.put("people", "사람");
//        map.put("baseball", "야구");
//        System.out.println(map.get("people"));

        // containsKey -> 맵에 해당 key가 있는지를 참 또는 거짓으로 리턴
        HashMap<String, String> map = new HashMap<>();
        map.put("people", "사람");
        map.put("baseball", "야구");
        System.out.println(map.containsKey("people"));
    }
}
