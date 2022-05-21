import java.util.Scanner;

public class ordenamientoMatriz {
    Scanner leer = new Scanner(System.in);
    private int  fil;
    private int col;
    public ordenamientoMatriz(int fil , int col){
        this.fil = fil;
        this.col = col;
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
    public void leerMat (int [][]x) {
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[0].length; j++) {
                System.out.println("Introduzca el elemento [" + i + "," + j + "]");
                x[i][j] = leer.nextInt();
            }
        }
    }

    public void ordenamientoBurbuja(int n [][]) {
        int aux=0;
        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < n[0].length; j++) {
                for (int x = 0; x < n.length; x++) {
                    for (int y = 0; y < n[0].length; y++) {
                        if (n[i][j]>=n[x][y]){
                            n[i][j] = n [i][j];
                        }else{
                            aux =  n[x][y];
                            n[x][y] = n [i][j];
                            n[i][j] = aux;
                        }
                    }
                }
            }
        }

    }

    public static void main(String[]args){
        ordenamientoMatriz obj = new ordenamientoMatriz(3,3);
        int [][] matriz= new int [obj.fil][obj.col];
        obj.leerMat(matriz);
        obj.presentarMatrices(matriz);
        obj.ordenamientoBurbuja(matriz);
        System.out.println("Matriz Ordenada");
        obj.presentarMatrices(matriz);
    }
}
