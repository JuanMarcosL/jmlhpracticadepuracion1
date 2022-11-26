public class Prueba3 {
    public static void mostrartablasparcialmente(int a, int b) {
        int valor;
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= a; j++) {
                valor = i * j;
                valor = valor + 1;
                System.out.println(i + " * " + j + " = " + (valor + b));
            }
            System.out.println("--------");
        }
    }

    public static void main(String[] args) {
        int x = 5;
        int y = 2;
        mostrartablasparcialmente(x, y);
    }
}