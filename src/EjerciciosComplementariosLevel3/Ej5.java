package EjerciciosComplementariosLevel3;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Ej5 {
    public static void main(String[] args) {
        List<Alumno> alumnos = List.of(
            new Alumno("Homero", "Simpson", LocalDate.now().minusYears(30)),
            new Alumno("Bart", "Simpson", LocalDate.parse("1999-10-22")),
            new Alumno("Lisa", "Simpson", LocalDate.parse("2001-10-12")),
            new Alumno("Marge", "Simpson", LocalDate.of(1980, 02, 17)),
            new Alumno("Maggie", "Simpson", LocalDate.of(2010, 05, 22))
        );
        Map<String, Integer> lista = alumnos.stream()
                                    .collect(Collectors.toMap(a -> ( a.getApellido()+ " " + a.getNombre()),
                                    p -> (obtenerEdad(p.fechaDeNacimiento)) ));
        System.out.println(lista);
    }

    public static int obtenerEdad(LocalDate fecha) {
        return Period.between(
            fecha,
            LocalDate.now()
        ).getYears();
    }
}
