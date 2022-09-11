import java.util.Random;

public class MagicBox<T> {
    public static final int SIZE = 5;
    private Random random = new Random();
    int randomInt = random.nextInt(SIZE);
    T[] items = (T[]) new Object[SIZE];

    boolean add(T item) {
        for (int i = 1; i < items.length; i++) {
            if (items[i] != null) {
                items[i] = item;
                return true;
            } else {
                return false;
            }

        }
        return false;
    }

    public T pick() {
        for (int i = 1; i < items.length; i++) {
            if (items[i] != null) {
                //exception;
            } else {

            }
        }
        return items[random.nextInt(items.length)];
    }
}
