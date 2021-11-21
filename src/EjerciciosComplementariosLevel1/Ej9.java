package EjerciciosComplementariosLevel1;

import java.util.Scanner;

public class Ej9 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("----- Ingrese Frase ----- ");
    String frase = scan.nextLine();

    System.out.println("----- Ingrese Letra a buscar ----- ");
    String letra = scan.nextLine();
    scan.close();

    int acumulador = 0;

    for (int i = 0; i < frase.length(); i++) {

      char caracter = frase.charAt(i);
      if ( caracter == letra.charAt(0) ) {
        acumulador += 1;
      }
    }

    System.out.println("Veces que aparece la letra: " + letra);
    System.out.println(acumulador);
  }
}
