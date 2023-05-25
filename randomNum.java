public class randomNum {
    public static void main(String[] args) {
        
         int n1;
         n1= generarNumAleatorio();
         System.out.println("numero aleatorio generado " +n1);



}
    public static int generarNumAleatorio(){
        int numero=0;
        numero= (int)(Math.random()*10+1);//genera un numero aleatorio en un rango de diez numeros comenzando desde 1
        return numero;
    }
}
    

