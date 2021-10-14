package src.EjerciciosComplementariosLevel1;

import java.util.Scanner;

public class Ej7 {
  public static void main(String[] args) {

    String newPalabra = "";
    Scanner scan = new Scanner(System.in);
    System.out.println("Ingrese palabra en mayusculas");
    String palabra = scan.nextLine();
    scan.close();

    for (int i = 0; i < palabra.length(); i++) {
      char letra = palabra.charAt(i);

      if (letra != 'ñ') {
        int letraDec = (int) letra + 32;
        char newLetra = (char) letraDec;
        newPalabra += newLetra;

      } else {
        newPalabra += "ñ";
      }
    }

    System.out.println("\nResultado minusculas");
    System.out.println(newPalabra);
  }
}
