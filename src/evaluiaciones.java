import java.util.Scanner;

public class evaluiaciones {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);

        double nota = 0;
        double mediaEvaluacion = 0;
        double contadorDeEvaluaciones=0;
        // ciclo while
        //operador relacional != diferencia
        while (nota != -1){
            System.out.println("que nota le darias a la pelicula matrix");
            nota=teclado.nextDouble();
            if (nota != -1) {
                mediaEvaluacion += nota;
                contadorDeEvaluaciones++;
            }else{
                System.out.println("terminando el calculo de nota media");
            }

        }
        System.out.println("la nota media de matrix es "+mediaEvaluacion/contadorDeEvaluaciones);
    }
}
