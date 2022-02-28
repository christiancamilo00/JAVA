/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller2.VideoTienda;

import java.util.Scanner;

/**
 *
 * @author Christian
 */
public class VideoTienda {
    
    public static void main(String[] args) {
          String nompelicula, pelicula1= "Titanic",pelicula2="Spiderman",pelicula3= "Rio",recpelicula;
          int opcion;

        Scanner sc = new Scanner(System.in);
        System.out.println("Tienda Porvenir por favor elija una opcion");
        System.out.println("1. Alquilar pelicula");
        System.out.println("2. Consultar peliculas disponibles");
        System.out.println("3. Recibir pelicula");
        opcion = sc.nextInt();
        
        switch (opcion) {
            case 1:
                 System.out.println("Como te llama la pelicula?");
                 nompelicula = sc.nextLine();
                 break;
             case 2:
                 System.out.println("Las peliculas disponibles son:");
                 System.out.println(pelicula1);
                 System.out.println(pelicula2);
                 System.out.println(pelicula3);
                 break;
             case 3:
                 System.out.println("Por favor ingrese  las novedades de la pelicula");
                 recpelicula = sc.nextLine();
                 break;     
           
        }
        
       
     }
    
}
