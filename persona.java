
public class persona {
    private String nombre;
    private String apellido;
    private int edad;
    private String documento;

    public persona(String nombre, String apellido, int edad, String documento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.documento = documento;
    }

    // Getters y Setters
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getApellido() { return apellido; }
    public void setApellido(String apellido) { this.apellido = apellido; }

    public int getEdad() { return edad; }
    public void setEdad(int edad) { this.edad = edad; }

    public String getDocumento() { return documento; }
    public void setDocumento(String documento) { this.documento = documento; }

    @Override
    public String toString() {
        return nombre + " " + apellido + " (DNI: " + documento + ", Edad: " + edad + ")";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof persona)) return false;
        persona p = (persona) o;
        return documento.equals(p.documento);
    }

    @Override
    public int hashCode() {
        return documento.hashCode();
    }
}
