import java.util.Scanner;

public class SumDiagoInver {
    Scanner leer = new Scanner(System.in);
    public int  fil;
    public int col;

    public SumDiagoInver (int  fil,int col){
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
    public int sumDiagonalInvertida (int [][]x, int [] v){
        int j = x.length-1;
        int suma =0;
            for (int i = 0;i<x.length;i++){
                suma += x[i][j];
                j--;
            }
    return  suma; }

    public static void main(String[] args) {
        SumDiagoInver obj = new SumDiagoInver (3,3);
            int [] vector = new int [(obj.fil+ obj.col)/2];
            int [] [] matriz = new int [obj.fil][obj.col];
            obj.leerMat(matriz);
        System.out.println("La suma es: "+obj.sumDiagonalInvertida(matriz,vector));


    }
}
