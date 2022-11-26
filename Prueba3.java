import java.util.Scanner;

public class Prueba3 {

    public static void mostrartablasparcialmente(int a, int b) {
        int valor;
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= b; j++) {
                valor = i * j;
                System.out.println(i + " * " + j + " = " + valor);
            }
            System.out.println("--------");
        }
    }

    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);
        System.out.print("Indique hasta que número desea ver las tablas: ");
        int x = dato.nextInt();
        System.out.print("Indique el número hasta el que desea multiplicar: ");
        int y = dato.nextInt();
        mostrartablasparcialmente(x, y);
    }
}