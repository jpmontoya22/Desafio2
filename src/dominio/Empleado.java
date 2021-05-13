package dominio;

public abstract class Empleado {
    private String nombre;
    public Empleado(String nombre){this.nombre = nombre;}

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
    public abstract long calcularSalario();
}
