package main;

public class teste {
    public static void main(String[] args) {
        System.out.println("Era esperado 1.414:\n"
                + App.parMaisProximo(new Integer[][] { new Integer[] { 2, 4 }, new Integer[] { 5, 9 },
                        new Integer[] { 1, 3 }, new Integer[] { 8, 2 }, new Integer[] { 6, 7 } }));

        System.out.println("Era esperado null:\n" + App.parMaisProximo(new Integer[][] {}));
        
        System.out.println("Era esperado 0.0:\n" + App.parMaisProximo(new Integer[][] { new Integer[] { 2, 4 },
                new Integer[] { 5, 9 }, new Integer[] { 1, 3 }, new Integer[] { 8, 2 }, new Integer[] { 2, 4 } }));
    }
}
