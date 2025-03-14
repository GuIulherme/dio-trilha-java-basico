public class Contar {
    static void contar(int p1, int p2) {
        if (p1 > p2) {
            throw new RuntimeException("O parametro 2 precisa ser maior que o 1");
        }
        int cont = p2 - p1;
        for (int i = 1; i <= cont; i++) {
            System.out.println("imprimindo número " + i);
        }
    }
}
