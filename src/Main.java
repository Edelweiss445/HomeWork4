import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        int[] m = {2, 3, 9};
        SalesManager sm;
        sm = new SalesManager(m);

        int stat = 0;
        for (int i = 0; i < m.length; i++) {
            stat = stat + m[i];
            stat = stat / m.length;
        }
//        Решение в одну строку
//        int stat = IntStream.of(m).sum();



        System.out.println(sm.max());
        System.out.println();
        System.out.println("Среднее количество среди всех продаж " + stat);


    }
}
