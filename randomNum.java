public class randomNum {
    public static void main(String[] args) {
        
         int n1;
         n1= generarNumAleatorio(1, 11);
         System.out.println("numero aleatorio generado " +n1);



}
    public static int generarNumAleatorio(int min, int max){
        int numero=0;
        numero= (int)(Math.random()*(max-min)+min);//genera un numero aleatorio en un rango de diez numeros comenzando desde 1
        return numero;
    }
}
    

