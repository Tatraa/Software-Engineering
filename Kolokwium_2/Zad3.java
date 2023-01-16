import java.util.ArrayList;
import java.util.Random;

class KolejkaZLosowoscia {
    private ArrayList<Object> queue;
    private Random rand;

    public KolejkaZLosowoscia() {
        queue = new ArrayList<>();
        rand = new Random();
    }

    public void enqueue(Object x) {
        queue.add(x);
    }

    public Object dequeue() {
        if (queue.size() < 1) {
            return null;
        } else {
            int maxlos = Math.min(6, Math.max(queue.size(), 1));
            int los = rand.nextInt(maxlos);
            Object x = queue.get(los);
            queue.remove(los);
            return x;
        }
    }
}

public class Zad3 {
    public static void main(String[] args) {
        KolejkaZLosowoscia KZL = new KolejkaZLosowoscia();
        for (int i = 0; i < 10; i++) {
            KZL.enqueue(i);
        }

        for (int i = 0; i < 15; i++) {
            System.out.println(KZL.dequeue());
        }
    }
}
