import java.util.Scanner;

public class notasAlum {
    Scanner leer = new Scanner(System.in);
    public int alumnos;
    public int materias;

    public notasAlum(int materias, int alumnos) {
        this.materias = materias;
        this.alumnos = alumnos;
    }

    public void leerNotas(double[][] x, String[] alum, String[] mat, int cont) {
        for (int i = 0; i < materias; i++) {
            for (int j = 0; j < alumnos; j++) {
                System.out.println("Introduzca el elemento [" + mat[i] + "," + alum[j] + "]");
                x[i][j] = leer.nextDouble();
                if (x[i][j] == 0) {
                    cont++;
                }
            }
        }
    }

    public void NotasAlumnos(double notas[][], double mat[], double es[], String []alum, String[] mate){
        double sMaterias = 0;
        double contador = 0;
        double sTotal = 0;
        for (int i = 0; i < materias; i++) {
            for (int j = 0; j < alumnos; j++) {
                sTotal +=notas[i][j];
                mat[i] += notas[i][j];
                es[j] += notas[i][j];
                if (notas[i][j] == 0) {
                    contador++;
                }
            }
        }

        System.out.println("Promedio de cada materia");
        for (int i = 0; i < materias; i++) {
            System.out.println("Promedio de "+mate[i]);
            mat[i]/=alumnos;
            System.out.println(mat[i] + "   ");
        }

        System.out.println("Promedio de cada estudiante");
        for (int i = 0; i < alumnos; i++) {
            System.out.print("Promedio de "+alum[i]+" ");
            es[i]/=materias;
            sMaterias += es[i];
            sMaterias/=es.length;
            System.out.println(es[i] + "   ");
        }

        System.out.println("El porcentaje de faltas es: " + (contador *alumnos*materias
                / 100)+ "%");
        double a=materias, b=alumnos;
        sTotal = sTotal / a*b;
        System.out.println("El promedio general de todas las notas es: " +
                sTotal );
    }

    public static void main(String[] args) {
        notasAlum obj = new notasAlum (5,3);
        String [] alumnos ={"Maria","Carmen","Ana","Daniela","Laura","Antonio","Jose","Luis","Jorge","Javier","Josep","Emilio", "Noa","Valeria","Ana","Daniela","Laura","Antonio","Jose", "Saulo" };
        //20 col

        String [] materias ={"Matematica","Fisca","Programacion","Texto Cientificos"," Algebra"}; //5 fil
        double [][] notas = new double[obj.materias][obj.alumnos];
        double [] a = new double[obj.materias];
        double []b = new double[obj.alumnos];
        int cont=0;
        obj.leerNotas(notas,alumnos,materias,cont);
        obj.NotasAlumnos(notas,a,b,alumnos,materias);

    }
}
