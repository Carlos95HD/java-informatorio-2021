package src.EjerciciosComplementariosLevel1;

import java.util.Scanner;

public class Ej4 {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    System.out.println("Ingrese el numero a calcular");
    int numero = scan.nextInt();
    scan.close();
    System.out.println( "El factorial de " + numero + " es: " + factorial( numero ) );  
  }

  public static double factorial(double numero) {
    if (numero == 0)
      return 1;
    else
      return numero * factorial(numero - 1);
  }
}