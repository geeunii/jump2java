class Updater {
    void updater(Counter counter) {
        counter.count++;
    }
}

class Counter {
    int count = 0; // 객체변수
}

public class UpdaterCounterSample {
    public static void main(String[] args) {
        Counter myConuter = new Counter();
        System.out.println("before updater"+myConuter.count);
        Updater myUpdater = new Updater();
        myUpdater.updater(myConuter);
        System.out.println("after update:"+myConuter.count);
    }
}
