public class moduloColores {
    public static void main(String[] args) {
        String colorBurbuja1;
        colorBurbuja1 = colorAleatorio();
        System.out.println(colorBurbuja1);
        System.out.println();

}

public static String colorAleatorio(){
    String color [] = {"Rojo", "Celeste"};
    return color[generarNumAleatorio(0, color.length)];
}

public static int generarNumAleatorio(int min, int max)// este modulo genera un numero aleatorio en un rango dado por los parametros max y min
{
    int numero=0;
    numero= (int)(Math.random()*(max-min)+min);
    return numero;
}
  
}
    
