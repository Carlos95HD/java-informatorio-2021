package EjerciciosComplementariosLevel2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ej5 {
  public static void main(String[] args) {

    int sumaTotal = 0;
    List<Integer> totalList = new ArrayList<>();

    Integer horas[] = {6, 7, 8, 4, 5};
    Integer valor[] = {350, 345 , 550, 600, 320};

    List<Integer> valorPorHoraList = Arrays.asList(horas);
    List<Integer> horasTrabajadasList = Arrays.asList(valor);

    for (int i = 0; i < horasTrabajadasList.size(); i++) {
      Integer suma = horasTrabajadasList.get(i) * valorPorHoraList.get(i);
      totalList.add(suma);
    }

    for (Integer total : totalList) {
      sumaTotal += total;
    }

    System.out.println(totalList);
    System.out.println("Total Final: $" + sumaTotal);
  }

}
