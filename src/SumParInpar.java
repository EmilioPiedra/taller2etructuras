import java.util.Scanner;

public class SumParInpar {
    Scanner leer = new Scanner(System.in);
    public int  fil;
    public int col;

    public SumParInpar (int  fil,int col){
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
    public void SumaParInpar(int [][]x, int p, int ip){

        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                if (x [i][j]%2==0){
                    p += x [i][j];
                }else{
                    ip += x [i][j];
                }
            }
        }
        System.out.println("PAR: "+p);
        System.out.println("INPAR: "+ip);
    }

    public static void main(String[] args) {
        SumParInpar obj = new SumParInpar (3,3);
        int par=0;
        int inpar=0;
        int [] [] matriz = new int [obj.fil][obj.col];
        obj.leerMat(matriz);
        obj.SumaParInpar(matriz,par,inpar);
    }
}
