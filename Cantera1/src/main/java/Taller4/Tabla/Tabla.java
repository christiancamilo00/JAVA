/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller4.Tabla;

/**
 *
 * @author Christian
 */
public class Tabla {
      public static void main(String[] args) {
        int f,c ;
        int[][] matrz;
        matrz = new int[11][11];
        
           
        for(f =1; f <=10; f ++){
            for(c =1; f <=10; f ++){
            
            matrz[f][c]=c;
            System.out.print( matrz[f][c] + " X "+ f + " " );
         }
            System.out.print(  " " );
        }
        
        
    }
}
