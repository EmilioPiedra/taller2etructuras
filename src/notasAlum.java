import java.util.Scanner;

public class notasAlum {
    Scanner leer = new Scanner(System.in);
    public int  alumnos;
    public int materias;

    public notasAlum (int  fil,int col){
        this.materias = col;
        this.alumnos = fil;
    }
    public void leerNotas (double [][]x,String [] alum, String [] mat) {
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                System.out.println("Introduzca el elemento [" + mat [i] + "," + alum [j] + "]");
                x[i][j] = leer.nextInt();
            }
        }
    }
    public void NotasAlumnos (String [] alum, String [] mat, double [][]not){
        double mediaAlum=0;
        double mediaMateria=0;
        double general=0;
        int cont=0, aux;
        for (int i = 0; i < not.length; i++) {

            for (int j = 0; j < not[i].length; j++) {
                    if (not[i][j]==0){
                        cont++;
                    }
                mediaMateria  += not [i][j];
                mediaAlum += not [j][i];
            }
            System.out.println("La media de la clase de "+mat[i]+" es de: "+(mediaMateria));
            System.out.println("La media del alumno: "+mediaAlum);
        }

    }

    public static void main(String[] args) {
        notasAlum obj = new notasAlum (1,5);
        String [] alumnos ={"Maria","Carmen","Ana","Daniela","Laura","Antonio","Jose","Luis","Jorge","Javier","Josep","Emilio", "Noa","Valeria","Ana","Daniela","Laura","Antonio","Jose", "Saulo" };
        //20 col
        String [] materias ={"Matematica","Fisca","Programacion","Texto Cientificos"," Algebra"}; //5 fil
        double [][] notas = new double[5][20];
        obj.leerNotas(notas,alumnos,materias);
        obj.NotasAlumnos(alumnos,materias,notas);

    }
}
