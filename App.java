public class App {
    /*Dentro de App debemos meter todo lo que queremos compilar */


    /*Aqui tenemos la función suma que regresa el resultado de sumar los 3 numeros enteros que se le dan */
    public static int suma(int a, int b, int c){
        int resultado;
        resultado = a +b + c;
        return resultado;
    }

    /*Aqui creamos la clase Auto con sus 4 puertas y su metodo para quitarle una */
    public static class Auto{
        public int puertas = 4;

        public void QuitarPuerta(){
            this.puertas--;
        }
    }

    /*En esta función vamos a corer tanto la función suma como la creacion de nuestro objeto miAuto */

    public static void main(String[] args){
        int resultado_suma;
        resultado_suma = suma(30,20,40);
        System.out.println(resultado_suma);
        Auto miAuto = new Auto();
        miAuto.QuitarPuerta();
        System.out.println(miAuto.puertas);


    }
}
