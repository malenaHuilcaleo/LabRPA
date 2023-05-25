public class puntos {

    public static void main (String []args)
    {
        String color1 = "Celeste";
        String color2 ="Celeste";
        int num1 = 9;
        int num2= 3;
        int puntos;

        puntos =calcPunto(color1,color2,num1,num2);
        System.out.println(puntos);
    }

//modulo para calcular puntos
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
    
}
