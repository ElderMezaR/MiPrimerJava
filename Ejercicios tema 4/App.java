import javax.print.DocFlavor.STRING;

public class App {
    /*Dentro de App debemos meter todo lo que queremos compilar */


    /* */

    public static void main(String[] args){
        /* En esta parte usamos la condición "if" */
        int numerolf;
        numerolf = 0;
        if (numerolf < 0){
            System.out.println("Tu número es negativo");
        } else if (numerolf > 0){
            System.out.println("Tu número es positivo");
        } else {
            System.out.println("Tu número es 0");
        }

        /*Por aquí estamos usando el bucle "While" */
        int numeroWhile;
        numeroWhile = 0;
        while (numeroWhile < 3){
            System.out.println("Tu variable vale: " + numeroWhile);
            numeroWhile = numeroWhile + 1;
        }

        /*Esta parte hace lo mismo que el while de arriba pero solo se corre una vez, usamos "do while" */
        numeroWhile = 0;
        do{
            System.out.println("Tu variable vale: " + numeroWhile);
            numeroWhile = numeroWhile + 3;
        } while(numeroWhile < 3);

        /*Los "for" son mi tipo de loop favorito */

        for(int numeroFor = 0; numeroFor <= 3; numeroFor++){
            System.out.println(numeroFor);
        }
        
        /* Aquí tenemos un interruptor o "Switch" */
        String estacion;
        estacion = "Otoño";
        switch(estacion){
            case "Primavera":
                System.out.println("Estamos en " + estacion);
                break;
            case "Verano":
                System.out.print("Estamos en " + estacion);
                break;
            case "Otoño":
                System.out.println("Estsamos en " + estacion);
                break;
            case "Invierno":
                System.out.println("Estamos en " + estacion);
            default:
                System.out.println("Esto no es una estación...");
        }


    }
}
