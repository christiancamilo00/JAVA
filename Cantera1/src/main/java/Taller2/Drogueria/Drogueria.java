/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller2.Drogueria;

import java.util.Scanner;

/**
 *
 * @author Christian
 */
public class Drogueria {
     public static void main(String[] args) {
        String producto ;
	String tproducto ;
	int cproducto ;
	int pproducto ;
	int opcion;
	String producto1 = "Compuatores" ;
	String producto2 = "Televisores";
	String producto3 = "Tabletas";
	int pproducto1 = 4500000;
	int pproducto2 = 2000000;
	int pproducto3 = 800000;
	String devolucion ;
	String mdevolucion ;


        Scanner sc = new Scanner(System.in);
        System.out.println("Drogueria Mi Salud por favor elija una opcion");
        System.out.println("1. Compra Producto");
        System.out.println("2. Consultar de precios producto");
        System.out.println("3. Devolucion producto");
        System.out.println("4. Salir");
        opcion = sc.nextInt();
        
        switch (opcion) {
            case 1:
                 System.out.println("Nombre del producto?");
                 producto = sc.nextLine();
                 System.out.println("Tipo de producto?");
                 tproducto = sc.nextLine();
                 System.out.println("Cantidad de producto?");
                 cproducto = sc.nextInt();
                 System.out.println("Precio del producto?");
                 pproducto = sc.nextInt();
                 break;
             case 2:
                 System.out.println("Las productos disponibles con sus precios son");
                 System.out.println(producto1 + " Precio " + pproducto1);
                 System.out.println(producto2 + " Precio " + pproducto2);
                 System.out.println(producto3 + " Precio " + pproducto3);
                 break;
             case 3:
                 System.out.println("Por favor ingrese  el producto a devolver");
                 devolucion = sc.nextLine();
                 System.out.println("Por favor ingrese  el motivo de la devolucio");
                 mdevolucion = sc.nextLine();
                 break;     
             case 4:
                   break;      
        }
        
       
     }
    
}
