class Animal {
    // Class에서 가장 중요한 부분은 객체 변수의 값이 독립적으로 유지가 됨.

    String name;
    // Animal 클래스에 name이라는 String 변수를 추가했다.
    // 이렇게 클래스에 선언된 벼수를 객체 변수(instance variavle)라고 한다.
    // 클래스에 의해 생성되는 것은 객체 그리고 그 클래스에 선언된 변수는 객체 변수

    public void setName(String name) { // 메서드 (method) 는 클래스 내에 구현된 함수
        this.name = name;
        // 입력: String name
        // 출력: void ('리턴값 없음'을 의미)
        // 즉, 입력으로 name이라는 문자를 받고 출력은 없는 형태의 메서드
    }
}

public class ClassSample {
    public static void main(String[] args) {
        Animal cat = new Animal();
        cat.setName("boby"); // 메서드 호출
        // System.out.println(cat.name); // 객 체. 객 체 변 수 ex) cat.name

        Animal dog = new Animal();
        dog.setName("happy");

        System.out.println(cat.name);
        System.out.println(dog.name);
    }
}

// 객체와 인스턴스의 차이는 무엇일까?
//클래스에 의해서 만들어진 객체를 인스턴스라고도 한다. 그렇다면 객체와 인스턴스의 차이는 무
//엇일까? Animal cat = new Animal() 이렇게 만들어진 cat 은 객체이다. 그리고 cat 이라
//는 객체는 Animal 의 인스턴스이다. 인스턴스라는 말은 특정 객체 (여기서는 cat) 가 어떤 클래스
//(여기서는 Animal) 의 객체인지를 관계 위주로 설명할 때 사용된다. 즉, ‘cat 은 인스턴스’ 보다는
//‘cat 은 객체’ 라는 표현이, ‘cat 은 Animal 의 객체’ 보다는 ‘cat 은 Animal 의 인스턴스’ 라는 표현이
//훨씬 잘 어울린다.