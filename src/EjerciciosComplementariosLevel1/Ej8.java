package EjerciciosComplementariosLevel1;

import java.util.Scanner;

public class Ej8 {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    System.out.println("---- Ingrese nombre y apellido ----");
    String nombreApellido = scan.nextLine(); 

    System.out.println("---- Ingrese edad ----");
    String edad = scan.nextLine();

    System.out.println("---- Ingrese direccion ----");
    String direccion = scan.nextLine(); 

    System.out.println("---- Ingrese ciudad ----");
    String ciudad = scan.nextLine();
    scan.close();

    System.out.println("------------------");
    System.out.println(
      ciudad+ " - " + 
      direccion + " - " +
      edad + " - " +
      nombreApellido
    );

  }
}
