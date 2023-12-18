/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package enclase.ej5bdanielnavarro;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author daniel
 */
public class Ej1 {

    public static void main(String[] args) {
        Random aleatorio = new Random();
        
        double[] arrayDouble=new double[15];
        Arrays.fill(arrayDouble, 7.5);
        
       double[] copiaArrayDouble=Arrays.copyOf(arrayDouble, arrayDouble.length);
        System.out.println("mostrar arrayDouble");
        System.out.println(Arrays.toString(arrayDouble));
        System.out.println("Ahora la copia");
        System.out.println(Arrays.toString(copiaArrayDouble));
        System.out.println("son iguales?: " + Arrays.equals(arrayDouble, copiaArrayDouble));
        
        System.out.println("cambiar un valor por 6.3");
        arrayDouble[aleatorio.nextInt(arrayDouble.length)]=6.3;
        
         System.out.println("mostrar arrayDouble");
        System.out.println(Arrays.toString(arrayDouble));
        System.out.println("Ahora la copia");
        System.out.println(Arrays.toString(copiaArrayDouble));
        System.out.println("son iguales?: " + Arrays.equals(arrayDouble, copiaArrayDouble));
        
        
        int[] arraInt = new int[100];
        arraInt= ej2(arraInt);
        System.out.println(Arrays.toString(arraInt));
        Arrays.sort(arraInt);
        System.out.println("Array ordenado" + Arrays.toString(arraInt));
        
        Scanner preguntar = new Scanner(System.in);
        System.out.println("introduce numero a buscar");
        int numero = preguntar.nextInt();
        preguntar.nextLine();
        System.out.println("esta en la posicion "+Arrays.binarySearch(arraInt, numero));
        
    }
    
    
    public static int[] ej2(int[] arrayInt){
        Random aleatorio = new Random();
        for(int i=0;i<arrayInt.length;i++){
            arrayInt[i]=aleatorio.nextInt(10,101);
        }
        
        return arrayInt;
    }
}
