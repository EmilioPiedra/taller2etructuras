import java.util.Scanner;

public class CuadradoMagico {
    Scanner leer = new Scanner(System.in);
    public static void main(String[] args) {
        CuadradoMagico obj = new CuadradoMagico();
        int n ;
        System.out.println("Tamaño del cuadrado");
        n = obj.leer.nextInt();
        int[][] matriz = new int[n][n];
        obj.llenarCeros(matriz);
        obj.cuadrado(n, matriz);
        obj.presentarMatrices(matriz); // Se presenta el cuadrado
    }

    public void cuadrado(int n, int[][] cuadrado) {

        int c = n / 2;
        int f = 0;
        int ci = 0, fi = 0;

        cuadrado[f][c] = 4;

        for (int i = 2; i <= n * n; i++) {
            if (f - 1 < 0) {
                f = n - 1;
            } else {
                f = f - 1;
            }
            if (c + 1 > n - 1) {
                c = 0;
            } else {
                c = c + 1;
            }
            if (cuadrado[f][c] == 0) {
                cuadrado[f][c] = i;
                fi = f;
                ci = c;
            } else {
                f = fi + 1;
                c = ci;
                cuadrado[f][c] = i;
            }
        }

    }

    public void llenarCeros(int[][] c) {
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[0].length; j++) {
                c[i][j] = 0;
            }

        }
    }

    public void presentarMatrices (int [][]x) {
        for (int i=0; i < x.length; i++) {
            System.out.print("|");
            for (int j=0; j < x[0].length; j++) {
                System.out.print (x[i][j]);
                if (j!=x[i].length-1) System.out.print("\t");
            }
            System.out.println("|");
        }
    }
}