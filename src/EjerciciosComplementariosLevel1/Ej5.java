package src.EjerciciosComplementariosLevel1;

import java.util.Scanner;

/**
 * Ej5
 */
public class Ej5 {
  
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Ingrese el primer numero");
    int num1 = scan.nextInt();

    System.out.println("Ingrese el segundo numero");
    int num2 = scan.nextInt();
    scan.close();


    if (num1 > 0 && num2 > 0) {
      int mult = num1 * num2;
      System.out.println(num1 + " x " + num2 + " = " + mult);
    } else {
      System.out.println("El numero ingresado no es mayo a cero");
    }

  }
}