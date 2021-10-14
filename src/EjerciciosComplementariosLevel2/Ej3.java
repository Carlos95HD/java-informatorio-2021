package src.EjerciciosComplementariosLevel2;

import java.util.Arrays;
import java.util.List;
import java.util.Collections;

public class Ej3 {
  public static void main(String[] args) {
    
    Integer[] cartas = {1,2,3,4,5,6,7,8,9,10,11};
    List<Integer> baraja = Arrays.asList(cartas);

    System.out.println("------ Baraja normal ------");
    for (int i = 0; i < baraja.size(); i++) {
      System.out.println(baraja.get(i));
    }
    
    Collections.reverse(baraja);
    System.out.println("------ Baraja inversa ------");
    for (int i = 0; i < baraja.size(); i++) {
      System.out.println(baraja.get(i));
    }

    Collections.shuffle(baraja);
    System.out.println("------ Baraja desordenada ------");
    for (int i = 0; i < baraja.size(); i++) {
      System.out.println(baraja.get(i));
    }

  }

}
