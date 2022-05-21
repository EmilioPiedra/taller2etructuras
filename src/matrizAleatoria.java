import java.util.Random;
import java.util.Scanner;

public class matrizAleatoria {
    Scanner leer = new Scanner(System.in);
    Random aleratorio = new Random();
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
    boolean verificar (int [][] x, int num){
        for (int i=0; i < x.length; i++) {
            for (int j=0; j < x[0].length; j++) {
                if (num == x[i][j]){
                    return  false;
                }
            }
        }
        return true;
    }
    public void  GenerarMatriz (int [][] x, int n, int num){
        for (int i=0; i < x.length; i++) {
            for (int j=0; j < x[0].length; j++) {
                num= aleratorio.nextInt(n);
                while (verificar(x,num)==false){
                    num =aleratorio.nextInt(n);
                }
                x [i][j] = num;
            }
        }

    }
    public static void main(String[] args) {
        matrizAleatoria obj = new matrizAleatoria();
        int numero = 0;
        System.out.println(" Tamaño de la matriz");
        int n =obj.leer.nextInt();
        int [][] matriz = new int[n][n];
        System.out.println("Generar numero del 0 al: ");
        int m = obj.leer.nextInt();
        obj.GenerarMatriz(matriz, m, numero);
        obj.presentarMatrices(matriz);

    }
}
