package src.EjerciciosComplementariosLevel1;

import java.util.Scanner;

public class Ej2 {
  public static void main(String[] args) {

    Scanner consola = new Scanner(System.in);

    System.out.println("Ingrese Primer Numero: ");
    int num1 = consola.nextInt();

    System.out.println("Ingrese Segundo Numero: ");
    int num2 = consola.nextInt();

    int suma = num1 + num2;
    int resta = num1 - num2;
    int mult = num1 * num2;
    int div = num1 / num2;
    int modulo = num1 % num2;

    System.out.println(num1 + " + " + num2 + " = " + suma);
    System.out.println(num1 + " - " + num2 + " = " + resta);
    System.out.println(num1 + " * " + num2 + " = " + mult);
    System.out.println(num1 + " / " + num2 + " = " + div);
    System.out.println(num1 + " % " + num2 + " = " + modulo);

    consola.close();
  }
}