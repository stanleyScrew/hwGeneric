import java.util.Random;

public class MagicBox<T, C> {
    //    public static final int SIZE = 5;
    protected T[] items;
    private Random random = new Random();
    //    private int randomInt = random.nextInt(quantity);
    protected C quantity;


    public MagicBox(C quantity) {
        T[] items = (T[]) new Object[(int) quantity];
    }

    boolean add(T[] items) {

        for (int i = 1; i < items.length; i++) {
            T item;
            if (items[i] != null) {
                items[i] =;
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
