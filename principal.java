import java.util.Scanner;
public class principal {
    public static String colorAleatorio(){
        String color [] = {"Rojo", "Celeste"};
        return color[numAleatorio(0, color.length)];
    }
    
    public static int numAleatorio(int min, int max){
        int numero=0;
        numero= (int)(Math.random()*(max-min)+min);//genera un numero aleatorio en un rango de diez numeros comenzando desde 1
        return numero;
    }




    public static void main(String []args){
        Scanner teclado = new Scanner(System.in);
        String jugador1, jugador2;

        //variables para jugador 1
        String colorA1, colorB1;
        int numA1, numB1, puntos1;

        //variables para jugador 2
        //String colorA2, colorB2;
        //int numA2, numB2, puntos2;

        System.out.println ("Bienvenido al juego burbujas!!");
        System.out.println("Ingrese el nombre del primer jugador");
        jugador1= teclado.nextLine();
        System.out.println("Ingrese nombre del segundo jugador");
        jugador2=teclado.nextLine();

        //asignar numeros y colores a jugador 1
        colorA1 = colorAleatorio();
        numA1 = numAleatorio(1, 11);
        colorB1 = colorAleatorio();
        numB1=numAleatorio(0, 11);

        System.out.println("Primer burbuja: "+colorA1 +" "+numA1);
        System.out.println("Segunda burbuja: " +colorB1 +" "+numB1);

    }




    



    
}
