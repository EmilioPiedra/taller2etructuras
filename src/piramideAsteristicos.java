import java.util.Scanner;

public class piramideAsteristicos {
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

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if ((i + j) >= matriz.length - 1 && i >= j) {
                    matriz[i][j] = "* ";
                }else{
                    matriz[i][j] = "- ";
                }
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }



    }
}
