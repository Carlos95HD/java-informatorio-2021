package EjerciciosComplementariosLevel2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ej4 {
  public static void main(String[] args) {
    List<String> curso1List = new ArrayList<>();
    List<String> curso2List = new ArrayList<>();
    List<String> curso3List = new ArrayList<>();

    String[] alumnos = {
      "Carlos",
      "Belen",
      "Lourdes",
      "Jorge",
      "Juan",
      "Ernesto",
      "Marcos",
      "Daniel",
      "Ezequiel",
      "Gerardo",
      "Laura",
      "Sofia",
    };

    List<String> listaAlumnos = Arrays.asList(alumnos);
    
    curso1List = listaAlumnos.subList(0, 4);
    curso2List = listaAlumnos.subList(4, 8);
    curso3List = listaAlumnos.subList(8, 12);

    System.out.println("Curso 1: " + curso1List);
    System.out.println("Curso 2: " + curso2List);
    System.out.println("Curso 3: " + curso3List);
  }
}
