public class Producto {
    private String codigo;
    private String descripcion;
    private double precio;

    public Producto(String codigo, String descripcion, double precio) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    // Getters
    public String getCodigo() {
        return codigo;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public double getPrecio() {
        return precio;
    }

    // Setters
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    // Mostrar datos
    public String mostrarDatos() {
        return "Código: " + getCodigo() + ", descripción: " + getDescripcion() + ", precio: " + getPrecio();
    }
}