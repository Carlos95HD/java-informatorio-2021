package EjerciciosComplementariosLevel1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ej3 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Ingrese un numero:");
    int num = scan.nextInt();
    scan.close();

    System.out.println("-------------");
    List<Integer> numeros = new ArrayList<>();
    for (int i = 1; i <= num; i++) {
      numeros.add(i);
      System.out.println(numeros);
    }
  }
}