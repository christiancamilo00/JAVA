/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller2.SecSalud;

import java.util.Scanner;

/**
 *
 * @author Christian
 */
public class SecSalud {
      public static void main(String[] args) {
        String nombre, apellido;
	float peso,estatura,imc;
	


        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor ingrese su nomnbre");
        nombre = sc.nextLine();
        System.out.println("Por favor ingrese su apellido");
        apellido = sc.nextLine();
        System.out.println("Por favor ingrese su peso en kilos");
        peso = sc.nextFloat();
        System.out.println("Por favor ingrese su estatura en metros");
        estatura = sc.nextFloat();
        
        imc = peso /(estatura*estatura);
          System.out.println(imc);
        if(imc <= 18.5){
        System.out.println("Usted se encuentra en bajo peso");
        }
        else if(imc >= 18.5 & imc <= 24.9) {
            System.out.println("Usted se encuentra en el peso normal");
            }
         else if(imc >= 25 & imc <= 29.9) {
            System.out.println("Usted se encuentra en sobrepeso");
            }
         else if(imc >= 30) {
            System.out.println("Usted se encuentra en obesidad");
            }
    }
  }
