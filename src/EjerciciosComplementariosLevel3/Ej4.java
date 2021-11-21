package EjerciciosComplementariosLevel3;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

public class Ej4 {
    public static void main(String[] args) {
        List<Integer> palabras = List.of(1, 2, 4, 4, 4);
        List<Long> resultado = palabras.stream()
                                .distinct()
                                .map(num -> obtenerFactorial(num))
                                .collect(Collectors.toList());
        System.out.println(resultado);
    }

    static long obtenerFactorial(int n) {
        return LongStream.rangeClosed(1, n)
            .reduce(1, (long x, long y) -> x * y);
    }
}
