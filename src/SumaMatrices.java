import java.util.Scanner;
public class SumaMatrices {
Scanner leer = new Scanner(System.in);
        public int  fil;
        public int col;

        public SumaMatrices (int  fil,int col){
            this.col = col;
            this.fil = fil;
        }
    public void leerMat (int [][]x) {
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                System.out.println("Introduzca el elemento [" + i + "," + j + "]");
                x[i][j] = leer.nextInt();
            }
        }
    }
    public void sumMatriz (int [][] x, int [] filas, int [] colum){

        for (int i =0;i< x.length;i++){
            for (int j =0;j<x[0].length;j++){
                filas [i] += x [i][j];
                colum [j]+= x [i][j];
            }

        }
    }

    public static void main(String[] args) {
        SumaMatrices obj = new SumaMatrices (3,3);
        int [] filas = new int [obj.fil];
        int [] columnas = new int[obj.col];
        int [] [] matriz = new int [obj.fil][obj.col];
             obj.leerMat(matriz);
            obj.sumMatriz(matriz ,filas,columnas);
        System.out.println("filas:");
            for (int i=0;i< filas.length;i++){
             System.out.print(filas[i]+ " ,");
            }
        System.out.println("");
        System.out.println("Colunmas:");
            for (int i=0;i< columnas.length;i++){
            System.out.print(columnas[i]+ " ,");
        }

    }
}
