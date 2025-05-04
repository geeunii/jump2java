public class Question02 {
    public static void main(String[] args) {
        // Q1. 조건문의 참과 거짓 판단하기
        String a = "write once, run anywhere";
        if (a.contains("wife")) {
            System.out.println("wife");
        } else if (a.contains("once") && !a.contains("run")) {
            System.out.println("once");
        } else if (!a.contains("everywhere")) {
            System.out.println("everywhere");
        } else if (a.contains("anywhere")) {
            System.out.println("anywhere");
        } else {
            System.out.println("none");
        }

        // Q2. 3의 배수의 합 구하기
        int result = 0;
        int i2 = 1;
        while (i2 <= 1000) {
            if (i2 % 3 == 0) {
                result += i2;
            }
            i2 += 1;
        }
        System.out.println(result);

        // Q3. 별 표시하기
        int i3 = 0;
        while (true) {
            i3 += 1; // while문 수행 시 1씩 증가
            if (i3 > 5) { // i3 값이 5보다 크면 while 문을 벗어남.
                break;
            }
            for (int j3 = 1; j3 <= i3; j3++) { // i3 값의 개수만큼 *을 출력
                System.out.print('*'); // 줄바꿈 문자를 제거하기 위해 println 대신 print를 사용.
            }
            System.out.println(""); // * 출력후 줄바꿈 문자를 출력한다.
        }

        // Q4. 1 부터 100 까지 출력하기
        for (int i4 = 1; i4 <= 100; i4++) {
            System.out.println(i4);
        }

        // Q5. 평균 점수 구하기 2
        // A 학급: 70, 60, 55, 75, 95, 90, 80, 80, 85, 100
        int[] marks = {70, 60, 55, 75, 90, 80, 80, 85, 100};
        int total = 0;
        for (int mark : marks) {
            total += mark; // A 학급 학생들의 접수를 모두 더함
        }
        float avg = (float) total / marks.length; // 평균을 계산
        System.out.println(avg); // 평균을 출력
    }
}
