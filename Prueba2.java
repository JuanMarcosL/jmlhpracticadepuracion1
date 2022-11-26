import java.util.Scanner;

public class Prueba2 {

    public static void mostrartablashasta(int a) {
        int valor;
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= 10; j++) {
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
        mostrartablashasta(x);
    }
}