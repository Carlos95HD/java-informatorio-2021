package EjerciciosComplementariosLevel1;

import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) throws Exception {
      Scanner consola = new Scanner(System.in);

      System.out.println("Ingrese Nombre: ");
      String nombre = consola.nextLine();

      System.out.println("Hola " + nombre);

      consola.close();
    }
}