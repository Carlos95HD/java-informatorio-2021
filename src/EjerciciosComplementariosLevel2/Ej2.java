package EjerciciosComplementariosLevel2;

import java.util.ArrayList;
import java.util.Scanner;

public class Ej2 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    ArrayList<Integer> numList = new ArrayList<Integer>();
    ArrayList<Integer> numList2 = new ArrayList<Integer>();
    Integer num;
    Integer num1;
    Integer num2;

    System.out.println("------ Ingrese numeros ------");
    while ( numList.size() < 5 ) {
      num = scan.nextInt();
      numList.add(num);
    }
    System.out.println(numList);

    System.out.println("------ Ingrese numero para 1º posicion ------");
    num1 = scan.nextInt();

    System.out.println("------ Ingrese numero para ultima posicion ------");
    num2 = scan.nextInt();
    scan.close();

    numList2.add(num1);
    numList2.addAll(numList);
    numList2.add(num2);

    System.out.println(numList2);
  }
}
