import java.util.Scanner;

public class cuadrado {
    Scanner leer = new Scanner(System.in);
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
    public void leerMat (int [][]x) {
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[0].length; j++) {
                System.out.println("Introduzca el elemento [" + i + "," + j + "]");
                x[i][j] = leer.nextInt();
            }
        }
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
                ci = c;//guardamos la ultima posicion rellenada
            } else {
                f = fi + 1;
                c = ci;//recuperamos la ultima posicion rellenada
                cuadrado[f][c] = i;
            }
        }

    }

    public static void main(String[] args) {
        cuadrado obj = new cuadrado();
        int n = 4, aux=0;
        int [][] matriz = new int [n][n];
        //do {
            System.out.println("Definir dimension del cuadrado (solo numeros inpares)");
           // n = obj.leer.nextInt();
           // if (n % 2 == 0) {
             //   System.out.println("El numero no es inpar intente de nuevo");
           // } else {
              //  aux = 2;
          //  }
        //}while (aux!=2);;
        obj.cuadrado(n,matriz);
        obj.presentarMatrices(matriz);
            ///revisar codigo
    }
}