public class Deciciones {
    public static void main(String[] args) {
        int fechaDeLanzamiento = 1999;
        boolean incuidoEnElPlan = true;
        double notaDeLaPelicula = 8.2;
        String tipoPlan = "plus";

//  Código que prueba los operadores relacionales

//        if (fechaDeLanzamiento > 2020){
//            System.out.println("peliculas mas recientes");
//        }else{
//            System.out.println("peliculas retro que aun valen la pena ver");
//
//        }

// probando el operador logico OR

//        if (incuidoEnElPlan || tipoPlan.equals("plus")){
//            System.out.println("disfrute de su pelicula");
//        }else {
//            System.out.println("pelicula no disponible para su plan actual");
//        }

// Probando el operador &&
        if (incuidoEnElPlan && tipoPlan.equals("plus")){
              System.out.println("disfrute de su pelicula");
          }else {
              System.out.println("pelicula no disponible para su plan actual");
          }

    }
}
