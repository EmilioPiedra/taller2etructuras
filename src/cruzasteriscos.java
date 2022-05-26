import java.util.Scanner;

public class cruzasteriscos {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        boolean numeroCorrecto = false;
        int n;

        do {
            System.out.print("Ingrese el tamaño del cuadrado (número impar): ");
            n = teclado.nextInt();

            if (n % 2 != 0) {
                numeroCorrecto = true;
            } else {
                System.out.println("Datos incorrectos. Ingrese dos valores impares");
            }
            System.out.println();

        } while (!numeroCorrecto);

        String matriz[][] = new String[n][n];

        int mitadFilas = matriz.length / 2;
        int mitadColumnas = matriz[0].length / 2;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (i == mitadFilas || j == mitadColumnas) {
                    matriz[i][j] = "* ";
                } else {
                    matriz[i][j] = "- ";
                }
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

}

