import java.util.Scanner;

public class determinante {
            int fil ;
            int col;
            public determinante (int fil, int col){
                this.col = col;
                this.fil = fil;
            }
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
            for (int j = 0; j < x[i].length; j++) {
                System.out.println("Introduzca el elemento [" + i + "," + j + "]");
                x[i][j] = leer.nextInt();
            }
        }
    }
    public int determinante(int [][] matriz) {
        int sumatoria1 = 0;
        int sumatoria2 = 0;
        int acumuladorP = 0;
        int acumuladorS = 0;
        if (matriz.length == matriz[0].length) {
            for (int i = 0; i < matriz.length; i++) {
                int j = matriz.length - 1 - i;
                int l = matriz.length - 1 - i;
                acumuladorP = 1;
                acumuladorS = 1;
                for (int k = 0; k < matriz.length; k++) {
                    acumuladorP *= matriz[k][j];
                    acumuladorS *= matriz[k][l];
                    if (j == matriz.length-1) {
                        j = 0;
                    }else{
                        j++;
                    }
                    if (l == 0) {
                        l = 3;
                    }else{
                        l--;
                    }
                    sumatoria1 += acumuladorP;
                    sumatoria2 += acumuladorS;
                }
            }

        }else{
            System.out.println("La matriz tiene que ser cuadrada");
        }
        return sumatoria1 - sumatoria2;
    }

    public static void main(String[] args) {
        determinante obj = new determinante(3,3);
        int [][] matriz = new int[obj.fil][obj.col];
        obj.leerMat(matriz);
        obj.determinante(matriz);
        obj.presentarMatrices(matriz);
    }
}
