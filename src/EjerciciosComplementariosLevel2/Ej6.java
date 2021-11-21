package EjerciciosComplementariosLevel2;

import java.util.*;
import java.util.Map.Entry;

public class Ej6 {
  public static void main(String[] args) {

    HashSet<Empleado> empleados = new HashSet<>();
    HashMap<Integer, Float> sueldos = new HashMap<>();

    empleados.add(new Empleado("Carlos", 44421331, 5, 300));
    empleados.add(new Empleado("Juan", 32321443, 8, 200));
    empleados.add(new Empleado("Marcos", 4232123, 7, 400));

    for (Empleado empl : empleados) {
      sueldos.put(empl.dni, empl.getSueldo());
    }

    for (Entry<Integer, Float> sueldoEmpl : sueldos.entrySet()) {
      System.out.println( "Dni: " + sueldoEmpl.getKey() + ", " + "sueldo: " + sueldoEmpl.getValue());

    }

  }
}
