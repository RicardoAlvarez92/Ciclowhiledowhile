package com.generation;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// Ciclo While

        /*Scanner sc = new Scanner(System.in);
        System.out.println("Adivina el numero secreto. ingresa un numero");
        int numero = sc.nextInt();
        int numerosecreto = 33;

        while(numero !=numerosecreto){
            System.out.println("Adivina el numero secreto. ingresa un numero");
            numero = sc.nextInt();
        }*/



        Scanner sc = new Scanner(System.in);

        int numero = sc.nextInt();
        int numerosecreto = 33;

        do{
            System.out.println("Adivina el numero secreto. ingresa un numero");
            numero = sc.nextInt();

        } while(numero != numerosecreto);
        sc.close();
        System.out.println("Felicidades adivinaste el numero secreto");

    }

}
