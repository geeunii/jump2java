//class HouseDog extends Dog {
//    HouseDog(String name) {
//        this.setName(name);
//    }
//
//    HouseDog(int type) {
//        if (type == 1) {
//            this.setName("yorkshire");
//        } else if (type == 2) {
//            this.setName("bulldog");
//        }
//    }
//
//    void sleep() {
//        System.out.println(this.name + " zzz in house");
//    }
//
//    void sleep(int hour) {
//        System.out.println(this.name + " zzz in house for " + hour + " hours");
//    }
//}
//class Dog extends Animal { // Animal 클래스를 상속한다.
//
//    void sleep() {
//        System.out.println(this.name+" zzz");
//    }
//}
interface Predator {
    String getFood();

    default void printFood() {
        System.out.printf("my food is %s\n", getFood());
    }
}

interface Barkable {
    void bark();
}


class Animal {
    String name;

    void setName(String name) {
        this.name = name;
    }
}

class Tiger extends Animal implements Predator, Barkable {
    public String getFood() {
        return "apple";
    }

    public void bark() {
        System.out.println("어 흥");
    }
}

class Lion extends Animal implements Predator, Barkable {
    public String getFood() {
        return "banana";
    }

    public void bark() {
        System.out.println("으르렁");
    }
}

class ZooKeeper {
    void feed(Predator predator) {
        System.out.println("feed " + predator.getFood());
    }
}

class Bouncer {
    void barkAnimal(Barkable animal) {
        animal.bark();
    }
}

public class InheritanceSample {
    public static void main(String[] args) {
//        Dog dog = new Dog();
//        dog.setName("poppy");
//        System.out.println(dog.name);
//        dog.sleep();

//        HouseDog houseDog = new HouseDog();
//        houseDog.setName("happy");
//        houseDog.sleep();
//        houseDog.sleep(3);

//        HouseDog happy = new HouseDog("happy");
//        HouseDog yorkshire = new HouseDog(1);
//        System.out.println(happy.name);
//        System.out.println(yorkshire.name);

        ZooKeeper zooKeeper = new ZooKeeper();
        Tiger tiger = new Tiger();
        Lion lion = new Lion();
        Bouncer bouncer = new Bouncer();
        bouncer.barkAnimal(tiger);
        bouncer.barkAnimal(lion);
    }
}
