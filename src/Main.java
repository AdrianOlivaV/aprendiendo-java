public class Main {
    public static void main(String[] args) {
        System.out.println("bien venidos a screen match");
        System.out.println("Pelicula: Matrix");

        int fechaDeLanzamiento = 1999;
        boolean incuidoEnElPlan = true;
        double notaDeLaPelicula = 8.2;

        double media = (8.2 + 6.0 + 9.0 + 7.8 )/ 4;

        System.out.println("calificacion de la pelicula: "+media);
        String sinopsis= """
                Matrix es una paradoja 
                la mejor pelicula del fin del milenio
                fue lanzada en: 
                """ + fechaDeLanzamiento;
        System.out.println(sinopsis);

        int clasificacion = (int) (media/2);
        System.out.println(clasificacion);

       /* ejercicio de practica
       int celcius = 35;
        double fahrenheit = (celcius*1.8)+32;

        System.out.println("la temeperature de " + celcius + " grados celcius, equivale a " + fahrenheit+ " grados fahrenheit");
        */

    };
}