/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller2.Area;

import java.util.Scanner;

/**
 *
 * @author Christian
 */
public class Area {
     public static void main(String[] args) {
     	int largor;
	int anchor;
	int rec;
	int baset;
	int alturat;
	float tria;
	int opcion;
	int baseme;
	int basema;
	int alturatr;
	float trap;

        Scanner sc = new Scanner(System.in);
        System.out.println("Calculo del area de figuras geometricas, por favor elija una opcion");
        System.out.println("1. Rectangulo");
        System.out.println("2. Triangulo");
        System.out.println("3. Trapecio");
        System.out.println("4. Salir");
        opcion = sc.nextInt();
        
        switch (opcion) {
            case 1:
                 System.out.println("Largo del rectangulo?");
                 largor = sc.nextInt();
                 System.out.println("Ancho del rectangulo?");
                 anchor = sc.nextInt();
                 rec = largor*anchor;
                 System.out.println("El area del rectangulo es " + rec);
                 
                 break;
             case 2:
                 System.out.println("Base del triangulo?");
                 baset = sc.nextInt();
                 System.out.println( "Altura del triangulo ?");
                 alturat = sc.nextInt();
                 tria = (baset*alturat)/2;
                 System.out.println( "El area del triangulo es " + tria);
                 break;
             case 3:
                 System.out.println("Base menor del trapesio?");
                 baseme = sc.nextInt();
                 System.out.println("Base mayor del trapesio ?");
                 basema = sc.nextInt();
                 System.out.println("Altura del trapesio ?");
                 alturatr = sc.nextInt();
                 trap = ((basema+baseme)/2*alturatr);
                 System.out.println("El area del trapesio es " + trap);
                 break;     
             case 4:    
                 break;     
        }
        
       
     }
    
}
