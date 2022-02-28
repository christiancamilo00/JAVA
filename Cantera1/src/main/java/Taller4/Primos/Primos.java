/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller4.Primos;

import java.util.Scanner;

/**
 *
 * @author Christian
 */
public class Primos {
     public static void main(String[] args) {
        int indice ,num,dato,n,i;
        
        
        for(n =1; n <=100; n ++){
            num=0;
           for(i=1;i<=n;){
               if(n%i==0){
                   num=num+1;
               }
               
           }
           if(num==2){
               System.out.println( n + " Es primo");
           }
           else
           {
               System.out.println( n + "No es primo");
           }
            
        }
        
        
    }
    
}
