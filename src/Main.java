public class Main {
    public static void main(String[] args) {
        String[] stroke = {"Vasya", "Petya", "Olya", "Valya"};
        Integer[] values = {10, 20, 30, 40, 50};
        MagicBox<String, Integer> magicS = new MagicBox<>(10);
        MagicBox<Integer, Integer> magicI = new MagicBox<>(20);
        magicI.add(values);
        magicS.add(stroke);
        magicI.pick();
        magicS.pick();
        System.out.println();


    }

}
