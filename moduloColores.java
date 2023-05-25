public class moduloColores {
    public static void main(String[] args) {
        String colorBurbuja1;
        colorBurbuja1 = colorAleatorio();
        System.out.println(colorBurbuja1);

}

public static String colorAleatorio(){
    String color [] = {"Rojo", "Celeste"};
    return color[generarNumAleatorio(0, color.length)];
}

public static int generarNumAleatorio(int min, int max){
    int numero=0;
    numero= (int)(Math.random()*(max-min)+min);//genera un numero aleatorio en un rango de diez numeros comenzando desde 1
    return numero;
}
  
}
    
