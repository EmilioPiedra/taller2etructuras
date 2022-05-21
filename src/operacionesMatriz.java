import java.util.Scanner;

public class operacionesMatriz {
    Scanner leer = new Scanner(System.in);
    public int  fil;
    public int col;
    public operacionesMatriz(int fil , int col){
        this.col = col;
        this.fil = fil;
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
    public int menu(){
        int n;
        System.out.println("Multiplicación de dos matrices bidimensionales   [1]");
        System.out.println("Suma de matrices                                 [2]");
        System.out.println("Resta de matrices                                [3]");
        System.out.println("Multiplicación por un escalar                    [4]");
        System.out.println("Traspuesta de una matriz                         [5]");
        System.out.println("Salir                                            [6]");
        n= leer.nextInt();
        return n;
  }
  public void RestaMatriz (int [][] A, int [][]B, int [][] C){
      for (int i = 0; i < A.length; i++) {
          for (int j = 0; j < A[0].length; j++) {
              int numero1 = A[i][j];
              int numero2 = B[i][j];
              int resta = numero1 - numero2;
              C[i][j] = resta;
          }
      }
  }
  public void SumaMatriz(int [][] A, int [][]B, int [][] C){
      for (int i = 0; i < A.length; i++) {
          for (int j = 0; j < A[0].length; j++) {
              int numero1 = A[i][j];
              int numero2 = B[i][j];
              int suma = numero1 + numero2;
              C[i][j] = suma;
          }
      }
  }
  public void escalarMullt(int [][] x, int [][] C, int n){
        for (int i=0; i < x.length; i++) {
          for (int j=0; j < x[0].length; j++) {
              C[i][j] = n * x[i][j];
          }
      }
  }
    public void mulMatrices (int [][] A, int [][]B, int [][] C) {
        int s =0;
        for (int i=0;i<A.length;i++){
            for (int l=0;l<B[0].length;l++){
                s=0;
                for (int j=0;j<A[0].length;j++){
                    s+= A[i][j]*B[j][l];
                }
                C[i][l]=s;
            }
        }
    }
    public void traspuestaMatriz (int [][] matriz){
        int aux;
        for (int i=0;i<matriz.length;i++){
            for (int j=i+1;j<matriz[0].length;j++){
                aux = matriz[i][j];
                matriz[i][j] = matriz[j][i];
                matriz[j][i] = aux;
            }
        }
            }


    public static void main(String[] args) {
        operacionesMatriz objeto = new operacionesMatriz(2,2);
        int [][] a = new int[objeto.col][objeto.fil];
        int [][] b = new int[objeto.col][objeto.fil];
        int [][] c = new int[objeto.col][objeto.fil];
        int op , n, x;
        System.out.println("Matriz A");
        objeto.leerMat(a);
        System.out.println("Matriz B");
        objeto.leerMat(b);
        do {
            op = objeto.menu();

            switch (op) {
                case 1:
                    objeto.mulMatrices(a,b,c);
                    objeto.presentarMatrices(c);
                    break;
                case 2:
                    objeto.SumaMatriz(a,b,c);
                    objeto.presentarMatrices(c);

                    break;
                case 3:
                    objeto.RestaMatriz(a,b,c);
                    objeto.presentarMatrices(c);

                    break;
                case 4:
                    System.out.println(" Numero escalar");
                    n=objeto.leer.nextInt();
                    System.out.println("Realizar operacion con Matriz A[1] o Matriz B[2]");
                    x=objeto.leer.nextInt();
                    if (x==1){
                        objeto.escalarMullt(a,c,n);
                        objeto.presentarMatrices(c);
                    } else{
                        objeto.escalarMullt(b,c,n);
                        objeto.presentarMatrices(c);
                    }
                    break;
                case 5:
                    System.out.println("Realizar operacion con Matriz A[1] o Matriz B[2]");
                    x=objeto.leer.nextInt();
                    if (x==1){
                    objeto.traspuestaMatriz(a);
                    objeto.presentarMatrices(a);
                    } else{
                        objeto.traspuestaMatriz(b);
                        objeto.presentarMatrices(b);
                        }
                    break;
            }
        }while (op!=6);
    }
}
