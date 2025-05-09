import java.util.Arrays;
import java.util.List;

// Q1. 클래스 상속하고 메서드 추가하기
class UpgradeCalculator01 {
    int value;

    UpgradeCalculator01() {
        this.value = 0;
    }

    void add(int val) {
        this.value += val;
    }

    void minus(int val) {
        this.value -= val;
    }

    int getValue() {
        return this.value;
    }
}

// Q2. 클래스 상속하고 메서드 오버라이딩하기
// 객체 변수 value가 100보다 큰 값을 가질 수 없도록 제한하는 MaxLimitCalculator 클래스를 만들어 보자.
class Calculator02 {
    int value;

    Calculator02() {
        this.value = 0;
    }

    void add(int val) {
        this.value += val;
    }

    int getValue() {
        return this.value;
    }
}

// Q3. 홀수/짝수 판별하기
class Calculator03 {
    int value;

    Calculator03() {
        this.value = 0;
    }

    void add(int val) {
        this.value += val;
    }

    int getValue() {
        return this.value;
    }
}

class Discrimination extends Calculator03 {
    boolean isOdd(int val) {
        this.value = val;
        return this.value % 2 == 1;  // 홀수면 true, 짝수면 false 반환
    }
}

class MaxLimitCalculator extends Calculator02 {
    @Override
    void add(int val) {
        this.value += val;
        if (this.value > 100) {
            this.value = 100;
        }
    }
}

// Q4. 메서드 오버로딩하기
class Calculator04 {
    int avg(int[] data) {
        int sum = 0;
        for (int num : data) {
            sum += num;
        }
        return sum / data.length;
    }

    int avg(List<Integer> data) {
        int sum = 0;
        for (int num : data) {
            sum += num;
        }
        return sum / data.size();
    }
}

public class Question03 {
    public static <ArraysList> void main(String[] args) {
        UpgradeCalculator01 cal = new UpgradeCalculator01();
        cal.add(10);
        cal.minus(3);
        System.out.println(cal.getValue());

        MaxLimitCalculator cal02 = new MaxLimitCalculator();
        cal02.add(50);
        cal02.add(60);
        System.out.println(cal02.getValue());

        Discrimination cal03 = new Discrimination();
        System.out.println(cal03.isOdd(3));
        System.out.println(cal03.isOdd(4));

        int[] data = {1, 3, 5, 7, 9};
        Calculator04 cal04 = new Calculator04();
        int result = cal04.avg(data);
        System.out.println(result);

        List<Integer> data2 = Arrays.asList(1, 3, 5, 7, 9);
        System.out.println(result);
    }
}