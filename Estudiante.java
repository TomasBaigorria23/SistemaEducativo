import java.util.ArrayList;
import java.util.List;

public class Estudiante extends persona implements MiembroUniversidad {
    private String carrera;
    private double promedio;
    private List<Materia> materias;

    public Estudiante(String nombre, String apellido, int edad, String documento, 
                      String carrera, double promedio) {
        super(nombre, apellido, edad, documento);
        this.carrera = carrera;
        this.promedio = promedio;
        this.materias = new ArrayList<>();
    }

    public String getCarrera() { return carrera; }
    public void setCarrera(String carrera) { this.carrera = carrera; }

    public double getPromedio() { return promedio; }
    public void setPromedio(double promedio) { this.promedio = promedio; }

    public List<Materia> getMaterias() { return materias; }

    public void agregarMateria(Materia materia) {
        materias.add(materia);
    }

    @Override
    public String obtenerRol() {
        return "Estudiante";
    }

    @Override
    public String obtenerInformacionCompleta() {
        return toString();
    }

    @Override
    public String toString() {
        return super.toString() + " | Carrera: " + carrera + " | Promedio: " + promedio;
    }
}
