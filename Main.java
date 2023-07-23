public class Main {
    public static void main(String[] args) {

        dz_3 list = new dz_3();
        list.add(1);
        list.add(5);
        list.add(2);
        list.add(2);
        list.add(5);
        list.add(4);

        list.print();
        list.revert();
        list.print();
    }
}