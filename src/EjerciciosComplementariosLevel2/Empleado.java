package src.EjerciciosComplementariosLevel2;

public class Empleado {
    String nombre;
    Integer dni;
    float horasTrabajadas;
    float valorHora;
  
    public Empleado(String nombre, int dni, float horasTrabajadas, float valorHora) {
      this.nombre = nombre;
      this.dni = dni;
      this.horasTrabajadas = horasTrabajadas;
      this.valorHora = valorHora;
    }
  
    public float getSueldo() {
      return this.horasTrabajadas * this.valorHora;
    }
}
