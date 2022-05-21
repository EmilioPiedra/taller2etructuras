import java.util.Scanner;
public class TrasapuestaInvert {
    Scanner leer = new Scanner(System.in);
    public int  fil;
    public int col;

    public TrasapuestaInvert (int  fil,int col){
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
    public void traspuestaMatrizInvert(int [][]x) {
        int k;
        int aux;
        int l = x[0].length - 1;
        for (int i = 0; i < x.length - 1; i++) {
            k = x[0].length - 1;
            for (int j = 0; j < x[0].length - 1 - i; j++) {
                aux = x[i][j];
                x[i][j] = x[k][l];
                x[k][l] = aux;
                k--;
            }
            l--;
        }
    }

    public static void main(String[] args) {
        TrasapuestaInvert obj = new TrasapuestaInvert(3,3);
        int [][] matriz = new int [obj.fil][obj.col];
        obj.leerMat(matriz);
        obj.presentarMatrices(matriz);
        System.out.println("Matriz Traspuesta inversa");
        obj.traspuestaMatrizInvert(matriz);
        obj.presentarMatrices(matriz);

    }
}
