/*
    메서드(method): 클래스 내의 함수
    매개 변수(parameter): 메서드에 전돨된 입력값을 저장하는 변수
    인수(arguments): 메서드를 호출할 때 전달하는 입력값
 */

public class MethodSample {

    public static class Sample {
        // sum 메서드는 입력값으로 두개의 값(int 자료형 a, int 자료형 b)을 받으며 리턴값은
        // 두 개의 입력값을 더한 값(int 자료형) 이다.
        int sum(int a, int b) { // a, b는 매개변수
            return a + b;
            // return은 메서드의 결과값을 돌려주는 명령어.
        }
    }

    public static void main(String[] args) {
        int a = 3;
        int b = 4;

        Sample sample = new Sample();
        int c = sample.sum(a, b); // 3, 4는 인수

        System.out.println(c);
    }
}

/*
입력값과 리턴값이 모두 있는 메서드
일반적인 메서드는 입력값과 리턴값이 모두 있다.
int sum(int a, int b) {
    return a + b;
    입력값: int 자료형 a, int 자료형 b
    리턴값: int 자료형
    리턴값_받을_변수 = 객체.메서드명(압력인수1, 입력인수2, ...)
}
    sum 메서드의 사용 예
    Sample sample = new Sample();
    int result = sample.sum(3, 4);
*/

입력값이 없는 메서드
String say() {
    return "Hi";
    입력값: 없음
    출력값: String 자료형
}

예시.
        p