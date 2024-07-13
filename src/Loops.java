import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);


        double nota = 0;
        double mediaEvaluacion=0;

        //probando FOR
        for (int i = 0; i < 3; i++) {
            System.out.println("que nota le darias a la pelicula matrix");
            nota=teclado.nextDouble();
            mediaEvaluacion=mediaEvaluacion+nota;
        }

        System.out.println("la nota media de matrix es "+mediaEvaluacion/3);

        for (int contador = 1; contador <=10 ; contador++) {
            System.out.println(contador);
        }
    }
}
