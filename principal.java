import java.util.Scanner;
public class principal {
    //modulo devuelve valor aleatorio en un rango dado por el max y minimo(1 a 10 para numeros, 0 a long de array para colores)
    public static int numAleatorio(int min, int max){
        int numero;
        numero= (int)(Math.random()*(max-min)+min);
        return numero;
    }
     //modulo devuelve color aleatorio
     public static String colorAleatorio(){
        int numColor;
        numColor= numAleatorio(1, 3);
        String color;
        switch(numColor) {
            case 1: color="Celeste";
            break;
            case 2: color= "Rojo";
            break;
            default: color ="error";
        }  
        return color;
    }

    //modulo devuelve puntaje
    public static int calcPunto (String colorA, String colorB, int numA, int numB){
        int puntaje;
        if (colorA==colorB){
            puntaje= numA+numB;
        }
        else{
            puntaje=0;
        } 
        return puntaje;
    }

    public static String calcganador(int punt1, int punt2, String j1, String j2){
        String gan;
    
        if (punt1 > punt2){
            gan=j1;
        }
        else{
            if(punt1 < punt2) {
                gan=j2;
            }
            else {
                gan="¡ambos! fue un empate";
            }
        } 
       
        return gan;
    }

    public static void main(String []args){
        Scanner teclado = new Scanner(System.in);
        String jugador1, jugador2, ganador;

        //variables para jugador 1
        String colorA1, colorB1;
        int numA1, numB1, puntos1;

        //variables para jugador 2
        String colorA2, colorB2;
        int numA2, numB2, puntos2;

        System.out.println ("Bienvenido al juego burbujas!!");
        System.out.println("");
        System.out.println("Ingrese el nombre del primer jugador");
        jugador1= teclado.nextLine();
        System.out.println("Ingrese nombre del segundo jugador");
        jugador2=teclado.nextLine();

        //asignar numeros y colores a jugador 1 y mostrar
        colorA1 = colorAleatorio();
        numA1 = numAleatorio(1, 11);
        colorB1 = colorAleatorio();
        numB1=numAleatorio(1, 11);
        System.out.println("----------------------------");
        System.out.println("Jugador/a: "+jugador1);
        System.out.println("Primer burbuja: "+colorA1 +" " +numA1);
        System.out.println("Segunda burbuja: " +colorB1 +" " +numB1);
        System.out.println("----------------------------");

        //asignar numeros y colores a jugador 2 y mostrar
        colorA2 = colorAleatorio();
        numA2 = numAleatorio(1, 11);
        colorB2 = colorAleatorio();
        numB2=numAleatorio(1, 11);

        System.out.println("Jugador/a: "+jugador2);
        System.out.println("Primer burbuja: "+colorA2 +" " +numA2);
        System.out.println("Segunda burbuja: " +colorB2 +" " +numB2);
        System.out.println("----------------------------");

        //calculo de puntos 
        puntos1 =calcPunto(colorA1, colorB1, numA1, numB1);
        puntos2 = calcPunto(colorA2, colorB2, numA2, numB2);
        ganador = calcganador(puntos1, puntos2, jugador1, jugador2);


        //mostrar puntos
        System.out.println("¡Resultados!");
        System.out.println("Jugador " +jugador1 +" obtuvo " +puntos1 +" puntos");
        System.out.println("Jugador " +jugador2 +" obtuvo " +puntos2 +" puntos");
        System.out.println("El ganador es " +ganador +" felicitaciones");



    }




    



    
}
