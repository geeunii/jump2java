public class EnumSample {
    // enum: enum 자료형은 서로 연관 있는 여러 개의 상수 집합을 정의할 때 사용한다.
    enum CoffeeType {
        AMERICANO,
        ICE_AMERICANO,
        CAFE_LATTE
    };

    public static void main(String[] args) {
        System.out.println(CoffeeType.AMERICANO);
        System.out.println(CoffeeType.ICE_AMERICANO);
        System.out.println(CoffeeType.CAFE_LATTE);

        for(CoffeeType type: CoffeeType.values()) {
            System.out.println(type);
        }
    }
}
