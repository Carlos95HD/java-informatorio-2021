package EjerciciosComplementariosLevel3;

import java.util.List;
import java.util.stream.Collectors;

public class Ej2 {
    public static void main(String[] args) {
        List<Integer> numeros = List.of(1, 2, 3, 4, 5);
        List<Integer> resultadoPotencia = numeros.stream()
                                            .map(numero -> Ej2.calcularPotencia(numero, 2))
                                            .collect(Collectors.toList());
        System.out.println(resultadoPotencia);
    }

    static Integer calcularPotencia(int num, int pot){
        return (int) Math.pow(num,pot);
    }
}