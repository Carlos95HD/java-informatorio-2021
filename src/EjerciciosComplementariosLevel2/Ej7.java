package EjerciciosComplementariosLevel2;

import java.util.ArrayList;
/**
 * Ej7
 */
public class Ej7 {

  public static void main(String[] args) {

    ArrayList<String> fizzBuzzArrayList = fizzBuzzFuncion( 1,6 );
    ArrayList<String> fizzBuzzArrayList2 = fizzBuzzFuncion( 1,8 );

    System.out.println(fizzBuzzArrayList + "\n" + fizzBuzzArrayList2);

  }

  public static ArrayList<String> fizzBuzzFuncion(int n1, int n2) {

    ArrayList<String> numeros = new ArrayList<>();

    for (int i = n1; i < n2; i++) {

      if ( i % 3 == 0 && i % 2 == 0 ) {
        numeros.add("FizzBuzz");
      } else if ( i % 3 == 0 ) {
        numeros.add("Buzz");
      } else if ( i % 2 == 0  ) {
        numeros.add("Fizz");
      } else {
        numeros.add(String.valueOf(i));
      }
    }

    return numeros;
  }
}