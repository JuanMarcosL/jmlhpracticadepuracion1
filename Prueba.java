import java.util.Scanner;

public class Prueba {

    public static void calculatabla(int a) {
        int valor;
        for (int i = 1; i <= 10; i++) {
            valor = a * i;
            System.out.println(a + " x " + i + " = " + valor);
        }
    }

    public static void main(String[] args) {
       
        Scanner dato = new Scanner(System.in);
        System.out.print("Introduzca el número que desea multiplicar: ");
        int x = dato.nextInt();
        calculatabla(x);
    }
}
