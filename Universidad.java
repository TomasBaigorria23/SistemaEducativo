import java.util.ArrayList;
import java.util.List;

public class Universidad {
    private List<MiembroUniversidad> miembros;

    public Universidad() {
        miembros = new ArrayList<>();
    }

    public void agregarMiembro(MiembroUniversidad miembro) {
        miembros.add(miembro);
    }

    public void listarMiembros() {
        System.out.println("=== Lista de miembros de la universidad ===");
        for (MiembroUniversidad m : miembros) {
            System.out.println(m.obtenerRol() + " -> " + m.obtenerInformacionCompleta());
        }
    }

    public void listarPorRol(String rol) {
        System.out.println("=== Miembros con rol: " + rol + " ===");
        for (MiembroUniversidad m : miembros) {
            if (m.obtenerRol().equalsIgnoreCase(rol)) {
                System.out.println(m.obtenerInformacionCompleta());
            }
        }
    }
}

