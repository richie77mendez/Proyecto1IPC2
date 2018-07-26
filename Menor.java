
package menor;

import java.util.Scanner;

/**
 *
 * NOMBRE: augusto ricardo mendez pum
 * CARNE:  201531132
 */
public class Menor {
        static Scanner entrada = new Scanner(System.in);
  
    static int notas[] = new int[4];
  
    public static void main(String[] args) {
     
        for(int cont=0; cont<4; cont++){
            System.out.println("Ingrese la nota: "+ (cont+1));
            notas[cont] = entrada.nextInt();   
        }
        
        int suma = notas[0] + notas[1] + notas[2] + notas[3];
        int promedio = suma/4;
        System.out.println("El promedio es de: " + promedio);
        
            if(promedio<61){
                System.out.println("REPROBDO");
            }else{
                System.out.println("APROBADO");
            }
        
            
        int menor = notas[0];
            for(int cont=1; cont<4; cont++){
                if(menor>notas[cont]){
                    menor = notas[cont];
                }
            }
            
        System.out.println("La nota menor es de: "+menor);
    
    }
    
}
