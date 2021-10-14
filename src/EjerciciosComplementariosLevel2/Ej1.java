package src.EjerciciosComplementariosLevel2;

import java.util.ArrayList;
import java.util.Scanner;

public class Ej1 {
  public static void main(String[] args) {
    ArrayList<String> ciudades = new ArrayList<String>();
    String ciudad;

    Scanner scan = new Scanner(System.in);

    System.out.println("------ Ingrese Ciudades ------");
    while ( ciudades.size() < 3 ) {
      ciudad = scan.nextLine();
      ciudades.add(ciudad);
    }

    System.out.println("------ Output ------");
    for (int i=0;i<ciudades.size();i++) {
      System.out.println( "#" + (i + 1) + " - " + ciudades.get(i));
    }
    scan.close();
  }
}