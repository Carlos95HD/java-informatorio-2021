package EjerciciosComplementariosLevel3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Ej1 {
    public static void main(String[] args) {
        List<String> palabras = new ArrayList<>();
        palabras.add("Hola");
        palabras.add(null);
        palabras.add("Informatorio");
        palabras.add("");

        List<String> nuevaLista = palabras.stream()
                                .filter(palabra -> palabra != null)
                                .filter(palabra -> !palabra.equals(""))
                                .collect(Collectors.toList());
        System.out.println(nuevaLista);
    }
}