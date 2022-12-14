public class Main {
    public static void main(String[] args) {
        int[] m = {2, 3, 9};
        SalesManager sm;
        sm = new SalesManager(m);

        System.out.println(sm.max());
    }
}
