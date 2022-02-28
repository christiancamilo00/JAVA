/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller3.FiguraCicloMientras;

/**
 *
 * @author Christian
 */
public class FiguraCicloMientras {
      public static void main(String[] args) {
        int control= 10, control1=1;
      while (control >  1) {
          control1 =1;
           while (control1 <  control) {
           System.out.print("*"); 
           control1  = control1 + 1;
           }
           System.out.println("*"); 
           control  = control - 1;
        } 
      }   
}
