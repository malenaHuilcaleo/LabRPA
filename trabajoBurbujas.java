import java.util.Scanner;
public class trabajoBurbujas {
    //modulo devuelve valor aleatorio en un rango dado por el max y minimo
    public static int numAleatorio(int min, int max){
        int numero;
        numero= (int)(Math.random()*(max-min )+min);
        return numero;
    }
     //modulo devuelve color aleatorio
     public static String colorAleatorio(){
        int numColor;
        numColor= numAleatorio(1, 3);
        String color;
        if (numColor==1){
            color= "Celeste";}
        else{
            color ="Rojo";
        } 
        return color;
    }
    public static int comodin(){
        int com, numCom ;
        numCom = numAleatorio(1, 50);
        if (numCom == 1) {
            com = 50;
        }
        else{
            com = 0;
        }
        return com;
    }
    //modulo devuelve puntaje

    public static int calcPunto (String colorA, String colorB, int numA, int numB, int com){
        int puntaje;
        if (colorA==colorB) {
            if (numA==numB){
                puntaje= ((numA+numB)*3+com);
            }
            else{
                puntaje =numA + numB + com;
            }
        }     
        else{
            puntaje=0 + com;
        } 
        return puntaje;
    }
    public static void mostrarResultados (String jugador, String colorA,String colorB, int numA, int numB,int comodin,int puntaje ){
        System.out.println("----------------------------");
        System.out.println("Jugador/a: " + jugador);
        System.out.println("Primer burbuja: " + colorA + " " + numA);
        System.out.println("Segunda burbuja: " + colorB + " " + numB);
        System.out.println("Comodin: " + comodin);
        System.out.println("Puntaje: " + puntaje);
        System.out.println("----------------------------"); 
    }
    public static void main(String []args){
        Scanner teclado = new Scanner(System.in);
        String jugador1, jugador2;

        String colorA1, colorB1, colorA2, colorB2;
        int numA1, numB1, puntaje1,comodinJug1, numA2, numB2, puntaje2,comodinJug2;

        System.out.println ("¡Bienvenido al juego burbujas!");
        
        System.out.println("Ingrese el nombre del primer jugador: ");
        jugador1= teclado.nextLine();

        System.out.println("Ingrese nombre del segundo jugador");
        jugador2=teclado.nextLine();

        //asignar numeros y colores a jugador 1 
        colorA1 = colorAleatorio();
        numA1 = numAleatorio(1, 101);
        colorB1 = colorAleatorio();
        numB1=numAleatorio(1, 101);
        comodinJug1 = comodin();
        puntaje1 = calcPunto(colorA1, colorB1, numA1, numB1, comodinJug1);
        //asignar numeros y colores a jugador 2 
        colorA2 = colorAleatorio();
        numA2 = numAleatorio(1, 101);
        colorB2 = colorAleatorio();
        numB2=numAleatorio(1, 101);
        comodinJug2 = comodin();
        puntaje2 = calcPunto(colorA2, colorB2, numA2, numB2, comodinJug2);
        //resultados
        System.out.println("¡Resultados del juego!");
        mostrarResultados(jugador2, colorA2, colorB2, numA2, numB2, comodinJug2, puntaje2);
        mostrarResultados(jugador1, colorA1, colorB1, numA1, numB1, comodinJug1, puntaje1);
        if (puntaje1 > puntaje2){
            System.out.println("¡El ganador es "+jugador1 +"!"); 
        }else if (puntaje1 < puntaje2){
            System.out.println("¡El ganador es " +jugador2 +"!");;
        }else{
            System.out.println("¡Es un empate, mejor suerte para la proxima!");;
        }
       
     }
}
