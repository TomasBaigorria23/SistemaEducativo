import java.time.LocalDate;

public class main {
    public main(String[] args) {
        Profesor prof1 = new Profesor("Carlos", "Pérez", 45, "12345678", "Matemática", 15);
        Materia mat1 = new Materia("Álgebra", prof1);
        prof1.asignarMateria(mat1);

        Estudiante est1 = new Estudiante("Ana", "López", 20, "56789012", "Ingeniería", 8.5);
        est1.agregarMateria(mat1);

        Personal pers1 = new Personal("Laura", "Martínez", 38, "33445566", "Administración", "Secretaria", LocalDate.of(2018, 3, 12));

        Universidad uni = new Universidad();
        uni.agregarMiembro(prof1);
        uni.agregarMiembro(est1);
        uni.agregarMiembro(pers1);

        // Mostrar todos los miembros
        uni.listarMiembros();

        // Filtrar por rol
        System.out.println();
        uni.listarPorRol("Estudiante");
    }
}
