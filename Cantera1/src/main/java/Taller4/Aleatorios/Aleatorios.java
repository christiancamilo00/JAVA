/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller4.Aleatorios;
import java.util.Random;
/**
 *
 * @author Christian
 */
public class Aleatorios {
      public static void main(String[] args) {
        int indice,num,dato,i,j;
        int[] vector;
        vector = new int[20];
        
           
        for(i =1; f <=19; i ++){
           dato=Math.random(100);
           vector[i]=dato;
           
           num=0;
           if(vector[i]%2==0){
                 System.out.print( vector[i] + " Es par" );
           }
           else{
                 System.out.print( vector[i] + " Es Impar" );
           }
       
        }
        
        
    }
      
}

