public class ProductoOficina extends Producto {
    private String proveedor;

    public ProductoOficina(String codigo, String descripcion, double precio, String proveedor) {
        super(codigo, descripcion, precio);
        this.proveedor = proveedor;
    }

    // Getters
    public String getProveedor() {
        return proveedor;
    }
    // Setters
    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    // Mostrar datos
    @Override
    public String mostrarDatos() {
        return "Oficina: " + getDescripcion() + " - Proveedor: " + getProveedor() + " - Precio: " + getPrecio();
    }
}