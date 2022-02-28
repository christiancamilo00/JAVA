/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller4.Matrz;

/**
 *
 * @author Christian
 */
public class Matrz {
     public static void main(String[] args) {
        int f,c,num ;
        int[][] matrz;
        matrz = new int[4][5];
        
        num=0;
                
        for(f =0; f <=3; f ++){
            for(c =0; f <=4; f ++){
            num=num+1;
            matrz[f][c]=num;
            System.out.print( matrz[f][c] + " " );
         }
        }
        
        
    }
}
