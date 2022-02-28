/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller3.ArbolCicloRepetir;

/**
 *
 * @author Christian
 */
public class ArbolCicloRepetir {
      public static void main(String[] args) {
        int incremento=1, incremento1=10, incremento2;
        
        do{
            System.out.print("+"); 
             incremento = incremento + 1;
            do{
                System.out.print("*"); 
                incremento1 = incremento1 - 1;
                }while(incremento1<=1); 
                }while(incremento>=10);
                    
                
       
            
      } 
    
}
