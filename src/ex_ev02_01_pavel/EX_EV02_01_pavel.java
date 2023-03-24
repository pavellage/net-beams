/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex_ev02_01_pavel;
import java.util.*;
/**
 *
 * @author pavel
 */
public class EX_EV02_01_pavel {

    /**
     * @param args the command line arguments
     */
    
    public static int rellenaPares(int[] tabla){
        Scanner sc= new Scanner(System.in);
     System.out.println("introduce un numero");
     
        int numero;
        int contador_impares=0;
       
        for (int i = 0; i < tabla.length; i++) {//si es impar lo cuenta
            numero=sc.nextInt(); 
            if(numero%2!=0){
                i=i-1;
                contador_impares=contador_impares+1;
            }else{// si es par lo añade a la tabla
            tabla[i]=numero;
            }
        }
        return(contador_impares);
        }
    public static void main(String[] args) {
        
    /**
     *
     */
    Scanner sc= new Scanner(System.in);
     System.out.println("introduce la longitud de la tabla");
     
        int longi=sc.nextInt();
        int[] tabla = new int[longi];
        
        System.out.println("Numero de impares " + rellenaPares(tabla));
        
        
      
    
    }
    
}
