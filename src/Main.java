public class Main {
    public static void main(String[] args) {
        MagicBox<Integer> magicI = new MagicBox<Integer>();
        MagicBox<String> magicS = new MagicBox<String>();
        magicI.add(400);
        magicS.add("String");

        magicI.pick();
        System.out.println();


    }

}
