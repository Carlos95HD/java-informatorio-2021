package EjerciciosComplementariosLevel3;

import java.util.List;
import java.util.stream.Collectors;

public class Ej3 {
    public static void main(String[] args) {
        List<String> palabras = List.of("Batman", "Aquaman", "Flash", "Batgirl", "Wonder Woman", "brainiac");
        List<String> resultado = palabras.stream()
                                .map(p -> p.toLowerCase())
                                .filter(p -> p.startsWith("b"))
                                .collect(Collectors.toList());
        System.out.println(resultado.size());
    }
}
