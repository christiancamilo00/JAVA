/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller3.CicloMenu;

import java.util.Scanner;

/**
 *
 * @author Christian
 */
public class CicloMenu {
     public static void main(String[] args) {
        int  control;
        
        do{
            Scanner sc = new Scanner(System.in);
            System.out.print("Menu Usuario"); 
            System.out.print("1.Captura nombre"); 
            System.out.print("2.Saludar persona"); 
            System.out.print("3.Salir del sistema"); 
            control = sc.nextInt();
            }while(control<3);
                    
                
       
            
      } 
}
