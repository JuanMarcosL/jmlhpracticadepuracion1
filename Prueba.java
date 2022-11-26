public class Prueba {
    public static void calculatabla(int a) {
        int valor;
        for (int i = 1; i <= 10; i++) {
            valor = a * i;
            valor = valor + 1;
            System.out.println(a + " x " + i + " = " + valor);
        }
    }

    public static void main(String[] args) {
        int x = 2;
        calculatabla(x);
    }
}